package homeworks.week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTest {
    @Test
    public void testQuestion() {
        Question q = new Question();
        assertEquals(2, q.getAnswer());
    }
}
