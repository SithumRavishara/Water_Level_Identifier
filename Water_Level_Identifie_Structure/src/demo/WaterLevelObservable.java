/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author sithum
 */
public class WaterLevelObservable {
    private int waterLvel;
    private ArrayList<WaterLevelObserver> observers=new ArrayList<>();
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.add(waterLevelObserver);
    }
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.remove(waterLevelObserver);
    }    
    public void notifyObservers(){
        for (WaterLevelObserver observer : observers) {
            observer.update(waterLvel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLvel!=waterLevel){
            this.waterLvel=waterLevel;
            notifyObservers();
        }
    }
}
