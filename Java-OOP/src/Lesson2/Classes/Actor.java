package Lesson2.Classes;

import Lesson2.Interfaces.IActorBehavoir;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor implements IActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected List<Product> cart;

    public Actor(String name){
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
        this.cart = new ArrayList<>();
    }

    public Actor(String name, List<Product> cart){
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
        this.cart = cart;
    }

    public abstract String getName();

    public List<Product> getCart() {
        return cart;
    }
}
