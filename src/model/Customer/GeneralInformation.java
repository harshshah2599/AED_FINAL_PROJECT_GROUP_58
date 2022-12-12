/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Customer;

/**
 *
 * @author karth
 */


// General information of the customer is collected when assigned to a counsellor.

// A table will register all the details.

public class GeneralInformation {
    private String familyType;

    public String getFamilyType() {
        return familyType;
    }

    

    public boolean isCriminalHistory() {
        return criminalHistory;
    }

    public void setCriminalHistory(boolean criminalHistory) {
        this.criminalHistory = criminalHistory;
    }

    public boolean isDrugHsitory() {
        return drugHsitory;
    }

    public void setDrugHsitory(boolean drugHsitory) {
        this.drugHsitory = drugHsitory;
    }

    public boolean isBacklogs() {
        return backlogs;
    }

    

    public boolean isComputerKnowldege() {
        return computerKnowldege;
    }

    public void setComputerKnowldege(boolean computerKnowldege) {
        this.computerKnowldege = computerKnowldege;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }
    
    public boolean isTechnicalKnowldege() {
        return technicalKnowldege;
    }

    public void setTechnicalKnowldege(boolean technicalKnowldege) {
        this.technicalKnowldege = technicalKnowldege;
    }
    
    public void setBacklogs(boolean backlogs) {
        this.backlogs = backlogs;
    }

    public boolean isPhysicalActive() {
        return physicalActive;
    }

    public void setPhysicalActive(boolean physicalActive) {
        this.physicalActive = physicalActive;
    }

    public boolean isMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(boolean medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public boolean isCanReadWrite() {
        return canReadWrite;
    }

    public void setCanReadWrite(boolean canReadWrite) {
        this.canReadWrite = canReadWrite;
    }

    public boolean isCanTakeTraining() {
        return canTakeTraining;
    }

    public void setCanTakeTraining(boolean canTakeTraining) {
        this.canTakeTraining = canTakeTraining;
    }

    public String getEducationalFieldOfIntrest() {
        return educationalFieldOfIntrest;
    }

    public void setEducationalFieldOfIntrest(String educationalFieldOfIntrest) {
        this.educationalFieldOfIntrest = educationalFieldOfIntrest;
    }
    
    
    
    
    private boolean criminalHistory;
    private boolean drugHsitory;
    private boolean backlogs;
    private boolean computerKnowldege;
    private boolean technicalKnowldege;
    private boolean physicalActive;
    private boolean medicalCondition;
    private boolean canReadWrite;
    private boolean canTakeTraining;
    private String educationalFieldOfIntrest;
}
