/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emad
 */
public class chicken_pizza extends PizzaBuilder{
      @Override
    public void SetSize(String s) {
       
            pzz.setSize(s);
        
    }

    @Override
    public void SetCost(String s) {
        if(s=="large"){
            pzz.setCost(155);
        }
        else if(s=="medium"){
             pzz.setCost(115);
        }
        else if(s=="small"){
             pzz.setCost(75);
        }
    }

    
    public void crust(String s) {
        if(s=="thin")
            pzz.setCrust("thinCrust");
        else if (s=="thickCrust")
            pzz.setCrust("thickCrust");
    }
        @Override
    public int getCost() {
return pzz.getCost();
    }


    
   
}
