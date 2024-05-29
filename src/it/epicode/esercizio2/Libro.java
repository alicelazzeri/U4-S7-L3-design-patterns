package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements BookComponent {

    public List<String> autori = new ArrayList<>();
    private double prezzo;
    private Sezione contenuti = new Sezione();

    public void addSezione(Sezione sezione) {
        contenuti.add(sezione);
    }

    public Libro(double prezzo, List<String> autori) {
        this.prezzo = prezzo;
        this.autori = autori;
    }

    @Override
    public void print() {
        System.out.println("Stampa libro intero: ");
        contenuti.print();
    }

    @Override
    public int calcolaNumeroPagine() {
        return contenuti.calcolaNumeroPagine();
    }
}
