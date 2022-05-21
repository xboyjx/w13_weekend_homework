package InstrumentTest;

import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "ding", 10, 20, 20);
    }

    @Test
    public void hasKeys(){
        assertEquals(20, piano.getNoKeys());
    }
}
