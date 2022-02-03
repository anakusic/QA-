package DomaciAutomobil;

import Osoba.Osoba;

public class Automobil {

    // vozilo  - Napisati klasu Automobil. Automobil ima
    //1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
    //2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
    //3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
    //Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
    // Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
    // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

    private String marka;
    private String model;
    private int serijskiBr;
    private Osoba vlasnik;

    public Automobil(String marka, String model, int serijskiBr, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBr = serijskiBr;
        this.vlasnik = vlasnik;
    }

    public Automobil(String marka, String model, int serijskiBr) {
        this.marka = marka;
        this.model = model;
        this.serijskiBr = serijskiBr;
        this.vlasnik = null;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBr() {
        return serijskiBr;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ");
        sb.append(marka);
        sb.append("\n");

        sb.append("Model automobila je: ");
        sb.append(model);
        sb.append("\n");

        sb.append("Serijksi broj automobila je: ");
        sb.append(serijskiBr);
        sb.append("\n");

        if (vlasnik == null) {
            sb.append("Automobil nema vlasnika. ");

        }
        else sb.append("Vlasnik automobila je " + vlasnik.getIme() + " " + vlasnik.getPrezime());


        sb.append ("\n________________________________");


        return sb.toString();






}}
