package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class ContratEtudeSuivi extends Contrat{
    private double montantEtude;
    private double montantSuivi;
    private ArrayList<IntervenantSuivi> intervenantSuivis;
    private ArrayList<EtapeEtude> etapeEtudes;

    public ContratEtudeSuivi(String contratId, Date contratDate, boolean retenu, TypeContrat typeContrat, double montantEtude, double montantSuivi, ArrayList<IntervenantSuivi> intervenantSuivis, ArrayList<EtapeEtude> etapeEtudes) {
        super(contratId, contratDate, retenu, typeContrat);
        this.montantEtude = montantEtude;
        this.montantSuivi = montantSuivi;
        this.intervenantSuivis = intervenantSuivis;
        this.etapeEtudes = etapeEtudes;
    }

    public double getMontantEtude() {
        return montantEtude;
    }

    public void setMontantEtude(double montantEtude) {
        this.montantEtude = montantEtude;
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

    public ArrayList<EtapeEtude> getEtapeEtudes() {
        return etapeEtudes;
    }

    public void setEtapeEtudes(ArrayList<EtapeEtude> etapeEtudes) {
        this.etapeEtudes = etapeEtudes;
    }
}
