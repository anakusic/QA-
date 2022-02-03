package Domaci4;

import java.util.Scanner;

public class Pastebin27 {


    //27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
    // Ispisati svaki drugi element tog niza
    //Primer: [1, 2, 3, 4, 5] -> 1 3 5
    //        27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz od 5 brojeva");
        int [] nizN = new int [5];

        for (int i = 0; i < nizN.length; i++) {
            nizN [i] = sc.nextInt();

        }


        svakiDrugiFormula(nizN);
        System.out.println(nizN);


    }
    public static void svakiDrugiFormula (int [] nizFunkcije) {
        for (int i = 0; i < nizFunkcije.length; i= i + 2) {
                System.out.println(nizFunkcije[i]);

        }

        //ako moze komentar zasto posle poslednjeg broja izbaci ove znakove?


    }






}