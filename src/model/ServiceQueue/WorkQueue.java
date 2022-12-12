/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class WorkQueue {
    
    private ArrayList<PlaceOrderWorkRequest> workRequestList;
    private ArrayList<EntryChildWorkRequest> workRequestListNew;
    private ArrayList<AssignToCounsellorWorkRequest> assignToCounsellorWorkRequests;
    private ArrayList<AssignToCollegeWorkRequest> assignToCollegeWorkRequests;
    private ArrayList<EntryHospitalWorkRequest> workRequestHospital;
    public ArrayList<EntryHospitalWorkRequest> getWorkRequestHospital() {
          if(workRequestHospital==null)
        {
            workRequestHospital=new ArrayList<>();
        }
        return workRequestHospital;
    }

    public void setWorkRequestHospital(ArrayList<EntryHospitalWorkRequest> workRequestHospital) {
        this.workRequestHospital = workRequestHospital;
    }

    public ArrayList<AssignToCollegeWorkRequest> getAssignToCollegeWorkRequests() {
        if(assignToCollegeWorkRequests==null)
        {
            assignToCollegeWorkRequests=new ArrayList<>();
        }
        return assignToCollegeWorkRequests;
    }

    public void setAssignToCollegeWorkRequests(ArrayList<AssignToCollegeWorkRequest> assignToCollegeWorkRequests) {
        this.assignToCollegeWorkRequests = assignToCollegeWorkRequests;
    }

    public ArrayList<AssignToCounsellorWorkRequest> getAssignToCounsellorWorkRequests() {
        if(assignToCounsellorWorkRequests==null)
        {
            assignToCounsellorWorkRequests=new ArrayList<>();
        }
        return assignToCounsellorWorkRequests;
    }

    public void setAssignToCounsellorWorkRequests(ArrayList<AssignToCounsellorWorkRequest> assignToCounsellorWorkRequests) {
        this.assignToCounsellorWorkRequests = assignToCounsellorWorkRequests;
    }

    public WorkQueue() {
        workRequestList = new ArrayList();
        workRequestListNew=new ArrayList();
        assignToCounsellorWorkRequests=new ArrayList<>();
    }
    public ArrayList<PlaceOrderWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(PlaceOrderWorkRequest orderWorkRequest) {
        this.workRequestList.add(orderWorkRequest);
    }

    public ArrayList<EntryChildWorkRequest> getWorkRequestListNew() {
        if(workRequestListNew==null)
        {
            workRequestListNew = new ArrayList<EntryChildWorkRequest>();
        }
        return workRequestListNew;
    }
    
}
