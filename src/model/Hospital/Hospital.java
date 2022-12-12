/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hospital;

/**
 *
 * @author harsh
 */
public class Hospital {
    private String hospitalName;
    private double temperature;
    private double bloodPressure;
    private String prescription;

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    private boolean isHospitalAvailable;
    private int hospitalId;
    private Doctor doctor;
    private boolean appointmentSentToDoctor;

    public boolean isAppointmentSentToDoctor() {
        return appointmentSentToDoctor;
    }

    public void setAppointmentSentToDoctor(boolean appointmentSentToDoctor) {
        this.appointmentSentToDoctor = appointmentSentToDoctor;
    }

    public Doctor getDoctor() {
        if(doctor==null)
        {
            doctor=new Doctor();
        }
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

 

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
}
