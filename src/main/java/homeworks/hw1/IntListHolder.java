package homeworks.hw1;

import java.util.List;

class IntListHolder {
    private final List<Integer> list;
    private int inversionsCount = 0;

    IntListHolder(List<Integer> list) {
        this.list = list;
    }

    List<Integer> getList() {
        return list;
    }

    int getInversionsCount() {
        return inversionsCount;
    }

    void setInversionsCount(int inversionsCount) {
        this.inversionsCount = inversionsCount;
    }
}
