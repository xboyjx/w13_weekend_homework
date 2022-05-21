package ItemTest;

import MusicShop.Item.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
       item = new Item("Drumsticks", 5, 10);
    }

    @Test
    public void hasDescription(){
        assertEquals("Drumsticks", item.getDescription());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(5, item.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10, item.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, item.calculateMarkup(),0.0);
    }
}
