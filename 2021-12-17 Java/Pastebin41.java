package Domaci5;

public class Pastebin41 {

    //Napisati funkciju koja racuna prosecnu vrednost double[] niza.

    public static void main(String[] args) {

        double [] niz = {5.5, 6.4, 7.6, 8};
        System.out.println("Prosecna vrednost unetog niza je " + prosecnaVrednosti(niz));

    }

    public static double prosecnaVrednosti (double [] niz) {
        int i = 0;
        double sum = 0;
        double avg = 0;

        while (i < niz.length) {
            sum = sum + niz[i];
            i++;
        } avg = sum / niz.length;
        return avg;



    }


}
