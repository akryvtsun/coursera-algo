package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * todo enter array for partitioning
 * todo user triangulation for test partitioning on another data set
 * todo test partitioning procedure
 *
 * todo test pivot element selection
 * todo test real data loader
 *
 * todo make real data loader common for all weeks???
 */
public class QuestionTest {
    @Test
    public void testQuestion() {
        Question q = new Question();
        assertEquals(3, q.getAnswer());
    }
}
