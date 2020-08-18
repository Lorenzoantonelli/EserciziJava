package Esame2092019;

public class Philosopher extends Thread{

    int thinkTime;
    final Object chopstickOne;
    final Object chopstickTwo;

    public Philosopher(String nome,int thinkTime,Object chopstickOne,Object chopstickTwo){
        this.setName(nome);
        this.thinkTime=thinkTime;
        this.chopstickOne=chopstickOne;
        this.chopstickTwo=chopstickTwo;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                sleep(thinkTime);
                synchronized (chopstickOne) {
                    System.out.println(Thread.currentThread().getName() + " ha preso la bacchetta sinistra");
                    sleep(thinkTime);
                    synchronized (chopstickTwo) {
                        System.out.println(Thread.currentThread().getName() + " ha preso la bacchetta destra");
                        System.out.println(Thread.currentThread().getName() + " mangia un boccone di riso");
                    }
                }
            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }
}
