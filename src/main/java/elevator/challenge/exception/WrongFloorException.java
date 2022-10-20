package elevator.challenge.exception;

public class WrongFloorException extends Exception {
    public WrongFloorException(){
        super();
    }

    public WrongFloorException(int floor){
        super("Wrong floor: " + floor + ". The floor cannot be negative or higher than 55.");
    }

}
