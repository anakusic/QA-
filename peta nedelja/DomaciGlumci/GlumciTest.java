package DomaciGlumci;

import java.util.Scanner;

public class GlumciTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime glumca");
        String ime = sc.next();
        System.out.println("Unesite prezime glumca");
        String prezime = sc.next();
        System.out.println("Unesite pol glumca: ");
        char pol = sc.next().charAt(0);
        System.out.println("Unesite godine glumca");
        int godine = sc.nextInt();
        System.out.println("Unesite ocenu glumca od 1 do 10: ");
        double ocena = sc.nextDouble();
        System.out.println("Unesite poreklo glumca: ");
        String poreklo = sc.next();

        Glumac glumac1 = new Glumac (ime,prezime,pol,godine,ocena,poreklo);

        System.out.println("Unesite ime glumca");
        String ime1 = sc.next();
        System.out.println("Unesite prezime glumca");
        String prezime1 = sc.next();
        System.out.println("Unesite pol glumca: ");
        char pol1 = sc.next().charAt(0);
        System.out.println("Unesite godine glumca");
        int godine1 = sc.nextInt();
        System.out.println("Unesite ocenu glumca od 1 do 10: ");
        double ocena1 = sc.nextDouble();
        System.out.println("Unesite poreklo glumca: ");
        String poreklo1 = sc.next();

        Glumac glumac2 = new Glumac (ime1,prezime1,pol1,godine1,ocena,poreklo1);

        System.out.println(glumac1);
        System.out.println(glumac2);


        //Preko skenera sam unosila iskljucivo radi vezbe


    }
}
