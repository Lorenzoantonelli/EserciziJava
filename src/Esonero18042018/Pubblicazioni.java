package Esonero18042018;
/**
 * Created by pietrocenciarelli on 17/04/18.
 */

import java.util.*;

public class Pubblicazioni {

    /*
    I libri pubblicati da un editore sono divisi in diverse collane.
    Il programma Pubblicazioni crea il catalogo dell'editore "Loki Edizioni" e lo stampa.

    L'output atteso e' il seguente:

    Sapori Selvaggi, autore: Dario, Edizioni Loki editore (Ricette dal bosco), 34 Euro.

    Pubblicati nella collana I Classici:
    Novelle di notte, autore: Costanza, Edizioni Loki editore (I Classici), 42 Euro.
    Novelle di giorno, autore: Zac, Edizioni Loki editore (I Classici), 100 Euro.

    Catalogo di Edizioni Loki editore:
    Pubblicati nella collana Ricette dal bosco:
    Sapori Selvaggi, autore: Dario, Edizioni Loki editore (Ricette dal bosco), 34 Euro.
    Cucinare il cinghiale, autore: Valerio, Edizioni Loki editore (Ricette dal bosco), 99 Euro.
    Pubblicati nella collana I Classici:
    Novelle di notte, autore: Costanza, Edizioni Loki editore (I Classici), 42 Euro.
    Novelle di giorno, autore: Zac, Edizioni Loki editore (I Classici), 100 Euro.
    */

    public static void main(String[] args) {

        Editore loki = new Editore("Edizioni Loki"); // crea un nuovo editore

        loki.nuovaCollana("Ricette dal bosco"); // aggiunge una nuova collana a quelle dell'editore loki
        loki.nuovaCollana("I Classici"); // ...ed un'altra

        List<Editore.Collana> collanediloki = loki.Collane;
        // loki.Collane è la lista delle collane dell'editore loki

        Editore.Collana ricette = collanediloki.get(0); // ricette è la prima delle collane dell'editore loki
        ricette.nuovoLibro("Sapori Selvaggi", "Dario", 34);
        // aggiunge un libro alla collana ricette
        ricette.nuovoLibro("Cucinare il cinghiale", "Valerio", 99); // ...ed un altro

        Editore.Collana.Libro sapori = ricette.Libri.get(0); // sapori e' il primo libro della collana ricette
        sapori.stampaLibro();

        Editore.Collana storie = collanediloki.get(1); // storie e' la seconda collana dell'editore loki
        storie.nuovoLibro("Novelle di notte", "Costanza", 42); // aggiunge, come sopra
        storie.nuovoLibro("Novelle di giorno", "Zac", 100); // aggiunge, come sopra
        storie.stampaCollana(); // stampa tutta la collana (ovvero for-each libro della collana, lo stampa)

        loki.stampaCatalogo(); // for-each collana...
    }
}