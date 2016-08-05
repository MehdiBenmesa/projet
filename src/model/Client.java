package model;

import java.util.ArrayList;

/**
 * Created by mehdi on 8/4/16.
 */
public class Client {
    private String codeClient;
    private String nameClient;
    private ArrayList<Contrat> contrats;

    public Client(String codeClient, String nameClient) {
        this.codeClient = codeClient;
        this.nameClient = nameClient;
    }

    public Client addContrat(Contrat c){
        this.contrats.add(c);
        return this;
    }
    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public ArrayList<Contrat> getContrats() {
        return contrats;
    }

}
