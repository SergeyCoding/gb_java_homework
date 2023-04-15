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

    private void leftrotate(Node node) {
        var pivot = node;

        var t1 = node.left;
        var t2 = new Node(node);
        var t3 = node.right.left;
        var t4 = node.right;
        var t5 = node.right.right;

        pivot.value = t4.value;
        pivot.isRed = t2.isRed;
        pivot.left = t2;
        pivot.right = t5;

        t2.isRed = true;
        t2.left = t1;
        t2.right = t3;
    }

    private void rightrotate(Node node) {
        var pivot = node;

        var t1 = node.left.left;
        var t2 = node.left;
        var t3 = node.left.right;
        var t4 = new Node(node);
        var t5 = node.right;

        pivot.value = t2.value;
        pivot.isRed = t4.isRed;
        pivot.left = t1;
        pivot.right = t4;

        t4.isRed = true;
        t4.left = t3;
        t4.right = t5;
    }

    private void swapcolor(Node node) {
        node.isRed = true;
        node.left.isRed = false;
        node.right.isRed = false;
    }

    private void rebalance(Node n) {
        if (n == root && n.isRed) {
            n.isRed = false;
        }

        if (n.left != null && n.right != null) {
            if (n.right.isRed && !n.left.isRed)
                leftrotate(n);

            if (n.right.isRed && n.left.isRed)
                swapcolor(n);
        }

        if (n.left != null && n.left.left != null) {
            if (n.left.isRed && n.left.left.isRed)
                rightrotate(n);
        }
    }


    public void add(V value) {
        if (root == null) {
            root = new Node(value);
            rebalance(root);
            return;
        }

        add(value, root);
    }

    public void add(V value, Node current) {
        if (value.compareTo(current.value) < 0) {
            if (current.left == null) {
                current.left = new Node(value);
                rebalance(current.left);
                rebalance(current);
                return;
            }

            add(value, current.left);
        } else {
            if (current.right == null) {
                current.right = new Node(value);
                rebalance(current.right);
                rebalance(current);
                return;
            }

            add(value, current.right);
        }
    }

    private String gets(Node node) {
        if (node == null)
            return "-";

        if (node.left == null && node.right == null) {
            return (node.isRed ? "*" : "") + node.value;
        }

        return (node.isRed ? "*" : "") + node.value + "(" + gets(node.left) + ";" + gets(node.right) + ")";
    }

    @Override
    public String toString() {
        return gets(root);
    }

    private class Node {

        private V value;

        private boolean isRed;
        private Node left;
        private Node right;

        Node(Node node) {
            this.value = node.value;
            this.isRed = node.isRed;
        }

        Node(V value) {
            this.value = value;
            this.isRed = true;
            this.left = null;
            this.right = null;
        }
    }
}
