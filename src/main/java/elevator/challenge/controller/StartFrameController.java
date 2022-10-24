package elevator.challenge.controller;

import elevator.challenge.model.Elevator;
import elevator.challenge.model.Floor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

@NoArgsConstructor
public class StartFrameController implements ActionListener {

    List<Elevator> elevators = new ArrayList<>();

    private JButton startButton;
    private JComboBox currentFloorBox;
    private JComboBox destinationFloorBox;
    private int elevatorsFloor = 0;

    private int currentFloor;
    private int destinationFloor;

    public StartFrameController (JButton startButton, JComboBox currentFloorBox, JComboBox destinationFloorBox) {
        this.startButton = startButton;
        this.currentFloorBox = currentFloorBox;
        this.destinationFloorBox = destinationFloorBox;
    }


    @SneakyThrows
    @Override
    public void actionPerformed (ActionEvent e) {
        currentFloor = (int) Objects.requireNonNull(currentFloorBox.getSelectedItem());
        destinationFloor = (int) Objects.requireNonNull(destinationFloorBox.getSelectedItem());

        if (currentFloor == 0 && destinationFloor == 0) {
            JFrame alert = new JFrame();
            JOptionPane.showMessageDialog(alert, "Please choose the current and destination floor.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
        } else if (currentFloor == destinationFloor) {
            JFrame alert = new JFrame();
            JOptionPane.showMessageDialog(alert, "Wrong destination floor. It is your current floor.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
        } else if (e.getSource() == startButton) {
            if (((currentFloor > elevatorsFloor) && (currentFloor > destinationFloor)) ||
                    (elevatorsFloor != 0 && (currentFloor < elevatorsFloor) && (currentFloor < destinationFloor))) {
                System.out.println("Current floor: " + currentFloor + ". Destination floor: " + destinationFloor + ".");
                Elevator elevator1 = new Elevator(elevatorsFloor, (new Floor(elevatorsFloor, currentFloor)));
                Elevator elevator2 = new Elevator(currentFloor, (new Floor(currentFloor, destinationFloor)));
                elevator1.start();
                elevator1.join();
                elevator2.start();
                elevator2.join();
            } else {
                System.out.println("Current floor: " + currentFloor + ". Destination floor: " + destinationFloor + ".");
                Elevator elevator = new Elevator(elevatorsFloor, (new Floor(currentFloor, destinationFloor)));
                elevator.start();
                elevator.join();
            }
        }

        //                for (int i = 1; i <= 7; i++) {
        //                    elevators.add(elevator);
        //                    if (elevators.size() == 7) {
        //                        elevators.get(0).start();
        //                    }
        //                }

    }
}






