package elevator.challenge.model;

import elevator.challenge.model.destinstion.down.Down;
import elevator.challenge.model.destinstion.up.Up;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Elevator {
    private int elevatorsFloor;
    private int currentFloor;
    private int destinationFloor;
    private boolean availability;
    private String direction;

    public void chooseDirection(String direction){
        if(direction.equals("UP")){
            new Up().floor(currentFloor, destinationFloor);
        } else if(direction.equals("DOWN")){
            new Down().floor(currentFloor, destinationFloor);
        }
    }

    public boolean isElevatorOnTheCurrentFloor(int currentFloor){
        if(currentFloor == elevatorsFloor){
            return true;
        }
        return false;
    }
}
