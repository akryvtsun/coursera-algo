package homeworks.week3;

import homeworks.QuestionDataLoader;

import homeworks.Questionable;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=563">Test cases for programming assignment #3</a>
 */
public class MinimumCutProblemTest {

    @Test
    public void testDemoQuestionFromLecture() {
        Integer[][] data = {{1, 2, 4}, {2, 1, 3, 4}, {3, 2, 4}, {4, 1, 2, 3}};
        GraphData graph = new GraphData(data);
        Questionable q = new MinimumCutProblem(graph);
        assertEquals(2, q.getAnswer());
    }

    @Test
    public void testDemoForumQuestion1() {
        Integer[][] data = {
            {1, 2, 3, 4, 7},
            {2, 1, 3, 4},
            {3, 1, 2, 4},
            {4, 1, 2, 3, 5},
            {5, 4, 6, 7, 8},
            {6, 5, 7, 8},
            {7, 1, 5, 6, 8},
            {8, 5, 6, 7}
        };
        GraphData graph = new GraphData(data);
        Questionable q = new MinimumCutProblem(graph);
        assertEquals(2, q.getAnswer());
    }

    @Test
    public void testDemoForumQuestion2() {
        Integer[][] data = {
            {1, 2, 3, 4},
            {2, 1, 3, 4},
            {3, 1, 2, 4},
            {4, 1, 2, 3, 5},
            {5, 4, 6, 7, 8},
            {6, 5, 7, 8},
            {7, 5, 6, 8},
            {8, 5, 6, 7}
        };
        GraphData graph = new GraphData(data);
        Questionable q = new MinimumCutProblem(graph);
        assertEquals(1, q.getAnswer());
    }

    @Test
    public void testDemoForumQuestion3FromFile() throws IOException {
        QuestionDataLoader<Integer[]> qdl = new DataLoader("VikramJaiswalData.txt");
        List<Integer[]> rawData = qdl.getData();
        Integer[][] data = rawData.toArray(new Integer[rawData.size()][]);

        GraphData graph = new GraphData(data);
        Questionable q = new MinimumCutProblem(graph);
        assertEquals(3, q.getAnswer());
    }

    @Test
    public void testLectureQuestion() throws IOException {
        QuestionDataLoader<Integer[]> qdl = new DataLoader("kargerMinCut.txt");
        List<Integer[]> rawData = qdl.getData();
        Integer[][] data = rawData.toArray(new Integer[rawData.size()][]);
                ;
        GraphData graph = new GraphData(data);
        Questionable q = new MinimumCutProblem(graph, 100);
        assertEquals(17, q.getAnswer());
    }
}
