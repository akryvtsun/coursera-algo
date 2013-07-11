package homeworks.hw1;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Question {
    private final long answer;

    public Question(List<Integer> array) {
        IntListHolder holder = sort(array);
        answer = holder.getInversionsCount();
    }

    public long getAnswer() {
        return answer;
    }

    private IntListHolder sort(List<Integer> source) {
        if (source.size() == 1)
            return new IntListHolder(source);

        IntListHolder left = sort(source.subList(0, source.size()/2));
        IntListHolder right = sort(source.subList(source.size()/2, source.size()));
        return merge(left, right);
    }

    static IntListHolder merge(IntListHolder left, IntListHolder right) {
        int newSize = left.getList().size() + right.getList().size();
        List<Integer> newArray = new ArrayList<Integer>(newSize);

        IntListSource leftSrc = new IntListSource(left.getList());
        IntListSource rightSrc = new IntListSource(right.getList());

        int inversionsCount = 0;
        for (int i = 0; i < newSize; i++) {
            if (leftSrc.getValue() < rightSrc.getValue()) {
                newArray.add(i, leftSrc.getValue());

                leftSrc.goNext();
            }
            else {
                newArray.add(i, rightSrc.getValue());

                inversionsCount += leftSrc.getRemains();

                rightSrc.goNext();
            }
        }

        IntListHolder holder = new IntListHolder(newArray);
        holder.setInversionsCount(left.getInversionsCount() + right.getInversionsCount() + inversionsCount);
        return holder;
    }

    // final correct answer is 2407905288
    public static void main(String... args) throws IOException {
        InputStream is = Question.class.getResourceAsStream("IntegerArray.txt");
        DataInputStream in = new DataInputStream(is);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        List<Integer> array = new ArrayList<Integer>(100000);
        for (int i = 0; i< 100000; i++) {
            String strLine = br.readLine();
            array.add(Integer.parseInt(strLine));
        }

        Question q = new Question(array);
        System.out.println("Inversions count is " + q.getAnswer());
    }
}
