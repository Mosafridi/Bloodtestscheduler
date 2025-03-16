/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

import java.util.ArrayList;

/**
 *
 * @author shoai
 */
public class PatientList  implements ListADT<Patient> {
     private ArrayList<Patient> patients;

        public PatientList() {
            patients = new ArrayList<>();
        }

        @Override
        public void add(Patient item) {
            patients.add(item);
        }

        @Override
        public boolean remove(Patient item) {
            return patients.remove(item);
        }

        @Override
        public Patient get(int index) {
            return patients.get(index);
        }

        @Override
        public int size() {
            return patients.size();
        }

        @Override
        public boolean isEmpty() {
            return patients.isEmpty();
        }

        @Override
        public boolean contains(Patient item) {
            return patients.contains(item);
        }

        public ArrayList<Patient> getAll() {
            return new ArrayList<>(patients);
        }
}
