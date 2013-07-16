package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * todo test QuickSort procedure
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
    public void testQuickSortFromLecture() {
        int[] src = new int[] {3,8,2,5,1,4,7,6};
        Question.quickSort(src);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, src);
    }

    @Test
    public void testQuestion() {
        Question q = new Question(new int[] {5,4,3,2,1});
        assertEquals(3, q.getAnswer());
    }
}
