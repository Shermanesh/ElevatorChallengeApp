package elevator.challenge;

import elevator.challenge.model.Elevator;
import elevator.challenge.model.Floor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElevatorChallengeApp {

	public static void main(String[] args) {
		SpringApplication.run(ElevatorChallengeApp.class, args);

		Elevator e1 = new Elevator(1,(new Floor(22,22)));
		e1.start();
		Elevator e2 = new Elevator(17,(new Floor(18,19)));
		e2.start();
		Elevator e3 = new Elevator(3, (new Floor(7,9)));
		e3.start();
		Elevator e4 = new Elevator(20,(new Floor(27,29)));
		e4.start();
	}
}
