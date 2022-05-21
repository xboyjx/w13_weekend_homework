package MusicShop.Shop;

import MusicShop.Item.Isell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Isell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Isell> getStock() {
        return stock;
    }

    public void addItem(Isell item){
        stock.add(item);
    }

    public void removeItem(Isell item){
        int indexToRemove = -1;
        for(int i = 0; i< stock.size(); i++){
            if(stock.get(i) == item){
                indexToRemove = i;
            }
        }
        stock.remove(indexToRemove);
    }


}
