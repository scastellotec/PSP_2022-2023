package ud2_multihilo.Exercise0_introduction;

public class HiloR implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Soy un runnable " + i);

        }
    }
}
