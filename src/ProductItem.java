public class ProductItem extends Item{
    private int amount;
    private Long pricePerUnite;

    public ProductItem(int amount, Long pricePerUnite, String description) {
        super(description);
        this.amount = amount;
        this.pricePerUnite = pricePerUnite;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getPricePerUnite() {
        return pricePerUnite;
    }

    public void setPricePerUnite(Long pricePerUnite) {
        this.pricePerUnite = pricePerUnite;
    }

    @Override
    public Long getPrice() {
        return  amount*pricePerUnite;
    }
}
