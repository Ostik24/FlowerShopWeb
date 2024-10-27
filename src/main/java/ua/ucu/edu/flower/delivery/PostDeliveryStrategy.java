package ua.ucu.edu.flower.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String getDeliveryNotification() {
        return "Delivery with simple Post";
    }
}