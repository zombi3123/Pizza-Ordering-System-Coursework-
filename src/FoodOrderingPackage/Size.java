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
public enum Size {
    SMALL(9.45),MEDIUM(11.87),LARGE(15.9);
    private double size;
Size(double size){this.size=size;}
public double getSize(){return this.size;}
public String getSizeAsString(){return String.valueOf(size);}

}
