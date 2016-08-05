import model.Contrat;
import model.ContratEtude;
import model.TypeContrat;

import java.util.Date;

/**
 * Created by mehdi on 8/4/16.
 */
public class Main {
    public static void main(String[] argv){
        Contrat c = new ContratEtude("id", new Date(), false, TypeContrat.Etude, 12343, null); System.out.println(c.toString());

    }
}
