/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodOrderingPackage;

/**
 *
 * @author Joshua
 */
public class PizzaTest {
    public static void main(String[] args){
    Pizza JoshPizza=new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.PEPPERONI, Topping.ONION);
        System.out.println(JoshPizza.getCost());
        System.out.println(JoshPizza.getSauce());
        System.out.println(JoshPizza.getCrust());
        System.out.println(JoshPizza.getInfo());
        System.out.println(JoshPizza.getSize());
        System.out.println(JoshPizza.getTopping1());
        System.out.println(JoshPizza.getTopping2());
    }
}
