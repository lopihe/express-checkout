package uk.contribit.checkout.express;

import static java.util.Arrays.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Checkout {
    public Till processItems(String itemsString) {
        List<Item> items = parseItems(itemsString);
        Till till = scanItems(items);
        return till;
    }

    private List<Item> parseItems(String itemList) {
        if (itemList == null) {
            return Collections.emptyList();
        }
        return stream(itemList.split(" "))
                .filter(s -> s != null && !s.isEmpty())
                .map(Item::valueOf)
                .collect(Collectors.toList());
    }

    private Till scanItems(List<Item> items) {
        Till till = new Till();
        items.stream().forEach(till::process);
        return till;
    }
}
