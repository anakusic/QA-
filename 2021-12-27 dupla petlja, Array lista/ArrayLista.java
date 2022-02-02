import java.util.ArrayList;

public class ArrayLista {

    //Kreirajte array listu nekog vaseg interesovanje (npr sport)
    //-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
    //-iz liste dohvatite 3. element liste i ispisite
    //-promenite naziv prvog elementa
    //-uklonite 5. element
    //-ispisite velicinu vase liste
    //-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste

    public static void main(String[] args) {

        ArrayList <String> omiljeniSportovi = new ArrayList();

        omiljeniSportovi.add("Fudbal");
        omiljeniSportovi.add("Tenis");
        omiljeniSportovi.add("Rukomet");
        omiljeniSportovi.add("Odbojka");
        omiljeniSportovi.add("Kosarka");

        System.out.println("Treci element liste je " + omiljeniSportovi.get(2));

        omiljeniSportovi.set(0, "Vaterpolo");

        omiljeniSportovi.remove(4);

        System.out.println("Duzina liste je " + omiljeniSportovi.size());

        System.out.println("Ispis celog niza prvi nacin: " );
        for (int i = 0; i < omiljeniSportovi.size(); i++){
            System.out.println(omiljeniSportovi.get(i));
            //secam se da smo na casu radili tako sto smo definisali jos jednu promeniljivu koja je jednaka
            //listi na i, pa se kasnije ta nova promenljiva stampa. Da li je to neka uobicajena praksa,
            //Ili je to naznaceno da bi mi lakse razumeli o cemu se radi?
        }
        System.out.println("Ispis celog niza drugi nacin: " );
        for (String s : omiljeniSportovi) {
            System.out.println(s);


        }











    }
}
