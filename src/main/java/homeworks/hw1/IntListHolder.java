package homeworks.hw1;

import java.util.List;

class IntListHolder {
    private final List<Integer> list;
    private long inversionsCount = 0;

    IntListHolder(List<Integer> list) {
        this.list = list;
    }

    List<Integer> getList() {
        return list;
    }

    long getInversionsCount() {
        return inversionsCount;
    }

    void setInversionsCount(long inversionsCount) {
        this.inversionsCount = inversionsCount;
    }
}
