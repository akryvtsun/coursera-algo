package homeworks.week3;

import homeworks.Questionable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCutProblemTest {
    @Test
    public void testQuestion() {
        Questionable q = new MinimumCutProblem(new GraphData());
        assertEquals(2, q.getAnswer());
    }
}
