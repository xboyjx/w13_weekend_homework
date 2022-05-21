package MusicShop.Item;

public class Item implements Isell {

    private String description;
    private double purchasePrice;
    private double sellingPrice;

    public Item(String description, double purchasePrice, double sellingPrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return sellingPrice - purchasePrice;
    }
}
