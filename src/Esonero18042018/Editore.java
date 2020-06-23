package Esonero18042018;

import java.util.ArrayList;
import java.util.List;

public class Editore {

    public String nome;
    public List<Collana> Collane=new ArrayList<Collana>() ;

    public Editore(String nome){
        this.nome=nome;
    }

    public void nuovaCollana(String nome) {
        Collane.add(new Collana(nome));
    }

    public void stampaCatalogo() {
        System.out.println("Catalogo di "+nome+":");
        for (Collana collana:Collane) {
            collana.stampaCollana();
        }
        System.out.println();
    }

    public class Collana{

        public String nome;
        public List<Libro> Libri=new ArrayList<Libro>();

        public Collana(String nome){
            this.nome=nome;
        }

        public void nuovoLibro(String nome, String autore, int prezzo) {
            Libri.add(new Libro(nome,autore,prezzo));
        }

        public void stampaCollana() {
            System.out.println("Pubblicati nella collana "+nome+":");
            for (Libro libro:Libri) {
                libro.stampaLibro();
            }
            System.out.println();
        }

        public class Libro{

            public String nome;
            public String autore;
            public int prezzo;

            public Libro(String nome, String autore, int prezzo){
                this.nome=nome;
                this.autore=autore;
                this.prezzo=prezzo;
            }

            public void stampaLibro() {
                System.out.println(nome+", autore: "+autore+", "+Editore.this.nome+" editore ("+Collana.this.nome+"), "+prezzo+" euro.");
            }
        }


    }
}
