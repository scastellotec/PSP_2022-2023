package ud2_multihilo.exercise3_producerConsumer;

public class Consumer implements Runnable{

    Container c;

    public Consumer(Container c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println(c.read());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
