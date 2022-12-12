/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import model.College.CollegeCounsellor;
import model.Customer.GeneralInformation;

/**
 *
 * @author harsh
 */
public class AssignToCounsellorWorkRequest {
    CollegeCounsellor counsellor;
    EntryChildWorkRequest entryChildWorkRequest;
    private boolean requestCompleted;
    private GeneralInformation generalInformation;

    public GeneralInformation getGeneralInformation() {
        if(generalInformation==null)
        {
            generalInformation=new GeneralInformation();
        }
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public boolean isRequestCompleted() {
        return requestCompleted;
    }

    public void setRequestCompleted(boolean requestCompleted) {
        this.requestCompleted = requestCompleted;
    }

    public EntryChildWorkRequest getEntryChildWorkRequest() {
        return entryChildWorkRequest;
    }

    public void setEntryChildWorkRequest(EntryChildWorkRequest entryChildWorkRequest) {
        this.entryChildWorkRequest = entryChildWorkRequest;
    }

    public CollegeCounsellor getCounsellor() {
        if(counsellor==null){
            counsellor=new CollegeCounsellor();
        }
        return counsellor;
    }

    public void setCounsellor(CollegeCounsellor counsellor) {
        this.counsellor = counsellor;
    }
    
}
