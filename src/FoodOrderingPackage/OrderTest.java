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
public class OrderTest {
    public static void main(String[] args){
      Pizza pizza = new Pizza(Size.MEDIUM,Crust.STUFFED,Sauce.PESTO,Topping.OLIVES,Topping.ONION);
        //.out.println(pizza.getInfo());
   Pizza pizza1 = new Pizza(Size.SMALL,Crust.THIN,Sauce.TOMATO,Topping.NONE,Topping.ONION);
       // System.out.println(pizza.getInfo());
   Pizza pizza2 = new Pizza(Size.LARGE,Crust.DEEP,Sauce.TOMATO,Topping.ANCHOVY,Topping.ONION);
       // System.out.println(pizza.getInfo());
   Pizza pizza3 = new Pizza(Size.MEDIUM,Crust.STUFFED,Sauce.TOMATO,Topping.NONE,Topping.EXTRA_CHEESE);
        //System.out.println(pizza.getInfo());
        
    Order order = new Order();
    order.addPizza(pizza);
    order.addPizza(pizza1);
    order.addPizza(pizza2);
    order.addPizza(pizza3);
    order.removePizza(1);
    order.removePizza(2);
    order.removePizza(3);
    order.updatePizzaFromIndex(1, Size.MEDIUM, Crust.DEEP, Sauce.TOMATO, Topping.NONE, Topping.NONE);
    System.out.println(order.getOrderCost());
    System.out.println(order.getOrder());
    System.out.println(order.getNumberOfPizzas());
    
    }
}
