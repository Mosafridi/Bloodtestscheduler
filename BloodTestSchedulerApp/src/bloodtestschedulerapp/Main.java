/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author shoai
 */
public class Main {
    public static void main(String[] args) {
        // Create and display the main UI form
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestSchedulerApp().setVisible(true);
            }
        });
    }
}
