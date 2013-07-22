package homeworks.week2;

abstract class Question {
    private long count = 0;

    int[] array;

    Question(int[] array) {
        this.array = array;
    }

    int[] getArray() {
        return array;
    }

    abstract void prepareFirstPivot(int left, int right);

    /**
     * @param left  index for left start element in array
     * @param right  index for right finish element in array
     * @return  index of array pivot element
     */
    int partition(int left, int right) {
        prepareFirstPivot(left, right);
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

    void quickSort(int left, int right) {
        if (left == right)
            return;

        int pivotIdx = partition(left, right+1);
        count += right - left;

        if (left < pivotIdx)
            quickSort(left, pivotIdx-1);
        if (pivotIdx < right)
            quickSort(pivotIdx+1, right);
    }

    long getAnswer() {
        quickSort(0, array.length-1);
        return count;
    }

    static void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
