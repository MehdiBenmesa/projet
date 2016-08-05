package model;

/**
 * Created by mehdi on 8/4/16.
 */
public class Projet {
    private String contratId;
    private double montantGlobal;
    private double montantMC;
    private double pourcentageEtude;
    private String projetName;
    private String projetType;
    private double superficie;

    public Projet(String contratId, double montantGlobal, double montantMC, double pourcentageEtude, String projetName, String projetType, double superficie) {
        this.contratId = contratId;
        this.montantGlobal = montantGlobal;
        this.montantMC = montantMC;
        this.pourcentageEtude = pourcentageEtude;
        this.projetName = projetName;
        this.projetType = projetType;
        this.superficie = superficie;
    }

    public String getContratId() {
        return contratId;
    }

    public void setContratId(String contratId) {
        this.contratId = contratId;
    }

    public double getMontantGlobal() {
        return montantGlobal;
    }

    public void setMontantGlobal(double montantGlobal) {
        this.montantGlobal = montantGlobal;
    }

    public double getMontantMC() {
        return montantMC;
    }

    public void setMontantMC(double montantMC) {
        this.montantMC = montantMC;
    }

    public double getPourcentageEtude() {
        return pourcentageEtude;
    }

    public void setPourcentageEtude(double pourcentageEtude) {
        this.pourcentageEtude = pourcentageEtude;
    }

    public String getProjetName() {
        return projetName;
    }

    public void setProjetName(String projetName) {
        this.projetName = projetName;
    }

    public String getProjetType() {
        return projetType;
    }

    public void setProjetType(String projetType) {
        this.projetType = projetType;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
