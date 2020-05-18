package hw7;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdges("Тула", "Липецк");
        graph.addEdges("Рязань", "Тамбов");
        graph.addEdges("Калуга", "Орел");
        graph.addEdges("Тамбов", "Саратов");
        graph.addEdges("Орел", "Курск");
        graph.addEdges("Воронеж", "Липецк", "Саратов", "Курск");

        Stack<String> path = graph.findShortPath("Москва", "Воронеж");
        while (!path.empty()){
            System.out.println(path.pop());
        }
    }
}
