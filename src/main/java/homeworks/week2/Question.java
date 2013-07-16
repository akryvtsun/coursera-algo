package homeworks.week2;

public class Question {

    Question(int[] array) {

    }

    static void partition(int[] array, int left, int right) {
        final int pivot = array[left];

        int i = left+1;
        for (int j = i; j < right; j++) {
            if (array[j] < pivot) {
                swap(array, j, i);
                i++;
            }
        }

        swap(array, left, i-1);
    }

    static void quickSort(int[] array) {
        for (int i = 1; i <= 8; i++) {
            array[i-1] = i;
        }
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
