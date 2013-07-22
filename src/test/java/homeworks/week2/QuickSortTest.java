package homeworks.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSortFromLecture() {
        Question q = new Question1(new int[] {3,8,2,5,1,4,7,6});
        q.quickSort(0, 7);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, q.getArray());
    }

    @Test
    public void testSmallQuickSort() {
        Question q = new Question1(new int[] {4,3,2,1,0});
        q.quickSort(0, 4);
        assertArrayEquals(new int[] {0,1,2,3,4}, q.getArray());
    }
}
