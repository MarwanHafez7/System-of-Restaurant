/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;




public abstract  class PizzaBuilder {
 public pizza pzz;
    
    public pizza get_pizza()
    {
        return pzz;
    }
    
    public void create_pizza()
    {
        pzz=new pizza();
        System.out.print("pizza is created");
    }
    public abstract void SetSize(String s);
    public abstract void SetCost(String s);
    public abstract int getCost();
    public abstract void crust(String c);
      
}
