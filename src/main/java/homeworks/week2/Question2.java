package homeworks.week2;

public class Question2 extends Question {

    Question2(int[] array) {
        super(array);
    }

    @Override
    void prepareFirstPivot(int left, int right) {
        swap(array, left, right-1);
    }
}
