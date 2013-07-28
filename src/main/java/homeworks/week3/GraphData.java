package homeworks.week3;

import java.util.*;

public class GraphData implements Cloneable {
    private final Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();

    public GraphData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            List<Integer> edges = new LinkedList<Integer>();
            for (int j = 1; j < data[i].length; j++) {
                edges.add(data[i][j]);
            }
            this.data.put(data[i][0], edges);
        }
    }

    public GraphData(GraphData graph) {
        for (Map.Entry<Integer, List<Integer>> entry: graph.data.entrySet()) {
            List<Integer> nodes = entry.getValue();
            data.put(entry.getKey(), new LinkedList(nodes));
        }
    }

    int getFirstNode(int firstNodeIdx) {
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry: data.entrySet()) {
            if (i == firstNodeIdx)
                return entry.getKey();
            else
                i++;
        }
        return -1;
    }

    int getSecondNode(int firstNode) {
        return data.get(firstNode).get(0);
    }

    void changeFirstToSecond(int firstNode, int secondNode) {
        for (Integer node: data.get(firstNode)) {
            List<Integer> otherNode = data.get(node);
            for (int i = 0; i < otherNode.size(); i++) {
                if (otherNode.get(i).equals(firstNode)) {
                    otherNode.set(i, secondNode);
                }
            }
        }
    }

    void deleteNode(int node) {
        data.remove(node);
    }

    void removeSelfLoops(int node) {
        Iterator<Integer> nodes = data.get(node).iterator();
        while (nodes.hasNext()) {
            Integer otherNode = nodes.next();
            if (otherNode.equals(node))
                nodes.remove();
        }
    }

    int getEdgesCount(int node) {
        return data.get(node).size();
    }

    int getNotesCount() {
        return data.size();
    }
}
