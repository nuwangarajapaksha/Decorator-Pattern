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
public class Strawberry extends IceCream{

    public Strawberry() {
        description="Strawberry Ice Cream";
    }

    @Override
    public double cost() {
        return 250.00;
    }
    
}
