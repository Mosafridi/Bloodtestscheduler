/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author shoaib
 * source--> https://www.geeksforgeeks.org/priority-queue-class-in-java/
 */
public interface PriorityQueueADT<T> {
    void insert(T item);
    T extractMax();
    T peekMax();
    boolean isEmpty();
    int size();
}
