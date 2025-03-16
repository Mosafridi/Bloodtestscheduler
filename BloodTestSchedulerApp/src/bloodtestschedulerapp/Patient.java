/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestschedulerapp;

/**
 *
 * @author shoaib
 */
public class Patient {
      private String name;
        private int age;
        private int priority;  // 1-5, where 5 is highest priority
        private boolean isHospitalWard;  // true if patient is from hospital ward
        private String appointmentTime;
        private boolean noShow;

        public Patient(String name, int age, int priority, boolean isHospitalWard) {
            this.name = name;
            this.age = age;
            this.priority = priority;
            this.isHospitalWard = isHospitalWard;
            this.noShow = false;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public int getPriority() { return priority; }
        public boolean isHospitalWard() { return isHospitalWard; }
        public String getAppointmentTime() { return appointmentTime; }
        public boolean isNoShow() { return noShow; }

        public void setAppointmentTime(String time) { this.appointmentTime = time; }
        public void setNoShow(boolean noShow) { this.noShow = noShow; }

        @Override
        public String toString() {
            return name + " (Age: " + age + ", Priority: " + priority + 
                  ", Hospital Ward: " + (isHospitalWard ? "Yes" : "No") + ")";
        }
}
