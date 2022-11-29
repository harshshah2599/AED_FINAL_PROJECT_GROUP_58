/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import model.Enterprise.NGOEnterprise;
import model.Person.Person;
import java.util.Date;

/**
 *
 * @author karth
 */
public class EntryChildWorkRequest extends WorkRequest {
    private String ngoName;
    private NGOEnterprise nGOEnterprise;
    private boolean isAccepted;
    private boolean hospitalAppointmentBooked;
    private Date hospitalAppointmentBookingDate;

    public Date getHospitalAppointmentBookingDate() {
        return hospitalAppointmentBookingDate;
    }

    public void setHospitalAppointmentBookingDate(Date hospitalAppointmentBookingDate) {
        this.hospitalAppointmentBookingDate = hospitalAppointmentBookingDate;
    }

    public boolean isHospitalAppointmentBooked() {
        return hospitalAppointmentBooked;
    }

    public void setHospitalAppointmentBooked(boolean hospitalAppointmentBooked) {
        this.hospitalAppointmentBooked = hospitalAppointmentBooked;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public String getRejectionMessage() {
        return rejectionMessage;
    }

    public void setRejectionMessage(String rejectionMessage) {
        this.rejectionMessage = rejectionMessage;
    }
    private String rejectionMessage;
    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public NGOEnterprise getnGOEnterprise() {
        return nGOEnterprise;
    }

    public void setnGOEnterprise(NGOEnterprise nGOEnterprise) {
        this.nGOEnterprise = nGOEnterprise;
    }
    private Person person;
    public EntryChildWorkRequest(){
    this.person = new Person();
    
    }
    
}
