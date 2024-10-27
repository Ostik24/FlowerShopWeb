package ua.ucu.edu.flower;

import ua.ucu.edu.flower.controller.FlowerController;
import ua.ucu.edu.flower.store.Flower;
import ua.ucu.edu.flower.store.FlowerColor;
import ua.ucu.edu.flower.store.FlowerType;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FlowerControllerTests {

    @Test
    void testGetFlowers() {
        FlowerController flowerController = new FlowerController();

        List<Flower> flowers = flowerController.getFlowers();

        assertThat(flowers).isNotEmpty();
        assertThat(flowers).hasSize(2);

        Flower firstFlower = flowers.get(0);
        assertThat(firstFlower.getPrice()).isEqualTo(10.0);
        assertThat(firstFlower.getColor()).isEqualTo(FlowerColor.RED);
        assertThat(firstFlower.getSepalLength()).isEqualTo(5);
        assertThat(firstFlower.getFlowerType()).isEqualTo(FlowerType.ROSE);

        Flower secondFlower = flowers.get(1);
        assertThat(secondFlower.getPrice()).isEqualTo(12.0);
        assertThat(secondFlower.getColor()).isEqualTo(FlowerColor.BLUE);
        assertThat(secondFlower.getSepalLength()).isEqualTo(6);
        assertThat(secondFlower.getFlowerType()).isEqualTo(FlowerType.TULIP);
    }
}