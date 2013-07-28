package homeworks.week3;


import homeworks.Questionable;

import java.util.Random;

public class RandomContractionAlgorithm implements Questionable {

    // todo MOVE RND into GraphData
    private static Random RND = new Random();
    private GraphData graph;

    public RandomContractionAlgorithm(GraphData graph) {
        while(graph.getNotesCount() > 2) {
            // select random node
            int firstNodeIdx = RND.nextInt(graph.getNotesCount());
            int first = graph.getFirstNode(firstNodeIdx);
            // select another node for the first node
            int second = graph.getSecondNode(first);
            // change anywhere the first node number for the second one and...
            graph.changeFirstToSecond(first, second);
            // ...remove the first node line
            graph.deleteNode(first);
            // remove duplicate edges
            graph.removeSelfLoops(second);
        }
        this.graph = graph;
    }

    @Override
    public long getAnswer() {
        int first = graph.getFirstNode(0);
        return graph.getEdgesCount(first);
    }
}
