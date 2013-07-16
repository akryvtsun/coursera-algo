package homeworks.week2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * todo test partitioning procedure
 * todo user triangulation for test partitioning on another data set
 * todo test QuickSort procedure
 *
 * todo test pivot element selection
 * todo test real data loader
 * todo how to make obtaining of real answer as part of junit unfrastructure
 *
 * todo make real data loader common for all weeks???
 *
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=327">Test cases for programming assignment #2</a>
 */
public class QuestionTest {

    @Test
    public void testPartition() {
        int[] src = new int[] {3,1};
        Question.partition(src, 0, 1);
        assertArrayEquals(new int[] {1,3}, Arrays.copyOfRange(src, 0, 2));
    }

    @Test
    public void testPartition2() {
        int[] src = new int[] {3,8,2,5,1,4,7,6};
        Question.partition(src, 0, 7);
        assertArrayEquals(new int[] {1,2,3,5,8,4,7,6}, Arrays.copyOfRange(src, 0, 8));
    }

    @Test
    public void testQuestion() {
        Question q = new Question(new int[] {5,4,3,2,1});
        assertEquals(3, q.getAnswer());
    }
}
