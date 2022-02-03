package d_30_11;

import java.util.Scanner;

public class Sintaksa1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Napisati program koji ce racunati povrsinu okrecene prostorije
         *tako sto se ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti
         * da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
         */

        System.out.println("Unesite mere prostorije u m: ");

        System.out.println("Unesite dimenzije prvog zida:");

        System.out.print("Ivica 1: ");
        float a1 = scanner.nextFloat();
        System.out.print("Ivica 2: ");
        float b1 = scanner.nextFloat();
        float p1 = a1*b1;

        System.out.println("Unesite dimenzije drugog zida:");
        System.out.print("Ivica 1: ");
        float a2 = scanner.nextFloat();
        System.out.print("Ivica 2: ");
        float b2 = scanner.nextFloat();
        float p2 = a2*b2;

        System.out.println("Unesite dimenzije treceg zida:");
        System.out.print("Ivica 1: ");
        float a3 = scanner.nextFloat();
        System.out.print("Ivica 2: ");
        float b3 = scanner.nextFloat();
        float p3 = a3*b3;


        System.out.println("Unesite dimenzije cetvrtog zida:");
        System.out.print("Ivica 1:");
        float a4 = scanner.nextFloat();
        System.out.print("Ivica 2:");
        float b4 = scanner.nextFloat();
        float p4 = a4*b4;

        System.out.println("Unesite dimenzije plafona:");
        System.out.print("Ivica 1:");
        float a5 = scanner.nextFloat();
        System.out.print("Ivica 2:");
        float b5 = scanner.nextFloat();
        float p5 = a5*b5;


        System.out.println("Povrsina zidova sobe je " + p1+p2+p3+p4+p5);



    }




     }
