package ua.ucu.edu.flower.filter;

import ua.ucu.edu.flower.store.Item;

public interface SearchFilter {
    boolean match(Item item);
}