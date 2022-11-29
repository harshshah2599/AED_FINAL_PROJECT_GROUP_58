/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import model.Hospital.Hospital;
import java.util.Date;

/**
 *
 * @author karth
 */
public class EntryHospitalWorkRequest {
    private EntryChildWorkRequest entryChildWorkRequest;
    private double height;
    private double weight;
    private boolean medicalCheckupCompleted;
    private Date medicalCheckupCompletedDate;

    public Date getMedicalCheckupCompletedDate() {
        return medicalCheckupCompletedDate;
    }

    public void setMedicalCheckupCompletedDate(Date medicalCheckupCompletedDate) {
        this.medicalCheckupCompletedDate = medicalCheckupCompletedDate;
    }

    public boolean isMedicalCheckupCompleted() {
        return medicalCheckupCompleted;
    }

    public void setMedicalCheckupCompleted(boolean medicalCheckupCompleted) {
        this.medicalCheckupCompleted = medicalCheckupCompleted;
    }
    private Hospital hospital;
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public EntryChildWorkRequest getEntryChildWorkRequest() {
        return entryChildWorkRequest;
    }

    public void setEntryChildWorkRequest(EntryChildWorkRequest entryChildWorkRequest) {
        this.entryChildWorkRequest = entryChildWorkRequest;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
