package homeworks.week3;

public class GraphData {
    private int[][] data;

    public GraphData(int[][] data) {
        this.data = data;
    }

    long getNotesCount() {
        return data.length;
    }
}
