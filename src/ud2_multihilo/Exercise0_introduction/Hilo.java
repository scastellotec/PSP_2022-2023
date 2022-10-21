package ud2_multihilo.Exercise0_introduction;

public class Hilo extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Soy un hilo "+i);
    }
}
