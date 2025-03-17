/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author shoaib
 */


public class AppointmentPriorityQueue implements PriorityQueueADT<Patient> {
    private PriorityQueue<Patient> priorityQueue;

    public AppointmentPriorityQueue() {
        priorityQueue = new PriorityQueue<>((p1, p2) -> {
            // First compare by hospital ward status
            if (p1.isHospitalWard() != p2.isHospitalWard()) {
                return p1.isHospitalWard() ? -1 : 1;
            }
            // Then compare by priority
            int priorityDiff = p1.priorityLevel() - p2.priorityLevel();
            if (priorityDiff != 0) {
                return priorityDiff;
            }
            // Finally compare by age (older patients first)
            return p2.getAge() - p1.getAge();
        });
    }

    @Override
    public void insert(Patient item) {
        priorityQueue.add(item);
    }

    @Override
    public Patient extractMax() {
        return priorityQueue.poll();
    }

    @Override
    public Patient peekMax() {
        return priorityQueue.peek();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    public List<Patient> getAllInPriorityOrder() {
        List<Patient> result = new ArrayList<>();
        PriorityQueue<Patient> tempQueue = new PriorityQueue<>(priorityQueue);
        while (!tempQueue.isEmpty()) {
            result.add(tempQueue.poll());
        }
        return result;
    }
    
    @Override
    public String toString() {
        return getAllInPriorityOrder().toString();
    }
}
