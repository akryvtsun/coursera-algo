package homeworks.week3;

import homeworks.QuestionDataLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader extends QuestionDataLoader<Integer[]> {

    public DataLoader(String fileName) {
        super(fileName);
    }

    @Override
    protected Integer[] getLineData(String strLine) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(strLine);
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        return numbers.toArray(new Integer[numbers.size()]);    }
}
