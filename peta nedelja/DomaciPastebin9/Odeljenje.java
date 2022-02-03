package DomaciPastebin9;

import java.util.ArrayList;

public class Odeljenje {

    String oznaka;
    ArrayList <Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

    //Dalje ne znam da uradim.
    //Kada se bude racunao prosek celog odeljenja, trebalo bi napraviti novi niz koji sadrzi sve proseke ocenika,
    // zatim sumu tog niza proseka treba podeliti sa brojem ucenika.
}
