package homeworks.week3;

import homeworks.Questionable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCutProblemTest {
    @Test
    public void testLectureQuestion() {
        GraphData graph = new GraphData(new int[][] {{1, 2,3}, {2, 1,3,4}, {3, 2,4}, {4, 1,2,3}});
        Questionable q = new MinimumCutProblem(graph);
        assertEquals(2, q.getAnswer());
    }
}
