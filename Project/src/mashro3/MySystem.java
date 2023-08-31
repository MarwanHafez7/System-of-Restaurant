/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

import java.util.HashMap;

/**
 *
 * @author Emad
 */
public class MySystem {
    Database db=new Database();

   
   private   int delievry_staff=5;
   HashMap<String,Integer> Pepprony=new HashMap<String,Integer>();
    HashMap<String,Integer> MixMeat=new HashMap<String,Integer>();
     HashMap<String,Integer> Chicken=new HashMap<String,Integer>();
      HashMap<String,Integer> Margretta=new HashMap<String,Integer>();
       HashMap<String,Integer> Cheese=new HashMap<String,Integer>();
        public int getDelievry_staff()
        {
        return delievry_staff;
         }

    public void Delievry_staff_dec() {
               delievry_staff--; ;
    }
        
    
       
}
