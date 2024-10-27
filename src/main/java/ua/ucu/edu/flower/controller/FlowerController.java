package ua.ucu.edu.flower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.ucu.edu.flower.store.Flower;
import ua.ucu.edu.flower.store.FlowerColor;
import ua.ucu.edu.flower.store.FlowerType;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        List<Flower> flowers = new ArrayList<>();

        flowers.add(new Flower(5.0, FlowerColor.RED, 10.0, FlowerType.ROSE));
        flowers.add(new Flower(6.0, FlowerColor.BLUE, 12.0, FlowerType.TULIP));
        
        return flowers;
    }
}