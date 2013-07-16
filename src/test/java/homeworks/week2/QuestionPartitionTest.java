package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuestionPartitionTest {
    @Test
    public void testOneElementPartition() {
        int[] src = new int[] {1};
        Question.partition(src, 0, 1);
        assertArrayEquals(new int[] {1}, src);
    }

    @Test
    public void testTwoElementPartition() {
        int[] src = new int[] {3,1};
        Question.partition(src, 0, 2);
        assertArrayEquals(new int[] {1,3}, src);
    }

    @Test
    public void testPartitionFromLecture() {
        int[] src = new int[] {3,8,2,5,1,4,7,6};
        Question.partition(src, 0, 8);
        assertArrayEquals(new int[] {1,2,3,5,8,4,7,6}, src);
    }

    @Test
    public void testInnerPartition() {
        int[] src = new int[] {4,3,2,1,0};
        Question.partition(src, 1, 4);
        assertArrayEquals(new int[] {4,1,2,3,0}, src);
    }
}
