package day18;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node root;


    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static void addNode(int value, Node root) {
        if (root == null) {
            root = new Node(value, null, null);
        }
        if (value < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(value, null, null));
                return;
            }
            addNode(value, root.getLeft());
        }

        if (value >= root.getValue()) {
            if (root.getRight() == null) {
                root.setRight(new Node(value, null, null));
                return;
            }
            addNode(value, root.getRight());
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
