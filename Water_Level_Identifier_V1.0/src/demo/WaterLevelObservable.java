/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author niroth
 */
public class WaterLevelObservable {
    private WaterLevelObserver[] observers=new WaterLevelObserver[10];
    private int pos;
    private int waterLevel;
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers[pos++]=waterLevelObserver;
    }
    public void notifyObservers(){
        for (int i = 0; i < pos; i++) {
            observers[i].update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObservers();
        }
    }
}
