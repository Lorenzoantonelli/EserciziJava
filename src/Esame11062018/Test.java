package Esame11062018;

/**
 * Created by pietrocenciarelli on 10/06/18.
 *
 * Implementare la classe Superman in modo che l'esecuzione
 * del seguente test stampi il valore di args[0]
 */

public class Test {

    public static void main(String[] args) {
        Runnable rrr = () -> Thread.currentThread().setName(args[0]);
        new Superman(rrr).start();
    }
}
