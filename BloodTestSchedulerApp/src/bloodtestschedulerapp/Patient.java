/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

import java.util.*;
/**
 *
 * @author shoaib
 */


// Patient class representing each person in the system
public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private String priority;
    private String gpDetails;
    private boolean hospitalWard;

    public Patient(String name, int age, String priority, String gpDetails, boolean hospitalWard) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.hospitalWard = hospitalWard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public boolean isHospitalWard() {
        return hospitalWard;
    }

    @Override
    public int compareTo(Patient other) {
        // First compare by hospital ward status
        if (this.hospitalWard != other.hospitalWard) {
            return this.hospitalWard ? -1 : 1;
        }
        
        // Then by priority
        int priorityDiff = this.priorityLevel() - other.priorityLevel();
        if (priorityDiff != 0) {
            return priorityDiff;
        }
        
        // Finally by age (older patients first)
        return other.age - this.age;
    }

    public int priorityLevel() {
        switch (priority.toLowerCase()) {
            case "urgent": case "high": return 1;
            case "medium": return 2;
            case "low": return 3;
            default: return 4;
        }
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Priority: " + priority + ", GP: " + gpDetails + ", Ward: " + (hospitalWard ? "Yes" : "No") + ")";
    }
}
