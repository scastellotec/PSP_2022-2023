package ud2_multihilo.Exercise1_tictac;

public class Hilo implements Runnable{

    private String tictac;

    public Hilo(String tictac) {
        this.tictac = tictac;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(tictac);
        }
    }
}
