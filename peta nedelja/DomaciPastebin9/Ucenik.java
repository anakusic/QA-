package DomaciPastebin9;

import java.util.ArrayList;

public class Ucenik {
    //9.
    //Napisati klasu Ucenik koja ima sledeca polja:
    //	- String ime
    //	- String prezime
    //	- ArrayList ocene
    //
    //Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
    // a ocene postavlja na praznu listu.
    //Napisati gettere i settere za sva polja.
    //Napisati toString() metod:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //Napisati metod proske koji racuna prosek Ucenika.

    private String ime;
    private String prezime;
    private ArrayList <Integer> ocene;


    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(ime + " " + prezime + " ima ocene: ");
        sb.append("\n");
        sb.append(ocene);
        sb.append("\nProsek ocena je " + prosek());


        return sb.toString();
    }

    public double prosek() {
        double suma = 0;
        double prosek = 0;
        for (int i = 0; i < ocene.size(); i++) {
            int elemntNaPozicijiI = ocene.get(i);
            suma = suma + elemntNaPozicijiI;
        } prosek = suma / ocene.size();
        return prosek;
    }


}
