import it.epicode.esercizio1.DataSource;
import it.epicode.esercizio1.Info;
import it.epicode.esercizio1.InfoAdapter;
import it.epicode.esercizio1.UserData;

import java.util.Date;

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
    }
}