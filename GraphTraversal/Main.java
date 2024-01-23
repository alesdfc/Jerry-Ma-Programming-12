package GraphTraversal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {

        LinkedList<Integer> queue = new LinkedList<Integer>();
        graph.get(0).setVisited(true);
        for (int i = 0; i < graph.get(0).getNodes().size(); i++) {
            queue.add(graph.get(0).getNodes().get(i));
        }

        System.out.println("This is the queue right now: " + queue);
        while(!queue.isEmpty()) {
            Node Node = graph.get(queue.get(0) - 1); // - 1 because the graph arraylist has id 1 as entry 0, id 2 as entry 1, etc.
            for (int i = 0; i < Node.getNodes().size(); i++) {
                if (!graph.get(Node.getNodes().get(i)).isVisited()) {
                    Node.setVisited(true);
                    for (int k = 0; k < Node.getNodes().size(); k++) {
                        if (!graph.get(Node.getNodes().get(k) - 1).isVisited()) {
                            if (!queue.contains(Node.getNodes().get(k))) {
                                queue.add(Node.getNodes().get(k));
                            }
                        }
                    }
                }
            }
            queue.remove(0);
            System.out.println("This is the queue right now: " + queue);
        }
        System.out.println("Every node has been visited from the starting node.");
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}

