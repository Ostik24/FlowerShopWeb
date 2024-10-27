package ua.ucu.edu.flower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.edu.flower.delivery.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @GetMapping("/strategies")
    public List<Delivery> getDeliveryStrategies() {
        return List.of(
            new DHLDeliveryStrategy(),
            new PostDeliveryStrategy()
        );
    }
}