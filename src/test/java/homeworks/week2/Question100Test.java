package homeworks.week2;

import homeworks.Questionable;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

/**
 * @see <a href="https://class.coursera.org/algo-004/forum/thread?thread_id=327">Test cases for programming assignment #2</a>
 */
public class Question100Test {
    private int[] array;

    @Before
    public void setUp() throws IOException {
        InputStream is = homeworks.week2.Question.class.getResourceAsStream("100.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        array = new int[100];
        int count = 0;
        while (true) {
            String strLine = br.readLine();
            if (strLine == null)
                break;
            array[count] = Integer.parseInt(strLine);
            count++;
        };
        assertEquals(100, count);

        br.close();
        is.close();
    }

    @Test
    public void testQuestion1() {
        Questionable<Long> q = new Question1(array);
        assertEquals(615, (long)q.getAnswer());
    }

    @Test
    public void testQuestion2() {
        Questionable<Long> q = new Question2(array);
        assertEquals(587, (long)q.getAnswer());
    }

    @Test
    public void testQuestion3() {
        Questionable<Long> q = new Question3(array);
        assertEquals(518, (long)q.getAnswer());
    }
}
