package Esame11062018;

public class Superman extends Thread {

    Runnable rrr;

    public Superman(Runnable rrr){
        this.rrr=rrr;
    }

    @Override
    public void run() {
        rrr.run();
        System.out.println(Thread.currentThread().getName());
    }
}
