package homeworks.week1;

import java.util.List;

class IntValuesArray {
    private final List<Integer> list;

    private int index = 0;
    private int value;

    IntValuesArray(List<Integer> list) {
        if (list == null)
            throw new NullPointerException("Input list can't be null");

        this.list = list;
        value = getNextValue(index);
    }

    int getValue() {
        return value;
    }

    int getRemainValuesCount() {
        return index < list.size()
                ? list.size() - index
                : 0;
    }

    void goToNextValue() {
        value = getNextValue(++index);
    }

    private int getNextValue(int index) {
        return index < list.size()
                ? list.get(index)
                : Integer.MAX_VALUE;
    }
}
