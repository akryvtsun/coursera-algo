package homeworks.hw1;

import java.util.List;

class IntListSource {
    private final List<Integer> list;

    private int index = 0;
    private int value;

    IntListSource(List<Integer> list) {
        if (list == null)
            throw new NullPointerException("Input list can't be null");

        this.list = list;
        value = getNextValue(index);
    }

    int getValue() {
        return value;
    }

    int getIndex() {
        return index;
    }

    int getRemains() {
        return index < list.size()? list.size() - index: 0;
    }

    void goNext() {
        value = getNextValue(++index);
    }

    private int getNextValue(int index) {
        return index < list.size()
                ? list.get(index)
                : Integer.MAX_VALUE;
    }
}
