package com.learn.java.dynamicprogramming;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.List.of;

@RequiredArgsConstructor
@Data
class Vertex<T> {
    @NonNull
    T index;
    boolean isVisited = false;
    @ToString.Exclude
    List<Vertex<T>> connectedVertex = new LinkedList<>();
}

class BreadthFirstSearch<T> {
    public void traverse(Vertex<T> startVertex) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            current.setVisited(true);
            System.out.println(current);
            queue.addAll(current.connectedVertex);
        }
    }
    public void showBfs() {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setConnectedVertex(of(v1, v2));
        v1.setConnectedVertex(of(v3, v4));
        v2.setConnectedVertex(of(v5));


        BreadthFirstSearch<Integer> b = new BreadthFirstSearch<>();
        b.traverse(v0);
    }
}

class DepthFirstSearch<T> {
    public void traverse(Vertex<T> startVertex) {
        startVertex.setVisited(true);
        System.out.println(startVertex);
        startVertex.connectedVertex.forEach(this::traverse);
    }
    public void showDfs() {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setConnectedVertex(of(v1, v2));
        v1.setConnectedVertex(of(v3, v4));
        v2.setConnectedVertex(of(v5));


        DepthFirstSearch<Integer> b = new DepthFirstSearch<>();
        b.traverse(v0);
    }
}

public class GraphTraversal {
    public static void main(String[] args) {
//        new BreadthFirstSearch<Integer>().showBfs();
        new DepthFirstSearch<Integer>().showDfs();


    }
}
