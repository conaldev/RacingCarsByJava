public class MainTest {
    public static final int DISTANCE = 400;
    public static final int STEP = 3;
    public static void main(String[] args) {
        RacingCars.Car car1 = new RacingCars.Car("MacOS ");
        RacingCars.Car car2 = new RacingCars.Car("Window");
        RacingCars.Car car3 = new RacingCars.Car("Ubuntu");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("Distance: "+DISTANCE+"KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
