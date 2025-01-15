package main.Materia;

import main.Materia.Models.Node;
import java.util.*;

public class Ejercicio_01_insert {
    
    private static int getHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    private static void fillLevels(Node node, int level, List<List<String>> levels) {
        if (node == null) return;
        
        levels.get(level).add(String.valueOf(node.getValue()));
        fillLevels(node.getLeft(), level + 1, levels);
        fillLevels(node.getRight(), level + 1, levels);
    }


    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } 
        else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    public static void printTree(Node root) {
        if (root == null) return;
        int height = getHeight(root);

        List<List<String>> levels = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            levels.add(new ArrayList<>());
        }

        fillLevels(root, 0, levels);
        for (List<String> level : levels) {
            System.out.print("  ".repeat(height - levels.indexOf(level) - 1));
            for (String value : level) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}