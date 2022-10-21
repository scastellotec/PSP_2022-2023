package ud2_multihilo.Exercise0_introduction;

public class example0 {
    public static void main(String[] args) throws InterruptedException {

        HiloR h1 = new HiloR();
        Thread t1 = new Thread(h1);
        t1.start();
        //Thread.sleep(10000);
        t1.join();

        System.out.println("The End");
    }
}
