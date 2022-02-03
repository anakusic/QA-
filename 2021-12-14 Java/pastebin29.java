package Domaci4;

import java.util.Scanner;

public class pastebin29 {
    public static void main(String[] args) {
        //29. -//-. Ispisati svaki treci element u obrnutom redosledu.
               // Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        //29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz od 7 brojeva");
        int [] nizN = new int [7];

        for (int i = 0; i < nizN.length; i++) {
            nizN [i] = sc.nextInt();
        }

        svakiTreciFormula(nizN);
        System.out.println(nizN);

    }
    public static void svakiTreciFormula (int [] nizFunkcije) {
        for (int i = nizFunkcije.length - 1; i >=0; i=i-3) {
            System.out.println(nizFunkcije[i]);

            }
        } //isto sto i u prethodnom zadatku, imam problem i ovde

    }

