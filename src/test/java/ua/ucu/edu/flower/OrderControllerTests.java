package ua.ucu.edu.flower;

import org.junit.jupiter.api.Test;
import ua.ucu.edu.flower.controller.OrderController;
import ua.ucu.edu.flower.delivery.DHLDeliveryStrategy;
import ua.ucu.edu.flower.delivery.PostDeliveryStrategy;
import ua.ucu.edu.flower.store.Flower;
import ua.ucu.edu.flower.store.FlowerColor;
import ua.ucu.edu.flower.store.FlowerType;
import ua.ucu.edu.flower.store.Order;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OrderControllerTests {

    @Test
    void testListOrders() {
        OrderController orderController = new OrderController();

        List<Order> orders = orderController.listOrders();

        assertThat(orders).hasSize(2);

        Order firstOrder = orders.get(0);
        assertThat(firstOrder.getItems()).hasSize(2);
        assertThat(firstOrder.getDelivery()).isInstanceOf(DHLDeliveryStrategy.class);

        Flower firstFlowerInFirstOrder = (Flower) firstOrder.getItems().get(0);
        assertThat(firstFlowerInFirstOrder.getPrice()).isEqualTo(10.0);
        assertThat(firstFlowerInFirstOrder.getColor()).isEqualTo(FlowerColor.BLUE);
        assertThat(firstFlowerInFirstOrder.getSepalLength()).isEqualTo(10.0);
        assertThat(firstFlowerInFirstOrder.getFlowerType()).isEqualTo(FlowerType.ROSE);

        Flower secondFlowerInFirstOrder = (Flower) firstOrder.getItems().get(1);
        assertThat(secondFlowerInFirstOrder.getPrice()).isEqualTo(15.0);
        assertThat(secondFlowerInFirstOrder.getColor()).isEqualTo(FlowerColor.RED);
        assertThat(secondFlowerInFirstOrder.getSepalLength()).isEqualTo(12.0);
        assertThat(secondFlowerInFirstOrder.getFlowerType()).isEqualTo(FlowerType.CHAMOMILE);

        Order secondOrder = orders.get(1);
        assertThat(secondOrder.getItems()).hasSize(2);
        assertThat(secondOrder.getDelivery()).isInstanceOf(PostDeliveryStrategy.class);

        Flower firstFlowerInSecondOrder = (Flower) secondOrder.getItems().get(0);
        assertThat(firstFlowerInSecondOrder.getPrice()).isEqualTo(7.0);
        assertThat(firstFlowerInSecondOrder.getColor()).isEqualTo(FlowerColor.BLUE);
        assertThat(firstFlowerInSecondOrder.getSepalLength()).isEqualTo(8.0);
        assertThat(firstFlowerInSecondOrder.getFlowerType()).isEqualTo(FlowerType.TULIP);

        Flower secondFlowerInSecondOrder = (Flower) secondOrder.getItems().get(1);
        assertThat(secondFlowerInSecondOrder.getPrice()).isEqualTo(12.0);
        assertThat(secondFlowerInSecondOrder.getColor()).isEqualTo(FlowerColor.RED);
        assertThat(secondFlowerInSecondOrder.getSepalLength()).isEqualTo(15.0);
        assertThat(secondFlowerInSecondOrder.getFlowerType()).isEqualTo(FlowerType.ROSE);
    }
}