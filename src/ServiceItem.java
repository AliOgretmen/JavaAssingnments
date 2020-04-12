public class ServiceItem extends Item{

    private Long price;

    public ServiceItem(String description, Long price) {
        super(description);
        this.price = price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public Long getPrice() {
        return price;
    }
}
