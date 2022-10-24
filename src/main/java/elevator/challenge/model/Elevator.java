package elevator.challenge.model;

import elevator.challenge.viewing.StartFrame;
import lombok.*;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Elevator extends Thread {
    private Map<Elevator, Boolean> elevators;

    private Floor floor;
    private StartFrame startFrame;
    private int elevatorsFloor;
    private int currentFloor;
    private int destinationFloor;
    private boolean availability;

    public Elevator (int elevatorsFloor, Floor floor) {
        this.elevatorsFloor = elevatorsFloor;
        this.floor = floor;
        currentFloor = floor.getCurrentFloor();
        destinationFloor = floor.getDestinationFloor();
    }

    public boolean isAvailability () {
        if (Thread.currentThread().getState().equals("TERMINATED")) {
            return availability = true;
        }
        return availability = false;
    }

//    public void addElevators (int elevatorsFloor, int currentFloor, int destinationFloor) {
//        elevators.add(new Elevator(elevatorsFloor, (new Floor(currentFloor, destinationFloor))));
//    }

    @SneakyThrows
    @Override
    public void run () {
        if (this.getDirection().equals("UP")) {
            System.out.println("Direction: UP");
            for (int i = elevatorsFloor; i <= destinationFloor; i++) {
                Thread.sleep(1000);
                System.out.println("Floor: " + i);

                if ((i != elevatorsFloor) && (i == currentFloor)) {
                    System.out.println("Current floor: " + i);
                }
            }
        } else if (this.getDirection().equals("DOWN")) {
            System.out.println("Direction: DOWN");
            for (int i = elevatorsFloor; i >= destinationFloor; i--) {
                Thread.sleep(1000);
                System.out.println("Floor: " + i);

                if ((i != elevatorsFloor) && (i == currentFloor)) {
                    System.out.println("Current floor: " + i);
                }
            }
        }
    }

    public String getDirection () {
        if (currentFloor < destinationFloor) {
            return "UP";
        } else if (currentFloor > destinationFloor) {
            return "DOWN";
        } else {
            return "It is current floor: " + currentFloor;
        }
    }
}
