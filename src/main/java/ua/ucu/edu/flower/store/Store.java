package ua.ucu.edu.flower.store;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import ua.ucu.edu.flower.filter.SearchFilter;

@Getter
@Setter
public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}