public class Item {
    private String description;

    public Item(String description) {
        this.description = description;
    }

    public ProductItem getProductItem() {
        return productItem;
    }

    public void setProductItem(ProductItem productItem) {
        this.productItem = productItem;
    }

    public ServiceItem getServiceItem() {
        return serviceItem;
    }

    public void setServiceItem(ServiceItem serviceItem) {
        this.serviceItem = serviceItem;
    }

    private ProductItem productItem;
    private ServiceItem serviceItem;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        System.out.println("description :" + description );
    }

    public Long getPrice() {
        return productItem.getPrice()+serviceItem.getPrice();
    }
}
