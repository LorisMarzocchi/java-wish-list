package org.lessons.java;

public class Regalo {
    private String descrizione;
    private String destinatario;


    @Override
    public String toString() {
        return "Regalo: " +
                "descrizione='" + descrizione + '\'' +
                ", destinatario='" + destinatario + '\n';
    }

    public Regalo(String descrizione, String destinatario) {
        this.descrizione = descrizione;
        this.destinatario = destinatario;
    }
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }


}
