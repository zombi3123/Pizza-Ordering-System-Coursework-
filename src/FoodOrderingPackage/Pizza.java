/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodOrderingPackage;
import java.text.DecimalFormat;

/**
 *
 * @author Joshua
 */
public class Pizza {
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1;
    private Topping topping2;
    public Pizza(){;}
    public Pizza(Size size,Crust crust, Sauce sauce,
                 Topping topping1,Topping topping2){
        this.size=size;
        this.crust=crust;
        this.sauce=sauce;
        this.topping1=topping1;
        this.topping2=topping2;
    }
    //Getters
    public Size getSize(){return size;}
    public Crust getCrust(){return crust;}
    public Sauce getSauce(){return sauce;}
    public Topping getTopping1(){return topping1;}
    public Topping getTopping2(){return topping2;}
    public double getBase(){return this.size.getSize()+this.crust.getCrust();}
    public String getInfo(){
    String sizeString=String.valueOf(this.size);
    String rtnStment="Size: "+sizeString+"\nCrust:"+this.crust+"\nSauce: "
            +this.sauce+"\nFirst topping: "+this.topping1+"\nSecond topping: "+
            this.topping2+"\nCost: "+this.getCost()+"\n========================";
    return rtnStment;
    }
    public double getCost(){
    double cost = this.size.getSize()+this.crust.getCrust()+this.sauce.getSauce()+
            this.topping1.getTopping()*5+this.topping2.getTopping()*4;
    DecimalFormat df = new DecimalFormat("#.###");
   double fCost = Double.valueOf(df.format(cost));
    return fCost;
    }
    //Setters
    public void setSize(Size size){this.size=size;}
    public void setCrust(Crust crust){this.crust=crust;}
    public void setSauce(Sauce sauce){this.sauce=sauce;}
    public void setTopping1(Topping topping1){this.topping1=topping1;}
    public void setTopping2(Topping topping2){this.topping2=topping2;}
    
}
