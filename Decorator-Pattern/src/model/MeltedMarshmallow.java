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
public class MeltedMarshmallow extends ToppingsDecorator{
    
    IceCream iceCream;

    public MeltedMarshmallow(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " / Melted Marshmallow";
    }

    @Override
    public double cost() {
        return iceCream.cost() + 200.00;
    }
    
}
