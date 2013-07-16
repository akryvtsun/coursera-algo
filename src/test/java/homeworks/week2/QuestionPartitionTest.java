package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuestionPartitionTest {
    @Test
    public void testOneElementPartition() {
        int[] src = new int[] {1};
        int pivotIdx = Question.partition(src, 0, 1);

        assertEquals(0, pivotIdx);
        assertArrayEquals(new int[] {1}, src);
    }

    @Test
    public void testTwoElementPartition() {
        int[] src = new int[] {3,1};
        int pivotIdx = Question.partition(src, 0, 2);

        assertEquals(1, pivotIdx);
        assertArrayEquals(new int[] {1,3}, src);
    }

    @Test
    public void testPartitionFromLecture() {
        int[] src = new int[] {3,8,2,5,1,4,7,6};
        int pivotIdx = Question.partition(src, 0, 8);

        assertEquals(2, pivotIdx);
        assertArrayEquals(new int[] {1,2,3,5,8,4,7,6}, src);
    }

    @Test
    public void testInnerPartition() {
        int[] src = new int[] {4,3,2,1,0};
        int pivotIdx = Question.partition(src, 1, 4);

        assertEquals(3, pivotIdx);
        assertArrayEquals(new int[] {4,1,2,3,0}, src);
    }
}
