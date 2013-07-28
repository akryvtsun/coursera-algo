package homeworks.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionDataLoader {
    private Integer[][] data;

    public QuestionDataLoader(String fileName) throws IOException {
        InputStream is = MinimumCutProblem.class.getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<Integer[]> lines = new ArrayList<Integer[]>();
        while (true) {
            String strLine = br.readLine();
            if (strLine == null)
                break;
            lines.add(getArray(strLine));
        };
        data = lines.toArray(new Integer[lines.size()][]);

        br.close();
        is.close();
    }

    private Integer[] getArray(String line) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(line);
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        return numbers.toArray(new Integer[numbers.size()]);
    }

    Integer[][] getData() {
        return data;
    }
}
