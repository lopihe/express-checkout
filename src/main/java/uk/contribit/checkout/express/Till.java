package uk.contribit.checkout.express;

import java.util.EnumMap;
import java.util.Map;

public class Till {
    private final Map<Item, Integer> itemCounts = new EnumMap<>(Item.class);

    public void process(Item item) {
        if (item != null) {
            itemCounts.put(item, itemCounts.computeIfAbsent(item, i -> 0) + 1);
        }
    }

    public int getTotal() {
        return orangesTotal(itemCounts.get(Item.ORANGE)) +
                applesTotal(itemCounts.get(Item.APPLE));
    }

    // Apple promotion: 2 for 1
    private int applesTotal(Integer count) {
        return count != null ? (count / 2 + count % 2) * Item.APPLE.getPrice() : 0;
    }

    // Orange promotion: 3 for 2
    private int orangesTotal(Integer count) {
        return count != null ? (count / 3 * 2 + count % 3) * Item.ORANGE.getPrice() : 0;
    }
}
