package InstrumentTest;

import MusicShop.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "strum", 10, 20, 6);
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNoStrings());
    }

}
