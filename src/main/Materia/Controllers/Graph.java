package main.Materia.Controllers;

import java.util.*;
import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes; 

    //Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    //Metodo para añadir un nodo
    public NodeGraph addNode(int value) {
        NodeGraph nodeGraph = new NodeGraph(value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    //Metodo para añadir una arista
    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    //Metodo para imprimir el grafo
    public void printGraph() {
        for(NodeGraph nodeGraph : nodes){
            System.out.println("Vertice " + nodeGraph.getValue() + ": ");
            for(NodeGraph nei : nodeGraph.getNeighbors()){
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }
        
    }

    //Metodo
    public void addEdgeUni (NodeGraph src, NodeGraph dest){
        src.addNeighbor(dest);
    }

    public void getDFS(NodeGraph start) {

        Set<NodeGraph> visitados = new HashSet<>();
        System.out.println("DFS desde el nodo" + start.getValue() + ":");
        getDFSUtil(start, visitados);
        System.out.println();
    }

    public void getDFSUtil(NodeGraph node, Set<NodeGraph> visitados) {

        if (visitados.contains(node)) {
            return;
        }

        visitados.add(node);
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visitados);
        }
        
    }

    public void getBFS(NodeGraph start) {
        Set<NodeGraph> visitados = new HashSet<>();
        Queue<NodeGraph> cola = new LinkedList<>();
        System.out.println("BFS desde el nodo" + start.getValue() + ":");
        cola.add(start); 
        visitados.add(start);
        while (!cola.isEmpty()) {
            NodeGraph actual = cola.poll();
            System.out.print(actual.getValue() + " ");
            for(NodeGraph neighbor : actual.getNeighbors()){
                if(!visitados.contains(neighbor)){
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        return null;

    }

    public void printAdjacencyMatrix() {
        
    }
}
