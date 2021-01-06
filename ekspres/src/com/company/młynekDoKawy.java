package com.company;

import java.util.Scanner;

public class młynekDoKawy {
    private int poziomResztek;
    Scanner skan = new Scanner(System.in);

    public młynekDoKawy(int poziomResztek) {
        this.poziomResztek = poziomResztek;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setPoziomResztekdouble(int poziomResztek) {
        this.poziomResztek = poziomResztek;
    }

    public int getPoziomResztek() {
        return poziomResztek;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void mielenieKawy() {
        czyZaDużoResztek();
        System.out.println("Mielę wybraną przez ciebie kawę...");
        System.out.println(" ");
        poziomResztek += 1;
    }

    public void czyZaDużoResztek() {
        if (poziomResztek == 5) {
            System.out.println("Za dużo resztek w młynku! Aby kontynuować, usuń resztki z młynka! Czy chcesz to zrobić? (Tak/Nie)");
            String d = skan.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Brak resztek po poprzednich parzeniach.");
                System.out.println(" ");
                poziomResztek = 0;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; zbyt dużo resztek po poprzednich parzeniach.");
                System.out.println(" ");
                czyZaDużoResztek();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyZaDużoResztek();
            }
        }

    }

}
