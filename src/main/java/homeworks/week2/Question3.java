package homeworks.week2;

public class Question3 extends Question {

    Question3(int[] array) {
        super(array);
    }

    @Override
    void prepareFirstPivot(int left, int right) {
        int median = left + (right-1 - left)/2;
        if ( (array[left] < array[median] && array[median] < array[right-1]) ||
            (array[right-1] < array[median] && array[median] < array[left])) {
            swap(array, left, median);
        }
        else if (  (array[left] < array[right-1] && array[right-1] < array[median]) ||
                 (array[median] < array[right-1] && array[right-1] < array[left])) {
            swap(array, left, right-1);
        }
    }
}
