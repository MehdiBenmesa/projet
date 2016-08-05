package model;

/**
 * Created by mehdi on 8/4/16.
 */
public abstract class LigneFacture {
   private int ligneID;

    public LigneFacture(int ligneID) {
        this.ligneID = ligneID;
    }

    public int getLigneID() {
        return ligneID;
    }

    public void setLigneID(int ligneID) {
        this.ligneID = ligneID;
    }
}
