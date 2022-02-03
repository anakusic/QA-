package Domaci2;

import java.util.Scanner;

public class Faktorijel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 * 2 * 1 = 6
         */

        System.out.println("Unesite pozitivan ceo broj: ");
        int broj = sc.nextInt();
        int i= 1;
        int faktorijal = 1;
        for(i=1;i<=broj;i++){
            faktorijal = faktorijal * i;

        }
        System.out.println("Faktorijal broja "+ broj +" je: "+ faktorijal);








    }
}
