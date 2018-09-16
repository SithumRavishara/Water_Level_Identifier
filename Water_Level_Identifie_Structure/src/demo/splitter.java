
package demo;

/**
 *
 * @author Sithum Ravishara
 */
public class splitter extends WaterLevelObserver{
     @Override    
     public void update(int waterLevel) {        
         System.out.println(waterLevel>=75 ? "Splitter ON" :"Splitter OFF");     
     }
}
