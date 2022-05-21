package MusicShop.Instruments;

public class Guitar extends Instrument{

    private int NoStrings;

    public Guitar(String material, String sound, double purchasePrice, double sellingPrice, int noStrings) {
        super(material, sound, purchasePrice, sellingPrice);
        NoStrings = noStrings;
    }

    public int getNoStrings() {
        return NoStrings;
    }
}
