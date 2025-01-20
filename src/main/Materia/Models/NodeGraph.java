package main.Materia.Models;

import java.util.*;

public class NodeGraph {
    private int value;  // El valor asociado al nodo
    private List<NodeGraph> neighbors;  // Lista para almacenar los nodos vecinos

    // Constructor para inicializar el nodo con un valor
    public NodeGraph(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    // Método para obtener el valor del nodo
    public int getValue() {
        return value;
    }

    // Método para obtener la lista de vecinos
    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }

    // Método para agregar un vecino (el vecino es otro objeto NodeGraph)
    public void addNeighbor(NodeGraph neighbor) {
        this.neighbors.add(neighbor);
    }
}