package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class Facture {
    private Date dateFacture;
    private int numFacture;
    private ArrayList<LigneFacture> ligneFactures;

    public Facture(Date dateFacture, int numFacture) {
        this.dateFacture = dateFacture;
        this.numFacture = numFacture;
    }

    public Facture addLigneFacture(LigneFacture l){
        this.ligneFactures.add(l);
        return this;
    }
    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public int getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }

    public ArrayList<LigneFacture> getLigneFactures() {
        return ligneFactures;
    }

    public void setLigneFactures(ArrayList<LigneFacture> ligneFactures) {
        this.ligneFactures = ligneFactures;
    }
}
