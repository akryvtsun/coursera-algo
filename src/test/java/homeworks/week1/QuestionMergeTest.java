package homeworks.week1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuestionMergeTest {

    @Test
    public void testMerge1() {
        IntValuesHolder result = Question.merge(new IntValuesHolder(Arrays.asList(1, 3, 5)), new IntValuesHolder(Arrays.asList(2,4,6)));
        assertEquals(Arrays.asList(1,2,3,4,5,6), result.getList());
    }

    @Test
    public void testMerge2() {
        IntValuesHolder result = Question.merge(new IntValuesHolder(Arrays.asList(4,5,6)), new IntValuesHolder(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(1,2,3,4,5,6), result.getList());
    }
}
