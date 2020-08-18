package Esame2092019;
/**
 * Created by pietrocenciarelli on 02/09/19.
 *
 *
 * Un filosofo cena così:
 * 1) pensa (un numero di millisecondi indicato dal secondo paramentro del suo costruttore)
 * 2) prende la bacchetta alla sua sinistra (terzo parametro), annunciando di averlo fatto;
 *    se la bacchetta non e' disponibile, aspetta pazientemente
 * 3) pensa (...)
 * 4) prende la bacchetta alla sua destra (quarto parametro), annunciando di averlo fatto;
 *    se la bacchetta non e' disponibile, aspetta pazientemente mantenendo comunque la bacchetta
 *    che gia' ha in mano
 * 5) mangia un boccone di riso
 * 6) rilascia le bacchette
 * 7) e cosi' ancora (ripete i passi 1-6) finche' la cena e' finita
 *
 */

public class Dinner {
    public static void main(String[] args) {

        Object chopstickOne = new Object();
        Object chopstickTwo = new Object();
        Philosopher snapo = new Philosopher("Snapo", Integer.parseInt(args[0]), chopstickOne, chopstickTwo);
        Philosopher raz = new Philosopher("Raz",Integer.parseInt(args[1]), chopstickOne, chopstickTwo);

        int dinnertime = 1000;
        snapo.start();
        raz.start();

        try {
            Thread.sleep(dinnertime);
        }
        catch (InterruptedException e) {}

        snapo.interrupt();
        raz.interrupt();
    }
}