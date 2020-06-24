package Esame12062017turno1;
/**
 * Created by pietrocenciarelli on 10/06/17.
 */
public class Pista {
    /*
    modella una pista da corsa (per thread) come una lista
    concatenata (di valori di tipo Tread)
     */

    private Thread occupante = null;
    private Pista next;

    public Pista (Pista next) {
        this.next = next;
    }

    public Pista getNext () {
        return next;
    }

    public synchronized boolean arrivato () {
        return next == null;
    }

    public synchronized void leave () {
        if (occupante == Thread.currentThread())
            occupante = null;
    }

    public synchronized void step () {
        if (occupante != null)
            occupante.interrupt();
        occupante = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + ": step");
    }
}