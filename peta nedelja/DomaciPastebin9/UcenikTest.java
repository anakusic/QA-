package DomaciPastebin9;

import java.util.ArrayList;

public class UcenikTest {

    public static void main(String[] args) {

        ArrayList ocene = new ArrayList();
        ocene.add(4);
        ocene.add(2);
        ocene.add(5);
        ocene.add(2);
        ocene.add(3);

        Ucenik ucenik1 = new Ucenik("Ana", "Kusic",ocene);

        System.out.println(ucenik1);




    }







}
