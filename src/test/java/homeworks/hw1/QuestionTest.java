package homeworks.hw1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests Question.
 *
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=52">Test Cases for Programming Assignment #1</a>
 */
public class QuestionTest {

    @Test
    public void testQuestion1() {
        Question q = new Question(Arrays.asList(1,3,5,2,4,6));
        assertEquals(3, q.getAnswer());
    }

    @Test
    public void testQuestion2() {
        Question q = new Question(Arrays.asList(1,5,3,2,4));
        assertEquals(4, q.getAnswer());
    }

    @Test
    public void testQuestion3() {
        Question q = new Question(Arrays.asList(5,4,3,2,1));
        assertEquals(10, q.getAnswer());
    }

    @Test
    public void testQuestion4() {
        Question q = new Question(Arrays.asList(1,6,3,2,4,5));
        assertEquals(5, q.getAnswer());
    }

    @Test
    public void testQuestion5() {
        Question q = new Question(Arrays.asList(1,2,3,4,5,6));
        assertEquals(0, q.getAnswer());
    }

    @Test
    public void testQuestion6() {
        Question q = new Question(Arrays.asList(6,5,4,3,2,1));
        assertEquals(15, q.getAnswer());
    }
}
