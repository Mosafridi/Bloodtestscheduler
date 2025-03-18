/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestschedulerapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
/**
 *
 * @author shoaib
 */

public class BloodTestSchedulerApp {
    private AppointmentPriorityQueue appointmentQueue;
    private NoShowQueue noShowQueue;
    private PatientList patientList;
    
    public BloodTestSchedulerApp() {
        appointmentQueue = new AppointmentPriorityQueue();
        noShowQueue = new NoShowQueue();
        patientList = new PatientList();
    }
    
    public void registerPatient(String name, int age, String priority, String gpDetails, boolean hospitalWard) {
        Patient patient = new Patient(name, age, priority, gpDetails, hospitalWard);
        appointmentQueue.insert(patient);
        patientList.add(patient);
    }
    
    public Patient getNextPatient() {
        return appointmentQueue.extractMax();
    }
    
    public void markAsNoShow() {
        Patient patient = appointmentQueue.extractMax();
        if (patient != null) {
            noShowQueue.enqueue(patient);
        }
    }
    
    public Patient findHighestPriority() {
        return appointmentQueue.peekMax();
    }
    
    public PatientList getPatientList() {
        return patientList;
    }
    
    public AppointmentPriorityQueue getAppointmentQueue() {
        return appointmentQueue;
    }
    
    public NoShowQueue getNoShowQueue() {
        return noShowQueue;
    }
}
