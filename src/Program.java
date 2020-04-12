import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        ProductItem productItem1 = new ProductItem(2, 30L, "ilk ürün");
        ProductItem productItem2 = new ProductItem(3, 40L, "ikinci ürün");

        ServiceItem serviceItem1 = new ServiceItem("service for first produkt", 10L);
        ServiceItem serviceItem2 = new ServiceItem("service for second produkt", 5L);

        Item item1 = new Item("Item for first");
        item1.setProductItem(productItem1);
        item1.setServiceItem(serviceItem1);
        Item item2 = new Item("Item for first");
        item2.setProductItem(productItem2);
        item2.setServiceItem(serviceItem2);

        Order order = new Order(Arrays.asList(item1, item2));

        System.out.println(order.getTotalPrice());
    }
}
