package homeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class QuestionDataLoader<T> {
    private final InputStream is;
    private List<T> data;

    public QuestionDataLoader(String fileName) {
        is = getClass().getResourceAsStream(fileName);
    }

    public List<T> getData() throws IOException {
        if (data == null)
            data = getDataImpl();
        return data;
    }

    private List<T> getDataImpl() throws IOException {
        List<T> data = new ArrayList<T>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(is));

            while (true) {
                String strLine = br.readLine();
                if (strLine == null)
                    break;
                data.add(getLineData(strLine));
            };
        }
        finally {
            if (br != null)
                br.close();
        }

        return data;
    }

    protected abstract T getLineData(String strLine);
}
