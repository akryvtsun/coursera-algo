package homeworks.week1;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final long answer;

    public Question(List<Integer> array) {
        IntValuesHolder holder = sort(array);
        answer = holder.getInversionsCount();
    }

    public long getAnswer() {
        return answer;
    }

    static IntValuesHolder sort(List<Integer> source) {
        if (source.size() == 1)
            return new IntValuesHolder(source);

        IntValuesHolder left = sort(source.subList(0, source.size()/2));
        IntValuesHolder right = sort(source.subList(source.size()/2, source.size()));
        return merge(left, right);
    }

    static IntValuesHolder merge(IntValuesHolder left, IntValuesHolder right) {
        int newSize = left.getList().size() + right.getList().size();
        List<Integer> newArray = new ArrayList<Integer>(newSize);

        IntValuesArray leftSrc = new IntValuesArray(left.getList());
        IntValuesArray rightSrc = new IntValuesArray(right.getList());

        int inversionsCount = 0;
        for (int i = 0; i < newSize; i++) {
            if (leftSrc.getValue() < rightSrc.getValue()) {
                newArray.add(i, leftSrc.getValue());

                leftSrc.goToNextValue();
            }
            else {
                newArray.add(i, rightSrc.getValue());

                inversionsCount += leftSrc.getRemainValuesCount();

                rightSrc.goToNextValue();
            }
        }

        IntValuesHolder holder = new IntValuesHolder(newArray);
        holder.setInversionsCount(left.getInversionsCount() + right.getInversionsCount() + inversionsCount);
        return holder;
    }
}
