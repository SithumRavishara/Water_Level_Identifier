/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_waterlevel;

/**
 *
 * @author Sithum Ravishara
 */
public class Demo {

   
    public static void main(String[] args) {
        Observable b = new Observable();
        b.addwaterlevel(new Alarm());
        b.addwaterlevel(new WaterLevelDisplay());
         b.addwaterlevel(new splitterdisplay());
        
        
        new WaterTank(b).setVisible(true);
        
    }
    
}
