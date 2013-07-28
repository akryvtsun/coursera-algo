package homeworks.week3;

import homeworks.Questionable;

public class MinimumCutProblem implements Questionable {
    private final GraphData graph;
    private final long countRuns;
    private long minCutsAnswer = Long.MAX_VALUE;

    MinimumCutProblem(GraphData graph) {
        this.graph = graph;

        long n = graph.getNotesCount();
        double goodCount = Math.pow(n, 2) * Math.log(n);
        countRuns = ((long)goodCount);
    }

    @Override
    public long getAnswer() {
        for (int i = 0; i < countRuns; i++) {
            GraphData newGraph = new GraphData(graph);
            Questionable q = new RandomContractionAlgorithm(newGraph);
            if (q.getAnswer() < minCutsAnswer)
                minCutsAnswer = q.getAnswer();
        }
        return minCutsAnswer;
    }
}
