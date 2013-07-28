package homeworks.week3;

import java.util.*;

public class GraphData {

    private static Random RND = new Random();

    private final List<Integer> nodes;
    private final Map<Integer, List<Integer>> edges;

    private GraphData() {
        nodes = new ArrayList<Integer>();
        edges = new HashMap<Integer, List<Integer>>();
    }

    public GraphData(Integer[][] data) {
        this();
        for (int i = 0; i < data.length; i++) {
            Integer node = data[i][0];
            nodes.add(node);

            List<Integer> eList = new ArrayList<Integer>();
            for (int j = 1; j < data[i].length; j++) {
                eList.add(data[i][j]);
            }
            edges.put(node, eList);
        }
    }

    public GraphData(GraphData graph) {
        this();
        for (Integer node: graph.nodes) {
            nodes.add(node);
            List<Integer> eList = graph.edges.get(node);
            edges.put(node, new ArrayList(eList));
        }
    }

    Integer getFirstNode() {
        int firstNodeIdx = RND.nextInt(nodes.size());
        return getNode(firstNodeIdx);
    }

    Integer getNode(int nodeIdx) {
        return nodes.get(nodeIdx);
    }

    Integer getSecondNode(Integer firstNode) {
        List<Integer> eList = edges.get(firstNode);
        int secondNodeIdx = RND.nextInt(eList.size());
        return eList.get(secondNodeIdx);
    }

    // todo exclude parasite self-loops
    void mergeFirstToSecond(Integer firstNode, Integer secondNode) {
        List<Integer> secondEList = edges.get(secondNode);

        for (Integer node: edges.get(firstNode)) {
            List<Integer> otherNodes = edges.get(node);
            for (int i = 0; i < otherNodes.size(); i++) {
                if (otherNodes.get(i).equals(firstNode)) {
                    otherNodes.set(i, secondNode);
                    secondEList.add(node);
                }
            }
        }
    }

    void deleteNode(Integer node) {
        nodes.remove(node);
        edges.remove(node);
    }

    void removeSelfLoops(Integer node) {
        Iterator<Integer> nodes = edges.get(node).iterator();
        while (nodes.hasNext()) {
            Integer otherNode = nodes.next();
            if (otherNode.equals(node))
                nodes.remove();
        }
    }

    int getEdgesCount(Integer node) {
        return edges.get(node).size();
    }

    int getNotesCount() {
        return nodes.size();
    }
}
