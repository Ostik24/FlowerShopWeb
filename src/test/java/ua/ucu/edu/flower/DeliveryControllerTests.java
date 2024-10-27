package ua.ucu.edu.flower;

import ua.ucu.edu.flower.controller.DeliveryController;
import ua.ucu.edu.flower.delivery.Delivery;
import ua.ucu.edu.flower.delivery.DHLDeliveryStrategy;
import ua.ucu.edu.flower.delivery.PostDeliveryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DeliveryControllerTests {

    @Test
    void testGetDeliveryStrategies() {
        DeliveryController deliveryController = new DeliveryController();
        
        List<Delivery> strategies = deliveryController.getDeliveryStrategies();

        assertThat(strategies).isNotEmpty();

        assertThat(strategies).hasSize(2);
        assertThat(strategies.get(0)).isInstanceOf(DHLDeliveryStrategy.class);
        assertThat(strategies.get(1)).isInstanceOf(PostDeliveryStrategy.class);
    }
}