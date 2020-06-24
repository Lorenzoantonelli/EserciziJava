package Esame12062017turno1;
/**
 * Created by pietrocenciarelli on 10/06/17.
 */
public class Test1 {
    /*
    Due gare fra Wile E. Coyote e Road Runner (lo struzzo).
     */

    public static void main(String[] args) throws InterruptedException {

        Pista p5 = new Pista(new Pista(new Pista(new Pista(new Pista(new Pista(null))))));
        // p5 e' una lista di 6 elementi; il primo è la partenza, quindi si arriva dopo 5 passi

        Runner roadrunner = new MyRunner("roadrunner", p5, 100);
        Runner coyote = new MyRunner("coyote", p5, 150); // il coyote e' piu' lento!

        roadrunner.start();
        Thread.currentThread().sleep(200); // diamo 200 millis di vantaggio allo struzzo
        coyote.start();
        Thread.currentThread().sleep(1000); // aspettiamo che la corsa sia finita

        System.out.println("NUOVA CORSA!");

        Runner roadrunner2 = new MyRunner("roadrunner", p5, 150);
        Runner coyote2 = new MyRunner("coyote", p5, 100); // il coyote e' piu' veloce!

        roadrunner2.start();
        Thread.currentThread().sleep(200);
        coyote2.start();
    }
}
