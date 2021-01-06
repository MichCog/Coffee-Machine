package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class pojemnikNaWodę {
    private double woda;
    Scanner skan = new Scanner(System.in);

    public pojemnikNaWodę(double woda) {
        this.woda = woda;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setWoda(double woda) {
        this.woda = woda;
    }

    public double getWoda() {
        return woda;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void pobieranieWody() throws InterruptedException {
        System.out.println("Przygotowuję wodę...");
        TimeUnit.SECONDS.sleep(1);
        czyBrakujeWody();
        woda -= 0.1;
    }

    public void czyBrakujeWody() {
        if (woda <= 0.1) {
            System.out.println("Za mało wody!");
            System.out.println("Czy chcesz uzupełnić ją teraz? (Tak/Nie)");
            String d = skan.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Poziom wody został uzupełniony.");
                woda = 0.5;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; za niski poziom wody.");
                czyBrakujeWody();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                d = skan.nextLine();
                czyBrakujeWody();
            }
        }

    }
}
