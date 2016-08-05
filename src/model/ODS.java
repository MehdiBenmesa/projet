package model;

import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class ODS {

    private Date dateOds;
    private int idOds;
    private TypeContrat typeOds;

    public ODS(Date dateOds, int idOds, TypeContrat typeOds) {
        this.dateOds = dateOds;
        this.idOds = idOds;
        this.typeOds = typeOds;
    }

    public Date getDateOds() {
        return dateOds;
    }

    public void setDateOds(Date dateOds) {
        this.dateOds = dateOds;
    }

    public int getIdOds() {
        return idOds;
    }

    public void setIdOds(int idOds) {
        this.idOds = idOds;
    }

    public TypeContrat getTypeOds() {
        return typeOds;
    }

    public void setTypeOds(TypeContrat typeOds) {
        this.typeOds = typeOds;
    }
}
