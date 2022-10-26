package ud2_multihilo.exercise3_producerConsumer;

public class Main {
    public static void main(String[] args) {
        Container d = new Container("-");
        Producer p1 = new Producer(d);
        Consumer c1 = new Consumer(d);

        new Thread(p1).start();
        new Thread(c1).start();
    }
}
