
package demo;

/**
 *
 * @author Sithum Ravishara
 */
public class Splitter implements WaterLevelObserver{
     @Override    
     public void update(int waterLevel) {        
         System.out.println(waterLevel>=75 ? "Splitter ON" :"Splitter OFF");     
     }
}
