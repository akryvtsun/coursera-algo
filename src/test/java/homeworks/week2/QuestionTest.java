package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * todo test QuickSort procedure
 * todo change right signature for partition
 *
 * todo test pivot element selection
 * todo test real data loader
 *
 * todo make real data loader common for all weeks???
 *
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=327">Test cases for programming assignment #2</a>
 */
public class QuestionTest {

    @Test
    public void testQuestion() {
        Question q = new Question(new int[] {3, 9, 8, 4, 6, 10, 2, 5, 7, 1});
        assertEquals(25, q.getAnswer());
    }
}
