package elevator.challenge.model;

import elevator.challenge.exception.WrongFloorException;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Floor {
    private final int firsrtFloor = 0;
    private final int lastFloor = 55;
    private final int officeFloor = 35;

    @NonNull private int currentFloor;
    private int destinationFloor;

    public int getCurrentFloor() throws WrongFloorException {
        if(currentFloor < firsrtFloor || currentFloor > lastFloor){
            throw new WrongFloorException(currentFloor);
        }
        return currentFloor;
    }

    public int getDestinationFloor() throws WrongFloorException{
        if(destinationFloor < firsrtFloor || destinationFloor > lastFloor){
            throw new WrongFloorException(destinationFloor);
        }
        return destinationFloor;
    }
}
