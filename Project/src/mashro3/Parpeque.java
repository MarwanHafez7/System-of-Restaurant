/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

/**
 *
 * @author ranah
 */
public  class Parpeque extends PizzaDecorator{
 PizzaBuilder pizz;
 
 public Parpeque(PizzaBuilder p)
 {
     this.pizz = p;
 }
 
 

 
public int getCost()
{
    return 15;
}

    @Override
    public void DoubleCost()
    {
        pizz.get_pizza().setCost(pzz.getCost()+10);
    }

   
    @Override
    public void SetSize(String s) {
pizz.SetSize(s);
    }

    @Override
    public void SetCost(String s) {
pizz.SetCost(s);
    }

    @Override
    public void crust(String c) {
pizz.get_pizza().setCrust(c);
    }

 
    
}
