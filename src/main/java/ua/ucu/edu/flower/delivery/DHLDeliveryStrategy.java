package ua.ucu.edu.flower.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String getDeliveryNotification() {
        return "Delivery with DHL";
    }
}