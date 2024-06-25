package Lesson2.Classes;

import java.util.List;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    public Human(String name, List<Product> cart) {
        super(name, cart);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
