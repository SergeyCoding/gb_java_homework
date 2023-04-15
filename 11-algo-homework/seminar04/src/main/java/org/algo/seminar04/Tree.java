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

    private void leftRotate(Node node) {
        var parent = node.parent;

        //var t1 = node.left;
        var t2 = node;
        var t3 = node.right.left;
        var t4 = node.right;
        //var t5 = node.right.right;

        if (parent != null) {
            parent.changeChild(node, t4);
        } else {
            t4.parent = null;
            root = t4;
        }

        //t2.addLeft(t1);
        t2.addRight(t3);

        t4.addLeft(t2);
        //t4.addRight(t5);
        t4.isRed = t2.isRed;

        t2.setRed();
    }

    private void rightRotate(Node node) {
        var parent = node.parent;

        //var t1 = node.left.left;
        var t2 = node.left;
        var t3 = node.left.right;
        var t4 = node;
        //var t5 = node.right;

        if (parent != null)
            parent.changeChild(node, t2);
        else {
            t2.parent = null;
            root = t2;
        }

        t4.addLeft(t3);
        //t4.addRight(t5);
        t4.setRed();

        //t2.addLeft(t1);
        t2.addRight(t4);
        t2.setBlack();
    }

    private void swapColor(Node node) {
        node.setRed();
        node.left.setBlack();
        node.right.setBlack();
    }

    private void reBalance(Node n) {
        if (n == null)
            return;

        if (n.left != null && n.right != null && n.right.isRed && n.left.isRed) {
            swapColor(n);
        }

        if (n.right != null && n.right.isRed) {
            leftRotate(n);
        }

        if (n.left != null && n.left.left != null && n.left.isRed && n.left.left.isRed) {
            rightRotate(n);
        }

        if (n == root && root.isRed) {
            root.setBlack();
        }

        reBalance(n.parent);
    }


    public void add(V value) {
        if (root == null) {
            root = new Node(value);
            reBalance(root);
            return;
        }

        add(value, root);
    }

    public void add(V value, Node current) {
        if (value.compareTo(current.value) < 0) {
            if (current.left == null) {
                current.addLeft(value);
                reBalance(current);
                return;
            }

            add(value, current.left);
        } else {
            if (current.right == null) {
                current.addRight(value);
                reBalance(current);
                return;
            }

            add(value, current.right);
        }
    }

    private String treeFormatter(Node node) {
        if (node == null) return "-";

        if (node.left == null && node.right == null) {
            return (node.isRed ? "*" : "") + node.value;
        }

        return (node.isRed ? "*" : "") + node.value + "(" + treeFormatter(node.left) + ";" + treeFormatter(node.right) + ")";
    }

    @Override
    public String toString() {
        return treeFormatter(root);
    }

    private class Node {
        private V value;
        private boolean isRed;
        private Node parent;
        private Node left;
        private Node right;


        Node(V value) {
            this.value = value;
            this.isRed = true;
            this.parent = null;
            this.left = null;
            this.right = null;
        }

        private void addLeft(Node n) {
            this.left = n;

            if (this.left != null)
                this.left.parent = this;
        }

        private void addRight(Node n) {
            this.right = n;

            if (this.right != null)
                this.right.parent = this;
        }

        private void changeChild(Node from, Node to) {
            if (right == from) {
                from.parent = null;
                addRight(to);
            }

            if (left == from) {
                from.parent = null;
                addLeft(to);
            }
        }

        private void addLeft(V value) {
            this.left = new Node(value);
            this.left.parent = this;
        }

        private void addRight(V value) {
            this.right = new Node(value);
            this.right.parent = this;
        }

        private void setRed() {
            this.isRed = true;
        }

        private void setBlack() {
            this.isRed = false;
        }
    }
}
