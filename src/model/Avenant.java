package model;

import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */

public class Avenant {
    private int avenantId;
    private Date dateAvenant;
    private int duree;
    private int avenantNum;

    public Avenant(int avenantId, Date dateAvenant, int duree, int avenantNum) {
        this.avenantId = avenantId;
        this.dateAvenant = dateAvenant;
        this.duree = duree;
        this.avenantNum = avenantNum;
    }

    public int getAvenantId() {
        return avenantId;
    }

    public void setAvenantId(int avenantId) {
        this.avenantId = avenantId;
    }

    public Date getDateAvenant() {
        return dateAvenant;
    }

    public void setDateAvenant(Date dateAvenant) {
        this.dateAvenant = dateAvenant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getAvenantNum() {
        return avenantNum;
    }

    public void setAvenantNum(int avenantNum) {
        this.avenantNum = avenantNum;
    }
}
