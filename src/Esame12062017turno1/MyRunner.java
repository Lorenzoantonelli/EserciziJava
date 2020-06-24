package Esame12062017turno1;

public class MyRunner extends Runner {

    public MyRunner(String nome, Pista p, int delay) {
        super(nome, p, delay);
    }

    @Override
    public void run() {
        while (!p.arrivato()) {
            try {
                this.sleep(delay);
            } catch (InterruptedException e) {
            }
            p.step();
            p.leave();
            p=p.getNext();
        }
        System.out.println(Thread.currentThread().getName()+" è arrivatooooo");
    }

}
