package homeworks.week2;

public class Question {

    Question(int[] array) {

    }

    /**
     *
     * @param array
     * @param left  index for left start element in array
     * @param right  index for right finish element in array
     * @return  index of array pivot element
     */
    static int partition(int[] array, int left, int right) {
        final int pivot = array[left];

        int i = left+1;
        for (int j = i; j < right; j++) {
            if (array[j] < pivot) {
                swap(array, j, i);
                i++;
            }
        }

        swap(array, left, i-1);
        return i-1;
    }

    static void quickSort(int[] array, int left, int right) {
        if (left == right)
            return;

        int pivotIdx = partition(array, left, right+1);
        if (left < pivotIdx)
            quickSort(array, left, pivotIdx-1);
        if (pivotIdx < right)
            quickSort(array, pivotIdx+1, right);
    }

    long getAnswer() {
        return 3;
    }

    private static void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
