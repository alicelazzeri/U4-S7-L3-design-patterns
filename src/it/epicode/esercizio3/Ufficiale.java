package it.epicode.esercizio3;

public class Ufficiale implements UfficialeMilitare {
    private UfficialeMilitare ufficialeMilitare;
    private int stipendio;

    public Ufficiale(int stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public void gestisciRichiesta(int importo) {

    }

    @Override
    public void impostaUfficialeSuperiore(UfficialeMilitare ufficialeSuperiore) {
        this.ufficialeMilitare = ufficialeSuperiore;
    }
}
