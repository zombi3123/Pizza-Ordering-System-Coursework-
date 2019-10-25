/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodOrderingPackage;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.List;
/**
 *
 * @author Joshua
 */
public class Order {
    private List<Pizza> pizzas;
    public Order(){
    pizzas=new ArrayList<Pizza>();
    
    }
    public String getOrder(){
        String orderReceipt = "";
    for(Pizza p:pizzas){
    orderReceipt+=p.getInfo()+"\n";
    }
    return orderReceipt;
    }
    
    public String getOrderCost(){
    double total=0;
    for(Pizza p:pizzas){
    total+=p.getCost();
    }
    String stringTotal=String.format("%.2f", total);
    return stringTotal;
    
    }
    public String getNumberOfPizzas(){
    int totalNumber=pizzas.size();
    return "Number of pizzas: "+Integer.toString(totalNumber);
    }
    
    public void addPizza(Pizza newPizza){
    //Pizza newPizza=new Pizza();
    pizzas.add(newPizza);
    
    }
    
    public void removePizza(int indexPizza){
   pizzas.remove(indexPizza);
    }
    public int getOrderSize(){
    return pizzas.size();
    
    }
 
     public void updatePizza(Pizza oldPizza,Size size,Crust crust, Sauce sauce,
                 Topping topping1,Topping topping2){
         pizzas.remove(oldPizza);
         Pizza updatedPizza = new Pizza(size,crust,sauce,topping1,topping2);
         pizzas.add(updatedPizza);
    
    }
     public void updatePizzaFromIndex(int index,Size size,Crust crust, Sauce sauce,
                 Topping topping1,Topping topping2){
     pizzas.get(index).setSize(size);
     pizzas.get(index).setCrust(crust);
     pizzas.get(index).setSauce(sauce);
     pizzas.get(index).setTopping1(topping1);
     pizzas.get(index).setTopping2(topping2);
     
     }
     
    
}
