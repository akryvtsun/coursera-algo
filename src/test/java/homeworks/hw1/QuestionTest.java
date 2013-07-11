package homeworks.hw1;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests Question.
 *
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=52">Test Cases for Programming Assignment #1</a>
 */
public class QuestionTest {

    @Test
    public void testMerge1() {
        IntListHolder result = Question.merge(new IntListHolder(Arrays.asList(1,3,5)), new IntListHolder(Arrays.asList(2,4,6)));
        assertEquals(Arrays.asList(1,2,3,4,5,6), result.getList());
    }

    @Test
    public void testMerge2() {
        IntListHolder result = Question.merge(new IntListHolder(Arrays.asList(4,5,6)), new IntListHolder(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(1,2,3,4,5,6), result.getList());
    }

    @Test
    //@Ignore
    public void testQuestion1() {
        Question q = new Question(Arrays.asList(1,3,5,2,4,6));
        assertEquals(3, q.getAnswer());
    }

    @Test
    @Ignore
    public void testQuestion2() {
        Question q = new Question(Arrays.asList(1,5,3,2,4));
        assertEquals(4, q.getAnswer());
    }

    @Test
    @Ignore
    public void testQuestion3() {
        Question q = new Question(Arrays.asList(5,4,3,2,1));
        assertEquals(10, q.getAnswer());
    }

    @Test
    @Ignore
    public void testQuestion4() {
        Question q = new Question(Arrays.asList(1,6,3,2,4,5));
        assertEquals(5, q.getAnswer());
    }

    @Test
    @Ignore
    public void testQuestion5() {
        Question q = new Question(Arrays.asList(1,2,3,4,5,6));
        assertEquals(0, q.getAnswer());
    }

    @Test
    @Ignore
    public void testQuestion6() {
        Question q = new Question(Arrays.asList(6,5,4,3,2,1));
        assertEquals(15, q.getAnswer());
    }
}
