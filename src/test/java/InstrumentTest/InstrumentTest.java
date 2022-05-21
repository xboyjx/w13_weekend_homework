package InstrumentTest;

import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Guitar("wood", "strum", 10, 20, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", instrument.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("strum", instrument.getSound());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(10, instrument.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20, instrument.getSellingPrice(), 0.0);
    }

    @Test
    public void canPlaySound(){
        assertEquals("Sound: strum", instrument.playInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10, instrument.calculateMarkup(), 0.0);
    }

}
