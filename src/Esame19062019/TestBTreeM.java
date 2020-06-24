package Esame19062019;
public class TestBTreeM {

 /*
 Un BTreeM<T> e' un albero binario con nodi etichettati da valori di tipo T. Esso può essere
 una foglia, ovvero un valore di tipo T, oppure un valore di tipo T con un sottoalbero sinistro
 e un sottoalbero destro (entrambi di tipo BTreeM<T>).

 Inoltre, BTreeM e' un funtore:
 un oggetto t di tipo BTreeM<T> è dotato di un metodo fmap che prende in input un oggetto f
 di tipo Function<T,R> e restituisce un BTreeM<R> che ha la stessa struttura di t ma etichette
 ottenute applicando f alle etichette di t.
 */

    public static void main(String[] args) throws Exception {

 /*
 Questo programma stampa:
 Bad Tree!
 4 3 1 2 5
 5 4 2 3 6
 true false false true false
 */

        try {
 /* l'albero t0 è illegale perche' ha un figlio sinistro ma non un figlio destro.
 Il costruttore lancia un'eccezione cui associa il messaggio "Bad Tree!"...
 */
            BTreeM<Integer> t0 = new BTreeM<> (1, new BTreeM( 2, null, null), null);
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // ...che viene stampato qui.
        }

        BTreeM<Integer> t1 = new BTreeM<>(1, null, null);
        BTreeM<Integer> t2 = new BTreeM<>(2, null, null);
        BTreeM<Integer> t3 = new BTreeM<>(3, t1, t2);
        BTreeM<Integer> t4 = new BTreeM<>(4, t3, new BTreeM<> (5, null, null));

        t4.stampa(); // stampa depth-first

        BTreeM<Integer> result1 = t4.fmap((x) -> (x+1));
        BTreeM<Boolean> result2 = t4.fmap((x) -> (x%2 == 0));

        result1.stampa();
        result2.stampa();
    }
}