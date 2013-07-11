package homeworks.week1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IntValuesArrayTest {

    @Test(expected=NullPointerException.class)
    public void testNull() {
        new IntValuesArray(null);
    }

    @Test
    public void testEmpty() {
        IntValuesArray source = new IntValuesArray(new ArrayList());
        assertEquals(Integer.MAX_VALUE, source.getValue());
        assertEquals(0, source.getRemainValuesCount());
    }

    @Test
    public void testOne() {
        IntValuesArray source = new IntValuesArray(Arrays.asList(5));
        assertEquals(5, source.getValue());
        assertEquals(1, source.getRemainValuesCount());

        source.goToNextValue();
        assertEquals(Integer.MAX_VALUE, source.getValue());
        assertEquals(0, source.getRemainValuesCount());

        source.goToNextValue();
        assertEquals(Integer.MAX_VALUE, source.getValue());
        assertEquals(0, source.getRemainValuesCount());
    }
}
