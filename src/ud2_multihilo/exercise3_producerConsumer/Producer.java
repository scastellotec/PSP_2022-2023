package ud2_multihilo.exercise3_producerConsumer;

public class Producer implements Runnable{

    Container c;

    public Producer(Container c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                c.write("Product "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
