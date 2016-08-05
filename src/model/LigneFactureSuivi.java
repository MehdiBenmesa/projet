package model;

/**
 * Created by mehdi on 8/4/16.
 */
public class LigneFactureSuivi extends LigneFacture{
    private int duree;
    private IntervenantSuivi intervenantSuivi;

    public LigneFactureSuivi(int ligneID, int duree, IntervenantSuivi intervenantSuivi) {
        super(ligneID);
        this.duree = duree;
        this.intervenantSuivi = intervenantSuivi;
    }
    public IntervenantSuivi getIntervenantSuivi() {
        return intervenantSuivi;
    }

    public void setIntervenantSuivi(IntervenantSuivi intervenantSuivi) {
        this.intervenantSuivi = intervenantSuivi;
    }
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
