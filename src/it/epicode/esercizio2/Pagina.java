package it.epicode.esercizio2;

public class Pagina implements BookComponent {
    @Override
    public void print() {
        System.out.println("Stampa pagina singola");
    }

    @Override
    public int calcolaNumeroPagine() {
        return 1;
    }
}
