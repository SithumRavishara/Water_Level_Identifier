
package my_waterlevel;

/**
 *
 * @author Sithum Ravishara
 */
public class Splitter implements Observer{
     @Override    
     public void update(int waterLevel) {        
         System.out.println(waterLevel>=75 ? "Splitter ON" :"Splitter OFF");     
     }
}
