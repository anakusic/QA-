package Domaci2;

import java.util.Scanner;

public class Aritmeticke {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite neki ceo broj");
        int a = sc.nextInt();
        System.out.print("Unesite drugi ceo broj");
        int b = sc.nextInt();

        System.out.println("Zbir brojeva = " + (a + b));
        System.out.println("Razlika brojeva = " + (a-b));
        System.out.println("Proizvod brojeva = " + (a*b));
        System.out.println("Kolicnik brojeva = " + (a/b));

        System.out.println("Kraj programa");



    }
}
