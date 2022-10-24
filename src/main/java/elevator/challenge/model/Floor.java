package elevator.challenge.model;

import elevator.challenge.exception.WrongFloorNrException;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Floor {
    private final int firsrtFloor = 0;
    private final int lastFloor = 55;
    private final int officeFloor = 35;

    private final List<Integer> floorList = new ArrayList<>();

    private int currentFloor;
    private int destinationFloor;

    public int getCurrentFloor () {
        if (currentFloor < firsrtFloor || currentFloor > lastFloor)
            try {
                throw new WrongFloorNrException(currentFloor);
            } catch (WrongFloorNrException e) {
                e.printStackTrace();
            }
        return currentFloor;
    }

    public int getDestinationFloor () {
        if (destinationFloor < firsrtFloor || destinationFloor > lastFloor)
            try {
                throw new WrongFloorNrException(destinationFloor);
            } catch (WrongFloorNrException e) {
                e.printStackTrace();
            }
        return destinationFloor;
    }

    public List<Integer> getFloorList () {
        for (int i = firsrtFloor; i <= lastFloor; i++) {
            floorList.add(i);
        }
        return floorList;
    }
}
