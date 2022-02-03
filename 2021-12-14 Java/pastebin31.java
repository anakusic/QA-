package Domaci4;

public class pastebin31 {
    //31. Napisati funkciju koja racuna proizvod 3 broja.
    //Hint kako citati ove zadatke:
    //- ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
    //- funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

    public static void main(String[] args) {

        System.out.println(racunanjeProizvod(5,4,6));

    }

    public static int racunanjeProizvod (int x, int y, int z) {
        int proizvod = x * y * z;
        return proizvod;
    }

}
