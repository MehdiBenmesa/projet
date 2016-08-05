package model;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by mehdi on 8/4/16.
 */
public class EtapeEtude {
    private int dureePhase;
    private int phaseId;
    private String phaseName;
    private int pourcentagePhase;

    public EtapeEtude(int dureePhase, int phaseId, String phaseName, int pourcentagePhase) {
        this.dureePhase = dureePhase;
        this.phaseId = phaseId;
        this.phaseName = phaseName;
        this.pourcentagePhase = pourcentagePhase;
    }

    public int getDureePhase() {
        return dureePhase;
    }

    public void setDureePhase(int dureePhase) {
        this.dureePhase = dureePhase;
    }

    public int getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public int getPourcentagePhase() {
        return pourcentagePhase;
    }

    public void setPourcentagePhase(int pourcentagePhase) {
        this.pourcentagePhase = pourcentagePhase;
    }
}
