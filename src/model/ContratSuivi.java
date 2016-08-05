package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class ContratSuivi extends Contrat{
    private double montantSuivi;
    private ArrayList<IntervenantSuivi> intervenantSuivis;

    public ContratSuivi(String contratId, Date contratDate, boolean retenu, TypeContrat typeContrat, double montantSuivi, ArrayList<IntervenantSuivi> intervenantSuivis) {
        super(contratId, contratDate, retenu, typeContrat);
        this.montantSuivi = montantSuivi;
        this.intervenantSuivis = intervenantSuivis;
    }

    public double getMontantSuivi() {
        return montantSuivi;
    }

    public void setMontantSuivi(double montantSuivi) {
        this.montantSuivi = montantSuivi;
    }

    public ArrayList<IntervenantSuivi> getIntervenantSuivis() {
        return intervenantSuivis;
    }

    public void setIntervenantSuivis(ArrayList<IntervenantSuivi> intervenantSuivis) {
        this.intervenantSuivis = intervenantSuivis;
    }
}
