/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

/**
 *
 * @author Emad
 */
public class Order {
    private PizzaBuilder pizzabuilder;

    public void setPizzabuilder(PizzaBuilder pizzabuilder) {
        this.pizzabuilder = pizzabuilder;
    }
    
    public pizza getPizza()
    {
        return pizzabuilder.get_pizza();
    }
    public void constructPizza(String s,String c)
    {
        pizzabuilder.create_pizza();
        pizzabuilder.SetSize(s);
        pizzabuilder.SetCost(s);
        pizzabuilder.crust(c);
     
    }
    
    
}
