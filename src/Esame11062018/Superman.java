package Esame11062018;

public class Superman extends Thread {

    private final Runnable r;

    public Superman(Runnable rrr) {
        r=rrr;
    }

    @Override
    public void run() {
        r.run();
        System.out.println(Thread.currentThread().getName());
    }
}
