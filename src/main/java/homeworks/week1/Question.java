package homeworks.week1;

import java.io.*;
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

    public static void main(String... args) throws IOException {
        InputStream is = Question.class.getResourceAsStream("IntegerArray.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<Integer> array = new ArrayList<Integer>();
        int count = 0;
        while (true) {
            String strLine = br.readLine();
            if (strLine == null)
                break;
            array.add(Integer.parseInt(strLine));
            count++;
        };
        System.out.println("Readed " + count + " numbers...");

        Question q = new Question(array);
        System.out.println("Inversions count is " + q.getAnswer());
    }
}
