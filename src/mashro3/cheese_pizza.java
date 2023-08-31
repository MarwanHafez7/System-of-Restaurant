/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;




public class cheese_pizza extends PizzaBuilder {

    @Override
    public void SetSize(String s) {
       
            pzz.setSize(s);
        
    }

    @Override
    public void SetCost(String s) {
        if(s=="large"){
            pzz.setCost(130);
        }
        else if(s=="medium"){
             pzz.setCost(100);
        }
        else if(s=="small"){
             pzz.setCost(60);
        }
    }

    
    public void crust(String s) {
        if(s=="thin")
            pzz.setCrust("thinCrust");
        else if (s=="thick")
            pzz.setCrust("thickCrust");
    }

    @Override
    public int getCost() {
return pzz.getCost();
    }

    
 
    
}
