package ry.basic.model;

import java.util.Date;

public class DataProcessor {
    private String idProject;

    private String idContract;

    private Integer curTerm;

    private Date dtObserve;

    private String flgValid;

    private Double amtPrinciple;

    private Double amtCurPrinciple;

    private Integer days;

    private String flgType;

    private Long cdBatchId;

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject == null ? null : idProject.trim();
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract == null ? null : idContract.trim();
    }

    public Integer getCurTerm() {
        return curTerm;
    }

    public void setCurTerm(Integer curTerm) {
        this.curTerm = curTerm;
    }

    public Date getDtObserve() {
        return dtObserve;
    }

    public void setDtObserve(Date dtObserve) {
        this.dtObserve = dtObserve;
    }

    public String getFlgValid() {
        return flgValid;
    }

    public void setFlgValid(String flgValid) {
        this.flgValid = flgValid == null ? null : flgValid.trim();
    }

    public Double getAmtPrinciple() {
        return amtPrinciple;
    }

    public void setAmtPrinciple(Double amtPrinciple) {
        this.amtPrinciple = amtPrinciple;
    }

    public Double getAmtCurPrinciple() {
        return amtCurPrinciple;
    }

    public void setAmtCurPrinciple(Double amtCurPrinciple) {
        this.amtCurPrinciple = amtCurPrinciple;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getFlgType() {
        return flgType;
    }

    public void setFlgType(String flgType) {
        this.flgType = flgType == null ? null : flgType.trim();
    }

    public Long getCdBatchId() {
        return cdBatchId;
    }

    public void setCdBatchId(Long cdBatchId) {
        this.cdBatchId = cdBatchId;
    }
}