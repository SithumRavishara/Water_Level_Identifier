/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author sithum
 */
public class SMSSender extends WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println("Sending sms : "+waterLevel);
    }
    
}
