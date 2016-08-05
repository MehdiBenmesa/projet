package model;

/**
 * Created by mehdi on 8/4/16.
 */
public class LigneFactureEtude extends LigneFacture {
    private Double pourcentageActuel;
    private EtapeEtude etapeEtude;

    public LigneFactureEtude(int ligneID, Double pourcentageActuel, EtapeEtude etapeEtude) {
        super(ligneID);
        this.pourcentageActuel = pourcentageActuel;
        this.etapeEtude = etapeEtude;
    }

    public EtapeEtude getEtapeEtude() {
        return etapeEtude;
    }

    public void setEtapeEtude(EtapeEtude etapeEtude) {
        this.etapeEtude = etapeEtude;
    }
    public Double getPourcentageActuel() {
        return pourcentageActuel;
    }

    public void setPourcentageActuel(Double pourcentageActuel) {
        this.pourcentageActuel = pourcentageActuel;
    }
}
