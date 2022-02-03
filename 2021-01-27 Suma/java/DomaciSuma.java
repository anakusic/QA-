import java.io.IOException;

public class DomaciSuma {

    public static void main(String[] args) throws IOException {

        ExcelReader excelReader = new ExcelReader("C:\\Users\\PC\\IdeaProjects\\DomaciSuma\\Brojevi.xlsx");
        int suma = 0;
        for (int i = 0; i <= excelReader.getLastRow("Sheet1"); i++) {
            int brojevi = excelReader.getIntegerData("Sheet1", i, 0);
            suma = brojevi + suma;
        }
        System.out.println("Suma svih brojeva u dokumentu je " + suma);

    }
}
