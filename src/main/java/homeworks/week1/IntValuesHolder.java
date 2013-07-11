package homeworks.week1;

import java.util.List;

class IntValuesHolder {
    private final List<Integer> list;
    private long inversionsCount = 0;

    IntValuesHolder(List<Integer> list) {
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
