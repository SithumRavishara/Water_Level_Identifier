package demo;

public class Demo {

    public static void main(String[] args) {
        WaterLevelObservable waterLevelObservable = new WaterLevelObservable();
        waterLevelObservable.addWaterLevelObserver(new AlarmWindow());
        //add Display
        //add SMSSender
        //add Splitter
        new WaterTank(waterLevelObservable).setVisible(true);

    }
}
