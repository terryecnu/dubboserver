package ry.basic.model;

import java.util.Date;

public class Sc {
    private String sid;

    private String cid;

    private Double score;

    private Date updatetme;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getUpdatetme() {
        return updatetme;
    }

    public void setUpdatetme(Date updatetme) {
        this.updatetme = updatetme;
    }
}