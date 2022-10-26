package elevator.challenge;

import elevator.challenge.model.Elevator;
import elevator.challenge.model.Floor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;


class ElevatorSystemTest {
    Floor floorUP = new Floor(0, 35);
    Floor floorDOWN = new Floor(35, 0);
    Elevator elevatorUP = new Elevator(0, floorUP);
    Elevator elevatorDOWN = new Elevator(0, floorDOWN);

    //Elevator.class Tests
    @Test
    void getDirectionTest () {
        assertEquals("UP", elevatorUP.getDirection());
        assertEquals("DOWN", elevatorDOWN.getDirection());
    }

    @Test
    void isAvailabilityTest () {
        elevatorDOWN.start();
        assertFalse(elevatorDOWN.isAvailability());
    }

    //StartFrameController.class Tests
    @Test
    void getNonLinearElevatorMotionTest () {

    }

    @Test
    void getLinearElevatorMotionTest () {
    }

//    @Test
//    public void testSummationWithConcurrency() throws InterruptedException {
//        int numberOfThreads = 2;
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        CountDownLatch latch = new CountDownLatch(numberOfThreads);
//        for (int i = 0; i < numberOfThreads; i++) {
//            service.submit(() -> {
//                elevatorUP.run();
//                latch.countDown();
//            });
//        }
//        latch.await();
//        assertEquals(numberOfThreads, elevatorUP.run());
//    }

//    @Test
//    public void testCounter() {
//        MyCounter counter = new MyCounter();
//        for (int i = 0; i < 500; i++) {
//            counter.increment();
//        }
//        assertEquals(500, counter.getCount());
//    }

//    @Test
//    public void testCounterWithConcurrency() throws InterruptedException {
//        int numberOfThreads = 10;
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        CountDownLatch latch = new CountDownLatch(numberOfThreads);
//        MyCounter counter = new MyCounter();
//        for (int i = 0; i < numberOfThreads; i++) {
//            service.execute(() -> {
//                counter.increment();
//                latch.countDown();
//            });
//        }
//        latch.await();
//        assertEquals(numberOfThreads, counter.getCount());
//    }
}