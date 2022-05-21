package ShopTest;

import MusicShop.Instruments.Guitar;
import MusicShop.Item.Item;
import MusicShop.Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("wood", "strum", 10, 20, 6);
        item = new Item("Drumsticks", 5, 10);
    }

    @Test
    public void hasStock(){
        assertEquals(0,shop.getStock().size());
    }

    @Test
    public void canAddToStock(){
        shop.addItem(guitar);
        shop.addItem(item);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getStock().size());
    }
}
