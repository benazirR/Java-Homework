package Lesson1.HW_impl;

import Lesson1.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    private int temperature;
    private float volume;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 0;
        this.volume = 0;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, float volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
