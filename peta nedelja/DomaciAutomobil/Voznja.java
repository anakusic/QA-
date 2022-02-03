package DomaciAutomobil;

import Osoba.Osoba;

public class Voznja {

    public static void main(String[] args) {


        Osoba osoba1 = new Osoba("Ana", "Kusic", 1995, 168);
        Osoba osoba2 = new Osoba("Sima", "Simic", 1989, 190);
        Osoba osoba3 = new Osoba("Mika", "Mikic", 1959, 187);
        Osoba osoba4 = new Osoba("Zika", "Zikic", 1978, 200);

        //Ove 4 osobe ovde su zbog toga sto iz teksta zadatka prvo ukapirala da vozilo moze da ima 4 vlasnika,
        //ali uz konsultaciju sa kolegama, neki su protumacili da se taj br 4) odnosi na parametre koje treba
        // da sadrzi. Dakle ovo mi je napravilo pometnju:
        //Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
        // Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
        // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.



        Automobil auto1 = new Automobil("BMW", "120", 45789, osoba1);
        Automobil auto2 = new Automobil("Mercedes", "GLK", 5671, osoba4);
        Automobil auto3 = new Automobil("Pezo", "208",  67891);


        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);




    }
}
