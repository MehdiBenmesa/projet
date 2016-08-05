package model;

/**
 * Created by mehdi on 8/4/16.
 */
public class IntervenantSuivi {
    private int intervenantSuiviId;
    private String intervenant;
    private double montantIntervenant;
    private int intervenantNbr;
    private String nbrVisite;

    public IntervenantSuivi(int intervenantSuiviId, String intervenant, double montantIntervenant, int intervenantNbr, String nbrVisite) {
        this.intervenantSuiviId = intervenantSuiviId;
        this.intervenant = intervenant;
        this.montantIntervenant = montantIntervenant;
        this.intervenantNbr = intervenantNbr;
        this.nbrVisite = nbrVisite;
    }

    public int getIntervenantSuiviId() {
        return intervenantSuiviId;
    }

    public void setIntervenantSuiviId(int intervenantSuiviId) {
        this.intervenantSuiviId = intervenantSuiviId;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    public double getMontantIntervenant() {
        return montantIntervenant;
    }

    public void setMontantIntervenant(double montantIntervenant) {
        this.montantIntervenant = montantIntervenant;
    }

    public int getIntervenantNbr() {
        return intervenantNbr;
    }

    public void setIntervenantNbr(int intervenantNbr) {
        this.intervenantNbr = intervenantNbr;
    }

    public String getNbrVisite() {
        return nbrVisite;
    }

    public void setNbrVisite(String nbrVisite) {
        this.nbrVisite = nbrVisite;
    }
}
