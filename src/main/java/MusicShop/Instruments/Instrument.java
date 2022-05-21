package MusicShop.Instruments;

import MusicShop.Item.Isell;

public abstract class Instrument implements IPlay, Isell {

    private String material;
    private String sound;
    private double purchasePrice;
    private double sellingPrice;

    public Instrument(String material, String sound, double purchasePrice, double sellingPrice) {
        this.material = material;
        this.sound = sound;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getSound() {
        return sound;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String playInstrument(){
        return String.format("Sound: %s", this.sound);
    }

    public double calculateMarkup(){
        return sellingPrice - purchasePrice;
    }
}
