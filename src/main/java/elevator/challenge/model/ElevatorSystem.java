package elevator.challenge.model;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ElevatorSystem{

    List<Elevator> elevators = new ArrayList<>();

    public void addElevators() {
        elevators.add(new Elevator(0,(new Floor(35,22))));
        elevators.add(new Elevator(35,(new Floor(22,22))));
        elevators.add(new Elevator(0,(new Floor(26,22))));
        elevators.add(new Elevator(55,(new Floor(0,22))));
        elevators.add(new Elevator(27,(new Floor(0,22))));
        elevators.add(new Elevator(7,(new Floor(0,22))));
        elevators.add(new Elevator(9,(new Floor(0,22))));

    }
    //        try
    //        {
    //            while(elevatorSystem.isAlive())
    //            {
    //                System.out.println("Main thread will be alive till the child thread is live");
    //                Thread.sleep(1500);
    //            }
    //        }
    //        catch(InterruptedException e)
    //        {
    //            System.out.println("Main thread interrupted");
    //        }
    //        System.out.println("Main thread's run is over" );

}
