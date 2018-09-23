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
public class Observable {
     private Observer[] c = new Observer[10];
     private int waterLevel;
     private int pos;
     public void addwaterlevel(Observer c1){
                c[pos++] = c1;
     }
     
     public void  waterlevelnotify(){
         for(int i=0;i<pos;i++){
         c[i].update(waterLevel);
         }
     }
     
     public void setwaterlevel(int waterLevel){
     if(this.waterLevel!= waterLevel){
        this.waterLevel=waterLevel;
        waterlevelnotify();
     }
     
     }
     
     
}
