import sun.applet.Main;

import java.util.Random;

public class RacingCars {

    public static class Car implements Runnable {
        int DISTANCE = MainTest.DISTANCE;
        int STEP = MainTest.STEP;
        private final String name;
        public Car(String name) {
            this.name = name;
        }
        @Override
        public void run(){
            //Khởi tạo điểm start
            int runDistance =0;
            long startTime = System.currentTimeMillis();

            while(runDistance < DISTANCE){
                try {
                    int speed = (new Random()).nextInt(20);
                    runDistance +=speed;
                    String log = "|";
                    int percentTravel = (runDistance*100) /DISTANCE;
                    for(int i=0;i<100;i+=STEP){
                        if(percentTravel >= i+STEP)
                            log += "=";
                        else if (percentTravel>=i && percentTravel<i+STEP)
                            log += "o";
                        else
                            log +="-";
                    }
                    log+="|";
                    System.out.println("Car " + this.name + ": " +log + " " + Math.min(DISTANCE,runDistance) + "KM" );
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    System.out.println("Car " + this.name + " broken. . .");
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Car " + this.name + " Finish in " + (endTime-startTime)/1000+"s");
        }
    }
}
