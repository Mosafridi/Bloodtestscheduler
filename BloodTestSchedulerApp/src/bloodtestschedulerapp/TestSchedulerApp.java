/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestschedulerapp;

import bloodtestschedulerapp.AppointmentPriorityQueue;
import bloodtestschedulerapp.NoShowQueue;
import bloodtestschedulerapp.Patient;
import bloodtestschedulerapp.PatientList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List; 
/**
 *
 * @author shoaib
 */
public class TestSchedulerApp extends javax.swing.JFrame {
private AppointmentPriorityQueue appointmentQueue;
    private NoShowQueue noShowQueue;
    private PatientList patientList;
    /**
     * Creates new form TestSchedulerApp
     */
    public TestSchedulerApp() {
       appointmentQueue = new AppointmentPriorityQueue();
        noShowQueue = new NoShowQueue();
        patientList = new PatientList();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLBL = new javax.swing.JLabel();
        ageLBL = new javax.swing.JLabel();
        piorityLBL = new javax.swing.JLabel();
        hospitalwardLBL = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        priorityCB = new javax.swing.JComboBox<>();
        hospitalwardCB = new javax.swing.JCheckBox();
        addpatientBTN = new javax.swing.JButton();
        noshowlistLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noshowlistTA = new javax.swing.JTextArea();
        priorityqueueLBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        priorityqueueTA = new javax.swing.JTextArea();
        allpatientLBL = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        allpatientTA = new javax.swing.JTextArea();
        nextpatientBTN = new javax.swing.JButton();
        noshowBTN = new javax.swing.JButton();
        findBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        gpdetailsLBL = new javax.swing.JLabel();
        gpdetailsTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLBL.setText("Patient Name");

        ageLBL.setText("Age");

        piorityLBL.setText("Priority");

        hospitalwardLBL.setText("Hospital Ward");

        priorityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "Urgent" }));

        hospitalwardCB.setText("YES");

        addpatientBTN.setText("Register Patient");
        addpatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpatientBTNActionPerformed(evt);
            }
        });

        noshowlistLBL.setText("No Show List");

        noshowlistTA.setColumns(20);
        noshowlistTA.setRows(5);
        jScrollPane1.setViewportView(noshowlistTA);

        priorityqueueLBL.setText("Priority Queue");

        priorityqueueTA.setColumns(20);
        priorityqueueTA.setRows(5);
        jScrollPane2.setViewportView(priorityqueueTA);

        allpatientLBL.setText("All Patients");

        allpatientTA.setColumns(20);
        allpatientTA.setRows(5);
        jScrollPane3.setViewportView(allpatientTA);

        nextpatientBTN.setText("Schedule Next Patient");
        nextpatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextpatientBTNActionPerformed(evt);
            }
        });

        noshowBTN.setText("Mark as No-Show");
        noshowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noshowBTNActionPerformed(evt);
            }
        });

        findBTN.setText("Find Highest Priority");
        findBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        gpdetailsLBL.setText("GP Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allpatientLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addpatientBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gpdetailsLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(piorityLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalwardLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ageTF, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(priorityCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalwardCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gpdetailsTF))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priorityqueueLBL)
                            .addComponent(noshowlistLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(nextpatientBTN)
                        .addGap(33, 33, 33)
                        .addComponent(noshowBTN)
                        .addGap(42, 42, 42)
                        .addComponent(findBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(exitBTN)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noshowlistLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLBL)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpdetailsLBL)
                            .addComponent(gpdetailsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priorityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(piorityLBL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalwardLBL)
                            .addComponent(hospitalwardCB))
                        .addGap(18, 18, 18)
                        .addComponent(addpatientBTN))
                    .addComponent(jScrollPane1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityqueueLBL)
                    .addComponent(allpatientLBL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextpatientBTN)
                    .addComponent(noshowBTN)
                    .addComponent(findBTN)
                    .addComponent(exitBTN))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void addpatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpatientBTNActionPerformed
     try {
            String name = nameTF.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a patient name");
                return;
            }
            
            int age;
            try {
                age = Integer.parseInt(ageTF.getText().trim());
                if (age <= 0 || age > 120) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid age between 1 and 120");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age");
                return;
            }
            
            String priority = (String) priorityCB.getSelectedItem();
            String gpDetails = gpdetailsTF.getText().trim();
            if (gpDetails.isEmpty()) {
                gpDetails = "Unknown";
            }
            boolean hospitalWard = hospitalwardCB.isSelected();

            Patient patient = new Patient(name, age, priority, gpDetails, hospitalWard);
            appointmentQueue.insert(patient);
            patientList.add(patient);

            // Update displays
            updateDisplays();
            
            // Clear form
            nameTF.setText("");
            ageTF.setText("");
            gpdetailsTF.setText("");
            priorityCB.setSelectedIndex(0);
            hospitalwardCB.setSelected(false);
            
            JOptionPane.showMessageDialog(this, "Patient registered successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addpatientBTNActionPerformed

    private void nextpatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextpatientBTNActionPerformed
       
    }//GEN-LAST:event_nextpatientBTNActionPerformed

    private void noshowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noshowBTNActionPerformed
    Patient nextPatient = appointmentQueue.extractMax();
        if (nextPatient != null) {
            noShowQueue.enqueue(nextPatient);
            JOptionPane.showMessageDialog(this, "Marked as no-show: " + nextPatient.getName());
            updateDisplays();
        } else {
            JOptionPane.showMessageDialog(this, "No patients in queue");
        }
    }//GEN-LAST:event_noshowBTNActionPerformed

    private void findBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBTNActionPerformed
     
    }//GEN-LAST:event_findBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
  System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void updateDisplays() {
    // Update all text areas
  
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestSchedulerApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addpatientBTN;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel allpatientLBL;
    private javax.swing.JTextArea allpatientTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton findBTN;
    private javax.swing.JLabel gpdetailsLBL;
    private javax.swing.JTextField gpdetailsTF;
    private javax.swing.JCheckBox hospitalwardCB;
    private javax.swing.JLabel hospitalwardLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextpatientBTN;
    private javax.swing.JButton noshowBTN;
    private javax.swing.JLabel noshowlistLBL;
    private javax.swing.JTextArea noshowlistTA;
    private javax.swing.JLabel piorityLBL;
    private javax.swing.JComboBox<String> priorityCB;
    private javax.swing.JLabel priorityqueueLBL;
    private javax.swing.JTextArea priorityqueueTA;
    // End of variables declaration//GEN-END:variables
}
