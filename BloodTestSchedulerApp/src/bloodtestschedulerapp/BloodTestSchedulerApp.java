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
    
    
}
