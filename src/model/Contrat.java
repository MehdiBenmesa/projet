package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public abstract class Contrat {
    private String contratId;
    private Date contratDate;
    private boolean retenu;
    private TypeContrat typeContrat;
    private ArrayList<Avenant> avenants;
    private ArrayList<ODS> ods;
    private Projet projet;
    private ArrayList<Facture> factures;


    public Contrat(String contratId, Date contratDate, boolean retenu, TypeContrat typeContrat) {
        this.contratId = contratId;
        this.contratDate = contratDate;
        this.retenu = retenu;
        this.typeContrat = typeContrat;
    }

    public Contrat addFacture(Facture f){
        this.factures.add(f);
        return this;
    }
    public Contrat addOds(ODS o){
        this.ods.add(o);
        return this;
    }
    public Contrat addAvenant(Avenant a){
        this.avenants.add(a);
        return this;
    }

    public ArrayList<Avenant> getAvenants() {
        return avenants;
    }

    public void setAvenants(ArrayList<Avenant> avenants) {
        this.avenants = avenants;
    }

    public ArrayList<ODS> getOds() {
        return ods;
    }

    public void setOds(ArrayList<ODS> ods) {
        this.ods = ods;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public ArrayList<Facture> getFactures() {
        return factures;
    }

    public void setFactures(ArrayList<Facture> factures) {
        this.factures = factures;
    }



    public String getContratId() {
        return contratId;
    }

    public void setContratId(String contratId) {
        this.contratId = contratId;
    }

    public Date getContratDate() {
        return contratDate;
    }

    public void setContratDate(Date contratDate) {
        this.contratDate = contratDate;
    }

    public boolean isRetenu() {
        return retenu;
    }

    public void setRetenu(boolean retenu) {
        this.retenu = retenu;
    }

    public TypeContrat getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(TypeContrat typeContrat) {
        this.typeContrat = typeContrat;
    }

    public String toString(){
        return "id: "+ this.contratId + "\n" +
                "date: "+ this.contratDate + "\n" +
                "type: "+ this.typeContrat + "\n" +
                "retenu: "+ this.retenu + "\n";
    }
}
