package homeworks.hw1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IntListSourceTest {

    @Test(expected=NullPointerException.class)
    public void testNull() {
        new IntListSource(null);
    }

    @Test
    public void testEmpty() {
        IntListSource source = new IntListSource(new ArrayList());
        assertEquals(Integer.MAX_VALUE, source.getValue());
    }

    @Test
    public void testOne() {
        IntListSource source = new IntListSource(Arrays.asList(1));
        assertEquals(1, source.getValue());

        source.goNext();
        assertEquals(Integer.MAX_VALUE, source.getValue());

        source.goNext();
        assertEquals(Integer.MAX_VALUE, source.getValue());
    }
}
