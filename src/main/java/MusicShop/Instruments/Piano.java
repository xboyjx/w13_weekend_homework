package MusicShop.Instruments;

public class Piano extends Instrument {

    private int noKeys;

    public Piano(String material, String sound, double purchasePrice, double sellingPrice, int noKeys) {
        super(material, sound, purchasePrice, sellingPrice);
        this.noKeys = noKeys;
    }

    public int getNoKeys() {
        return noKeys;
    }
}
