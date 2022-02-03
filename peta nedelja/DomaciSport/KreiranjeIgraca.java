package DomaciSport;

public class KreiranjeIgraca {

    public static void main(String[] args) {


        Sportista igrac1 = new Sportista("Ana Kusic", "Tenis", "Zvezda", 13);
        Sportista igrac2 = new Sportista("Pavle Savic", "Fudbal", "Partizan", 45);
        Sportista igrac3 = new Sportista ("Strahinja Trninic", "Kosarka", "Vojvodina", 30);

        System.out.println(igrac1);
        System.out.println(igrac2);
        System.out.println(igrac3);

        igrac1.setKlub("Radnicki");
        System.out.println(igrac1);







    }
}
