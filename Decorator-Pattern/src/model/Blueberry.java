/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class Blueberry extends IceCream{

    public Blueberry() {
        description="Blueberry Ice Cream";
    }
    
    @Override
    public double cost() {
        return 350.00;
    }
    
}
