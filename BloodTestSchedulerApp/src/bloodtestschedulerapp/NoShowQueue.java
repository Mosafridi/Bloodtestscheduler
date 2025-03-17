/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *

 * @author shoaib
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoShowQueue implements QueueADT<Patient> {
    private static final int MAX_SIZE = 5;
    private LinkedList<Patient> queue;

    public NoShowQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(Patient item) {
        if (queue.size() >= MAX_SIZE) {
            queue.removeFirst();
        }
        queue.addLast(item);
    }

    @Override
    public Patient dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    @Override
    public Patient peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    public List<Patient> getAllNoShows() {
        return new ArrayList<>(queue);
    }
    
    @Override
    public String toString() {
        return queue.toString();
    }
}
