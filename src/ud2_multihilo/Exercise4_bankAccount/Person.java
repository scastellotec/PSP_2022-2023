package ud2_multihilo.Exercise4_bankAccount;

public class Person implements Runnable{
    private int id;
    private BankAccount monedero;
    private int miDinero;

    public Person(BankAccount monedero, int id) {
        this.monedero = monedero;
        this.id = id;
        this.miDinero = 0;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                miDinero += monedero.withDraw(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(id+" "+miDinero);
    }

}
