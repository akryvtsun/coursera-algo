package homeworks.week3;

import homeworks.Questionable;

public class MinimumCutProblem implements Questionable<Integer> {
    private final GraphData graph;
    private final int runsCount;
    private int minCutsAnswer = Integer.MAX_VALUE;

    MinimumCutProblem(GraphData graph) {
        this(graph, -1);
    }

    MinimumCutProblem(GraphData graph, int runsCount) {
        this.graph = graph;
        this.runsCount = runsCount == -1
            ? calcRunsCount(graph)
            : runsCount;
    }

    private int calcRunsCount(GraphData graph) {
        int n = graph.getNotesCount();
        double goodCount = Math.pow(n, 2) * Math.log(n);
        return ((int)goodCount);
    }

    @Override
    public Integer getAnswer() {
        for (int i = 0; i < runsCount; i++) {
            GraphData newGraph = new GraphData(graph);
            Questionable<Integer> q = new RandomContractionAlgorithm(newGraph);
            int answer = q.getAnswer();
            if (answer < minCutsAnswer)
                minCutsAnswer = answer;
        }
        return minCutsAnswer;
    }
}
