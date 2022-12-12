/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

/**
 *
 * @author harsh
 */
public class AssignToCollegeWorkRequest {
    private AssignToCounsellorWorkRequest assignToCounsellorWorkRequest;
    private String collegeName;
    private boolean AcceptedByCollege;

    public boolean isAcceptedByCollege() {
        return AcceptedByCollege;
    }

    public void setAcceptedByCollege(boolean AcceptedByCollege) {
        this.AcceptedByCollege = AcceptedByCollege;
    }

    public String getRejectionMessageByCollege() {
        return rejectionMessageByCollege;
    }

    public void setRejectionMessageByCollege(String rejectionMessageByCollege) {
        this.rejectionMessageByCollege = rejectionMessageByCollege;
    }
    private String rejectionMessageByCollege;

    public AssignToCounsellorWorkRequest getAssignToCounsellorWorkRequest() {
        return assignToCounsellorWorkRequest;
    }

    public void setAssignToCounsellorWorkRequest(AssignToCounsellorWorkRequest assignToCounsellorWorkRequest) {
        this.assignToCounsellorWorkRequest = assignToCounsellorWorkRequest;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
