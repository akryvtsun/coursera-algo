package homeworks.week1;

import homeworks.QuestionDataLoader;

public class DataLoader extends QuestionDataLoader<Integer> {

    public DataLoader(String fileName) {
        super(fileName);
    }

    @Override
    protected Integer getLineData(String strLine) {
        return Integer.parseInt(strLine);
    }
}
