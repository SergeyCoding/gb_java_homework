package org.algo.seminar04;

public class Tree<V extends Comparable<V>> {
    private Node root;

    public boolean contains(V value) {
        Node node = root;

        while (node != null) {
            if (node.value.equals(value)) {
                return true;
            }
            if (node.value.compareTo(value) > 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return false;
    }

    public void add(V value) {
        if (root == null) {
            root = new Node(value);
        }
    }

    @Override
    public String toString() {
        return root.value.toString();
    }

    private class Node {

        private V value;
        private Node left;
        private Node right;


        Node(V value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

}
