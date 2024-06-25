package Lesson2.Interfaces;

import Lesson2.Classes.Actor;

public interface IQueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders(); // Сделать заказы
    void giveOrders(); // Забрать заказы
    void releaseFromQueue(); // Покинуть очередь
}
