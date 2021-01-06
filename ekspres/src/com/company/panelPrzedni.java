package com.company;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class panelPrzedni {
    int dioda = 0;
    static String d;
    public void czyWłączony() throws InterruptedException {
        Scanner skan = new Scanner(System.in);

        System.out.println("Czy chcesz uruchomić ekspres? (Tak/Nie)");
        System.out.println(" ");

        d = skan.nextLine();

        if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
            System.out.println("Ekspres włącza się...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(" ");
            dioda = 1;

        } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
            System.out.println("Do zobaczenia następnym razem!");

        } else {
            System.out.println("BŁĄD! Spróbuj ponownie");
            czyWłączony();
        }
    }

    public void dioda() throws InterruptedException {
        if (dioda == 0) {
            System.out.println("Dioda jest zgaszona");
            System.out.println(" ");
        } else if (dioda == 1) {
            System.out.println("Dioda jest zapalona. Ekspres jest gotowy do użycia.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(" ");
        }
    }


    public void koniec() throws InterruptedException {
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("               _..,----,.._");
        System.out.println("            .-;'-.,____,.-';");
        System.out.println("           (( |    o  o    |");
        System.out.println("            `))    .__.    ;");
        System.out.println("             ` \\          /");
        System.out.println("            .-' `,.____.,' '-.");
        System.out.println("           (     '------'     )");
        System.out.println("            `-=..________..--'");
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);


        System.out.println("Zakończono przygotowywanie kawy! Do zobaczenia następnym razem!");
    }
}
