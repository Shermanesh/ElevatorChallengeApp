package elevator.challenge.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Elevator extends Thread {
    private Floor floor;
    private Button button;
    private int elevatorsFloor;
    private int currentFloor;
    private int destinationFloor;
    private boolean availability;

    public Elevator(int elevatorsFloor, Floor floor) {
        this.elevatorsFloor = elevatorsFloor;
        this.floor = floor;
        currentFloor = floor.getCurrentFloor();
        destinationFloor = floor.getDestinationFloor();
    }

    @SneakyThrows
    @Override
    public void run() {
        if (this.getDirection().equals("UP")) {
            for (int i = elevatorsFloor; i <= destinationFloor; i++) {
                Thread.sleep(1000);
                System.out.println("Floor: " + i);

                if ((i != elevatorsFloor) && (i == currentFloor)) {
                    System.out.println("Your elevator is here: " + i);
                }
            }
        } else if (this.getDirection().equals("DOWN")){
            for (int i = elevatorsFloor; i >= destinationFloor; i--) {
                Thread.sleep(1000);
                System.out.println("Floor: " + i);

                if ((i != elevatorsFloor) && (i == currentFloor)) {
                    System.out.println("Your elevator is here: " + i);
                }
            }
        }
    }

    public String getDirection() {
        if (currentFloor < destinationFloor) {
//            new Up().floor(currentFloor, destinationFloor);
            return "UP";
        } else if (currentFloor > destinationFloor) {
//            new Down().floor(currentFloor, destinationFloor);
            return "DOWN";
        } else {
            return "It is your floor: " + currentFloor;
        }
    }

    public boolean isElevatorOnTheCurrentFloor() {
        return currentFloor == elevatorsFloor;
    }
}
