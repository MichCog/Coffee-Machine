package com.company;

import java.util.Scanner;

public class pojemnikNaKubki {
    private int ilośćKubków;
    Scanner skan = new Scanner(System.in);

    public pojemnikNaKubki(int ilośćKubków) {
        this.ilośćKubków = ilośćKubków;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setIlośćKubków(int ilośćKubków) {
        this.ilośćKubków = ilośćKubków;
    }

    public int getIlośćKubków() {
        return ilośćKubków;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void wysuwanieKubka() {
        czyBrakujeKubków();
        ilośćKubków -= 1;
    }

    public void czyBrakujeKubków() {
        if (ilośćKubków == 0) {
            System.out.println("Brakuje kubków!");
            System.out.println("Czy chcesz uzupełnić je teraz? (Tak/Nie)");
            String d = skan.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Ilość kubków jest optymalna.");
                ilośćKubków = 50;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak kubków");
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyBrakujeKubków();
            }
        }

    }
}

