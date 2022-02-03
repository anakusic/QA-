package d_30_11;

import java.util.Scanner;

public class Grananje1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesite neki ceo broj");
        int broj = scanner.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Ovaj broj je paran. ");
        }
        else
            System.out.println("Ovaj broj nije paran");





    }
}
