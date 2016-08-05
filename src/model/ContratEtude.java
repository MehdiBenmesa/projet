package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class ContratEtude extends Contrat{
    private double montantEtude;

    private ArrayList<EtapeEtude> etapeEtudes;

    public ContratEtude(String contratId, Date contratDate, boolean retenu, TypeContrat typeContrat, double montantEtude, ArrayList<EtapeEtude> etapeEtudes) {
        super(contratId, contratDate, retenu, typeContrat);
        this.montantEtude = montantEtude;
        this.etapeEtudes = etapeEtudes;
    }

    public ArrayList<EtapeEtude> getEtapeEtudes() {
        return etapeEtudes;
    }

    public void setEtapeEtudes(ArrayList<EtapeEtude> etapeEtudes) {
        this.etapeEtudes = etapeEtudes;
    }

    public double getMontantEtude() {
        return montantEtude;
    }

    public void setMontantEtude(double montantEtude) {
        this.montantEtude = montantEtude;
    }

    public String toString(){
        return super.toString() +
                "montant d'etude : " + this.montantEtude;
    }
}
