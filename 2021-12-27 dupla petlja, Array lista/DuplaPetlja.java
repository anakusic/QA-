public class DuplaPetlja {

    public static void main(String[] args) {

        //Uradila sam na dva nacina, nadam se da je makar jedan kako treba
        String [] nizNedelje = {"Week: 1 ", "Week: 2 ", "Week: 3"};
        String [] nizDani = {"Day: 1", "Day: 2","Day: 3","Day: 4","Day: 5","Day: 6", "Day: 7"};


        for (int i = 0; i< nizNedelje.length; i++){
            System.out.println(nizNedelje[i]);
            for (int j = 0; j < nizDani.length; j++) {
                System.out.println(nizDani[j]);
           }
      }
      //Drugi nacin
      /* String nedelja = "Week";
        String dan = "Day";

        for (int i = 0; i < 3; i++) {
            System.out.println(nedelja + ": " + (i+1));
            for (int j = 0; j < 7; j++) {
                System.out.println(dan + ": " + (j+1));
            }
        } */



    }

}
