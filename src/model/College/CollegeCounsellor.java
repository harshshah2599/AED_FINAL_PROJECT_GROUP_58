/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.College;

/**
 *
 * @author karth
 */
public class CollegeCounsellor {
    private String counsellorName;
    private String counsellingCompanyName;
    private String  counsellorQualification;

    public void setCounsellorQualification(String counsellorQualification) {
        this.counsellorQualification = counsellorQualification;
    }

    public String getCounsellorQualification() {
        return counsellorQualification;
    }

    
    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public int getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(int counsellorId) {
        this.counsellorId = counsellorId;
    }

    public String getCounsellingCompanyName() {
        if(counsellingCompanyName==null)
        {
            counsellingCompanyName="";
        }
        return counsellingCompanyName;
    }

    public void setCounsellingCompanyName(String counsellingCompanyName) {
        this.counsellingCompanyName = counsellingCompanyName;
    }
    
    public boolean isIsCounsellorAvailable() {
        return isCounsellorAvailable;
    }

    public void setIsCounsellorAvailable(boolean isCounsellorAvailable) {
        this.isCounsellorAvailable = isCounsellorAvailable;
    }
    
    
    private int counsellorId;
    private boolean isCounsellorAvailable;
    
}
