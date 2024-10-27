package ua.ucu.edu.flower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.edu.flower.delivery.DHLDeliveryStrategy;
import ua.ucu.edu.flower.delivery.PostDeliveryStrategy;
import ua.ucu.edu.flower.store.Flower;
import ua.ucu.edu.flower.store.FlowerColor;
import ua.ucu.edu.flower.store.FlowerType;
import ua.ucu.edu.flower.store.Order;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public List<Order> listOrders() {
        return List.of(
                new Order(
                        List.of(
                                new Flower(10, FlowerColor.BLUE, 10, FlowerType.ROSE),
                                new Flower(12, FlowerColor.RED, 15, FlowerType.CHAMOMILE)
                        ),
                        new DHLDeliveryStrategy()
                ),
                new Order(
                        List.of(
                                new Flower(8, FlowerColor.BLUE, 7, FlowerType.TULIP),
                                new Flower(15, FlowerColor.RED, 12, FlowerType.ROSE)
                        ),
                        new PostDeliveryStrategy()
                )
        );
    }
}