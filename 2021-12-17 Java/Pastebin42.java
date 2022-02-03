package Domaci5;

public class Pastebin42 {
    //42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

    public static void main(String[] args) {
        String[] niz = {"Ana ", "Milica", "Snezana", "Marko", "Milan", "Petar", "Marija"};
        proveraImena(niz);
    }

    public static void proveraImena(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == "Marija" && niz[i] == "Petar") {
                System.out.println("U ovom nizu se nalaze imena Marija i Petar");
                //nije mi jasno zasto mi u ovom slucaju (kada imam oba imena u nizu)
                // stampa posebno u dva reda, nalazi se marija i nalazi se petar.
                //ako vec prepoznaje ovu petlju, tj ispunjava taj uslov, zasto samo ne odstampa zadato odavde, vec ide
                //u preostale dve petlje
            } else if (niz[i] == "Marija") {
                System.out.println("U ovom nizu se nalazi ime Marija");
            } else if (niz[i] == "Petar") {
                System.out.println("U ovom nizu se nalazi ime Petar");

            }


        }
    }
}




