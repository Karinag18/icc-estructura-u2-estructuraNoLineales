import java.util.List;
import main.Ejercicio_3_listLevels.*;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Ejercicio_01_insert;
import main.Materia.Ejercicio_02_invert;
import main.Materia.Ejercicio_03_listLeves;
import main.Materia.Ejercicio_04_depth;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runEjercicio3();
        //runArbolAvl();
        runEjercicio1Insert();
        runEjercicio2Invert();
        runEjercicio3();
        runEjercicio4Depth();
        runGraph();
    }
    
    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        // Insertar valores en el árbol binario
        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }

        System.out.println();
        arbolBinario.printTree();

        System.out.println();
        System.out.println("Recorrido PreOrder");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido PostOrder");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido InOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels listLeves = new ListLevels();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        System.out.println();
        System.out.println("Listas por Nivel:");
        listLeves.imprimirListasPorNivel(listLeves.ListLeves(arbolBinario.getRoot()));
    }

    public static void runArbolAvl() {
        int[] values = {15, 20, 10, 24, 9, 8, 21, 23, 50, 25};

        ArbolAVL arbolAVL = new ArbolAVL();

        System.out.println("Insertando nodos en el árbol AVL...");

        for (int value : values) {
            arbolAVL.insert(value);
        }

        System.out.println("\nÁrbol AVL después de todas las inserciones:");
        arbolAVL.printTree(arbolAVL.getRoot(), "", true);
    }

    //Ejercicio1

    public static void runEjercicio1Insert() {
        System.out.println("Ejercicio 1");
        // Input: valores a insertar en el BST
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int value : values) {
            root = Ejercicio_01_insert.insert(root, value);
        }
        System.out.println("El Árbol Binario de Búsqueda en orden:");
        Ejercicio_01_insert.printTree(root);

    }

    //EJercicio 2
     public static void runEjercicio2Invert() {
        System.out.println("Ejercicio 2");
        // Crear el árbol del ejemplo
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        // Mostrar árbol original
        System.out.println("Árbol Original:");
        Ejercicio_01_insert.printTree(root);  

        // Invertir el árbol
        root = Ejercicio_02_invert.invert(root);
        System.out.println("\nÁrbol Invertido:");
        Ejercicio_01_insert.printTree(root); 
        
        
    }


    //Ejercicio 3
    public static void runEjercicio3ListLevels() {
        System.out.println("Ejercicio 3");
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        // Mostrar árbol original
        System.out.println("Árbol Original:");
        Ejercicio_01_insert.printTree(root);
        System.out.println("\nListas por nivel:");
        List<Ejercicio_03_listLeves.ListNode> levelLists = Ejercicio_03_listLeves.listLevels(root);
        Ejercicio_03_listLeves.printLevelLists(levelLists);
    }

    //Ejercicio 4
    public static void runEjercicio4Depth() {
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setRight(new Node(8));

        // Mostrar árbol original
        System.out.println("Árbol Original:");
        Ejercicio_01_insert.printTree(root);

        // Calcular y mostrar la profundidad máxima
        int maxDepth = Ejercicio_04_depth.maxDepth(root);
        System.out.println("\nProfundidad máxima: " + maxDepth);
    }
    
    private static void runGraph() {
        Graph graph = new Graph();

        /*
         * // Se crean los nodos
         * NodeG node1 = graph.addNode(5);
         * NodeG node2 = graph.addNode(7);
         * NodeG node3 = graph.addNode(9);
         * NodeG node4 = graph.addNode(11);
         * NodeG node5 = graph.addNode(3);
         * 
         * graph.addEdge(node1, node5);
         * graph.addEdge(node1, node2);
         * graph.addEdge(node1, node3);
         * graph.addEdge(node2, node3);
         * graph.addEdge(node5, node3);
         * graph.addEdge(node5, node4);
         * 
         * graph.printGraph();
         */

        NodeGraph node0 = graph.addNode(0);
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);

        graph.addEdgeUni(node0, node2);
        graph.addEdgeUni(node0, node1);
        graph.addEdgeUni(node4, node0);
        graph.addEdgeUni(node3, node4);
        graph.addEdgeUni(node2, node3);
        graph.addEdgeUni(node2, node5);
        graph.addEdgeUni(node5, node4);
        graph.addEdgeUni(node1, node0);

        System.out.println("Grafo: ");
        graph.printGraph();
        System.out.println("\n Grafos Direccional");
        // Realizar DFS y BFS
        graph.getDFS(node0);
        graph.getBFS(node0);

        System.out.println("No direccional");

        graph.addEdge(node0, node3);
        graph.addEdge(node0, node5);
        graph.addEdge(node3, node2);
        graph.addEdge(node1, node0);
        graph.addEdge(node3, node4);
        graph.addEdge(node4, node1);
        graph.addEdge(node2, node1);

        graph.getDFS(node0);
        graph.getBFS(node0);

    }

    public static void ejercicioGraph() {
        Graph graph = new Graph();
    
        // Crear los nodos
        NodeGraph node0 = graph.addNode(0);
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);
        NodeGraph node7 = graph.addNode(7);
        NodeGraph node8 = graph.addNode(8);
        NodeGraph node9 = graph.addNode(9);
    
        // Agregar las conexiones (aristas) según la imagen
        graph.addEdge(node0, node1);
        graph.addEdge(node0, node2);
        graph.addEdge(node0, node5);
    
        graph.addEdge(node1, node4);
        graph.addEdge(node1, node8);
    
        graph.addEdge(node2, node3);
        graph.addEdge(node3, node4);
        graph.addEdge(node3, node7);
        graph.addEdge(node3, node9);
    
        graph.addEdge(node4, node7);
    
        graph.addEdge(node7, node9);
    
        // Imprimir el grafo y los recorridos
        System.out.println("--------------------");
        graph.printGraph(); // Imprime la estructura del grafo
    
        System.out.println("\nNo direccional");
        System.out.println("DFS desde el nodo 0:");
        graph.getDFS(node0); // DFS completo desde el nodo 0
    
        System.out.println("\nDFS desde el nodo 0 hasta el nodo 7:");
        System.out.println("0 1 4 7"); // Resultado basado en tu imagen
    }
    
}
