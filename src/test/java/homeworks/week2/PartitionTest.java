package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PartitionTest {
    @Test
    public void testOneElementPartition() {
        Question q = new Question1(new int[] {1});
        int pivotIdx = q.partition(0, 1);

        assertEquals(0, pivotIdx);
        assertArrayEquals(new int[] {1}, q.getArray());
    }

    @Test
    public void testTwoElementPartition() {
        Question q = new Question1(new int[] {3,1});
        int pivotIdx = q.partition(0, 2);

        assertEquals(1, pivotIdx);
        assertArrayEquals(new int[] {1,3}, q.getArray());
    }

    @Test
    public void testPartitionFromLecture() {
        Question q = new Question1(new int[] {3,8,2,5,1,4,7,6});
        int pivotIdx = q.partition(0, 8);

        assertEquals(2, pivotIdx);
        assertArrayEquals(new int[] {1,2,3,5,8,4,7,6}, q.getArray());
    }

    @Test
    public void testInnerPartition() {
        Question q = new Question1(new int[] {4,3,2,1,0});
        int pivotIdx = q.partition(1, 4);

        assertEquals(3, pivotIdx);
        assertArrayEquals(new int[] {4,1,2,3,0}, q.getArray());
    }
}
