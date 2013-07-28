package homeworks.week3;

import java.util.*;

public class GraphData implements Cloneable {
    private final List<Integer> nodes;
    private final Map<Integer, List<Integer>> edges;

    private GraphData() {
        nodes = new ArrayList<Integer>();
        edges = new HashMap<Integer, List<Integer>>();
    }

    public GraphData(int[][] data) {
        this();
        for (int i = 0; i < data.length; i++) {
            int node = data[i][0];
            nodes.add(node);

            List<Integer> eList = new LinkedList<Integer>();
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
            edges.put(node, new LinkedList(eList));
        }
    }

    int getFirstNode(int firstNodeIdx) {
        return nodes.get(firstNodeIdx);
    }

    // todo MAKE SELECTION RANDOM TOO!!!
    int getSecondNode(int firstNode) {
        return edges.get(firstNode).get(0);
    }

    // todo rename method
    // todo make backward links in correct way
    void changeFirstToSecond(int firstNode, int secondNode) {
        for (Integer node: edges.get(firstNode)) {
            List<Integer> otherNode = edges.get(node);
            for (int i = 0; i < otherNode.size(); i++) {
                if (otherNode.get(i).equals(firstNode)) {
                    otherNode.set(i, secondNode);
                }
            }
        }
    }

    void deleteNode(int node) {
        nodes.remove(Integer.valueOf(node));
        edges.remove(node);
    }

    void removeSelfLoops(int node) {
        Iterator<Integer> nodes = edges.get(node).iterator();
        while (nodes.hasNext()) {
            Integer otherNode = nodes.next();
            if (otherNode.equals(node))
                nodes.remove();
        }
    }

    int getEdgesCount(int node) {
        return edges.get(node).size();
    }

    int getNotesCount() {
        return edges.size();
    }
}
