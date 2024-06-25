package Lesson2.Classes;

import Lesson2.Interfaces.IMarketBehavior;
import Lesson2.Interfaces.IQueueBehavior;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements IMarketBehavior, IQueueBehavior {

    public List<Product> get_products() {
        return _products;
    }

    public void set_products(List<Product> _products) {
        this._products = _products;
    }

    private List<Actor> _actors = new ArrayList<>();
    private List<Product> _products = new ArrayList<>();
    private Queue<Actor> _queue = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        if (!_actors.contains(actor)) {
            _actors.add(actor);
            takeInQueue(actor);
            actor.isMakeOrder = true;
        }
        else {
            System.out.println(actor.name + " is already in the market");
        }
        //_actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            if (_actors.contains(actor)) {
                _actors.remove(actor);
            }
            else {
                System.out.println("Actor " + actor.name + " is already released");
            }
        }
        // _actors.removeAll(actors);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        if (_actors.contains(actor)) {
            _actors.remove(actor);
        }
        else{
            System.out.println("Actor not found");
        }
    }

    @Override
    public void update(Actor actor) {
        List<Product> cart = actor.getCart();
        for (Product productFromCart : cart) {
            for (Product productFromWH : _products) {
                if (productFromCart.name.equals(productFromWH.name)) {
                    // int productID = _products.indexOf(productFromCart);
                    if (productFromWH.quantity >= productFromCart.quantity) {
                        productFromWH.quantity -= productFromCart.quantity;
                    }
                }
            }
        }
        // Добавить аргумент
        // Создать список продуктов
    }

    @Override
    public void takeInQueue(Actor actor) {
        _queue.add(actor);
    }

    @Override
    public void takeOrders() {
        // Берем первый заказ из списка и удалить его
        do {
            Actor actor = _queue.peek();
            if (actor != null) {
                update(actor);
                releaseFromQueue();
                actor.isMakeOrder = false;
                actor.isTakeOrder = true;
                System.out.println("An order has been fulfilled to " + actor.name);
                releaseFromMarket(actor);
            } else {
                System.out.println("nobody is in queue.");
            }
        } while (!_queue.isEmpty());
    }

    @Override
    public void giveOrders() {
        // Вот тут не понял какое решение добавить.
    }

    @Override
    public void releaseFromQueue() {
        _queue.poll();
    }
}
