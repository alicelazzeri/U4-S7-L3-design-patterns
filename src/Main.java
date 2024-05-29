import it.epicode.esercizio1.DataSource;
import it.epicode.esercizio1.Info;
import it.epicode.esercizio1.InfoAdapter;
import it.epicode.esercizio2.Libro;
import it.epicode.esercizio2.Pagina;
import it.epicode.esercizio2.Sezione;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Esercizio 1

        Info info = new Info();
        info.setNome("Alice");
        info.setCognome("Lazzeri");
        info.setDataDiNascita(new Date(1995, 9, 2));

        DataSource dataSource = new InfoAdapter(info);

        System.out.println("Nome Completo: " + dataSource.getNomeCompleto());
        System.out.println("Età: " + dataSource.getEta());

        // Esercizio 2

        List<String> autori = new ArrayList<>();
        autori.add("Autore 1");
        autori.add("Autore 2");
        Libro libro = new Libro(27.99, autori);

        Sezione sezione1 = new Sezione();
        sezione1.add(new Pagina());
        sezione1.add(new Pagina());

        Sezione sezione2 = new Sezione();
        sezione2.add(new Pagina());
        sezione2.add(new Pagina());
        sezione2.add(new Pagina());

        libro.addSezione(sezione1);
        libro.addSezione(sezione2);

        libro.print();

        System.out.println("Numero totale di pagine: " + libro.calcolaNumeroPagine());

        // Esercizio 3



    }
}