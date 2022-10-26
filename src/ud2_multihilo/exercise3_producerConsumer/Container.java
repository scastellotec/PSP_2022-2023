package ud2_multihilo.exercise3_producerConsumer;

public class Container {
    private String data;
    private boolean newData;

    public Container(String data) {
        this.data = data;
        this.newData = false;
    }

    public synchronized void write(String a) throws InterruptedException {
        while(newData){
           wait();
        }
        data = a;
        newData = true;
        notifyAll();
    }

    public synchronized String read() throws InterruptedException {
        while(!newData){
            wait();
        }
        newData = false;
        notifyAll();
        return data;
    }
}
