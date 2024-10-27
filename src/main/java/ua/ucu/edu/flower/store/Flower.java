package ua.ucu.edu.flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    @Override
    public double getPrice() {
        return price;
    }
}