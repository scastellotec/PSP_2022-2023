package ud2_multihilo.Exercise1_tictac;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Hilo("TIC"));
        Thread t2 = new Thread(new Hilo("TAC"));

        t1.start();
        t2.start();
    }
}
