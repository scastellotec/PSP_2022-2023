package ud2_multihilo.Exercise2_humanCalculator;

import java.util.Random;
import java.util.Scanner;

public class calculator implements Runnable{
    private int points = 0;

    @Override
    public void run() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (!Thread.interrupted()) {
            int n1 = random.nextInt(20);
            int n2 = random.nextInt(20);
            int solution = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = ");
            int userSolution = sc.nextInt();
            if (solution == userSolution)
                points++;
        }
        System.out.println("Your points are: " + points);
    }
}
