/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

import java.awt.List;
import java.util.ArrayList;

// Implementation of List ADT for patients
class PatientList implements ListADT<Patient> {
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
    
    public Patient findPatient(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public boolean removePatient(String name) {
        Patient patient = findPatient(name);
        if (patient != null) {
            return remove(patient);
        }
        return false;
    }

    @Override
    public String toString() {
        return patients.toString();
    }
}
