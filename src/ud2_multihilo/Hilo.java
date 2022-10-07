package ud2_multihilo;

public class Hilo extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Soy un hilo "+i);
    }
}
