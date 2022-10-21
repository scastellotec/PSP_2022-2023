package ud2_multihilo.Exercise4_bankAccount;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BankAccount m = new BankAccount(100);
        ArrayList<Thread> threads = new ArrayList<>();

        // Declaro los hilos y los almaceno en un Array
        for (int i=0; i<10; i++){
            threads.add(new Thread(new Person(m, i)));
        }

        threads.forEach(t -> t.start());
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Balance: "+m.balance);
    }
}
