import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long totalPrice = 0L;
    private List<Item> items = new ArrayList<>();

    public Order(List<Item> items) {
        this.items = items;
    }

    public Long getTotalPrice() {
        for (Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void printItems() {
        for (Item item: items ) {
            System.out.println(items);
        }
    }
}
