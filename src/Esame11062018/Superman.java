package Esame11062018;

public class Superman extends Thread {

    public Superman(Runnable rrr) {
        rrr.run();
        System.out.println(Thread.currentThread().getName());
    }

}
