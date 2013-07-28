package homeworks.week3;


import homeworks.Questionable;

public class RandomContractionAlgorithm implements Questionable<Integer> {

    private GraphData graph;

    public RandomContractionAlgorithm(GraphData graph) {
        while(graph.getNotesCount() > 2) {
            // select first random node
            int first = graph.getFirstNode();
            // select another node for the first node
            int second = graph.getSecondNode(first);
            // change anywhere the first node number for the second one and...
            graph.mergeFirstToSecond(first, second);
            // ...remove the first node line
            graph.deleteNode(first);
            // remove duplicate edges
            graph.removeSelfLoops(second);
        }
        this.graph = graph;
    }

    @Override
    public Integer getAnswer() {
        int first = graph.getNode(0);
        return graph.getEdgesCount(first);
    }
}
