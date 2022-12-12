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


public class Doctor {
    private String doctorName;
    private int doctorId;
    private boolean doctorAvailable;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public boolean isDoctorAvailable() {
        return doctorAvailable;
    }

    public void setDoctorAvailable(boolean doctorAvailable) {
        this.doctorAvailable = doctorAvailable;
    }
 
}
