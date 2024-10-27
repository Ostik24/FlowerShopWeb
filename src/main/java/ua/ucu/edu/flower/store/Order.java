package ua.ucu.edu.flower.store;

import lombok.Getter;
import lombok.Setter;
import ua.ucu.edu.flower.delivery.Delivery;

import java.util.List;

@Getter
@Setter
public class Order {
    private List<Item> items;
    private Delivery delivery;

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}