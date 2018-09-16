package demo;

import java.util.Random;

public class Demo{
    public static void main(String[] args) {
        WaterLevelObservable waterLevelObservable=new WaterLevelObservable();
        waterLevelObservable.addWaterLevelObserver(new Alarm());
        waterLevelObservable.addWaterLevelObserver(new Display());
        waterLevelObservable.addWaterLevelObserver(new SMSSender());
        waterLevelObservable.addWaterLevelObserver(new splitter());
        Random r=new Random();
        while(true){
            int rand=r.nextInt(101);
            waterLevelObservable.setWaterLevel(rand);
            try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        }
    }
}