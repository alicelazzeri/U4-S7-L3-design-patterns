package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements BookComponent {
    private List<BookComponent> components = new ArrayList<>();
    public void add(BookComponent component) {
        components.add(component);
    }
    @Override
    public void print() {
        System.out.println("Stampa sezione: ");
        for (BookComponent component : components) {
            component.print();
        }
    }

    @Override
    public int calcolaNumeroPagine() {
        int totalePagine = 0;
        for (BookComponent component : components) {
            totalePagine += component.calcolaNumeroPagine();
        }
        return totalePagine;
    }
}
