/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author shoaib
 */

 // Interface for list operations
public interface ListADT<T> {
        void add(T item);
        boolean remove(T item);
        T get(int index);
        int size();
        boolean isEmpty();
        boolean contains(T item);
    }
