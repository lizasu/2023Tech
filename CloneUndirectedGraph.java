class Solution {
    private HashMap<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        // DFS
        return clone(node);
    }
    private Node clone(Node node) {
        if (node == null) return null;

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node clone = new Node(node.val);
        map.put(clone.val, clone);
        for (Node neighbor: node.neighbors) {
            clone.neighbors.add(clone(neighbor));
        }
        return clone;
    }
}
