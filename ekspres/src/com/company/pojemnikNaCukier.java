package com.company;

import java.util.Scanner;

public class pojemnikNaCukier {
    private double cukierBiały;
    private double cukierTrzcinowy;
    Scanner skan = new Scanner(System.in);
    Scanner skann = new Scanner(System.in);
    Scanner skannn = new Scanner(System.in);

    public pojemnikNaCukier(double cukierBiały, double cukierTrzcinowy) {
        this.cukierBiały = cukierBiały;
        this.cukierTrzcinowy = cukierTrzcinowy;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setCukierBiały(double cukierBiały) {
        this.cukierBiały = cukierBiały;
    }

    public double getCukierBiały() {
        return cukierBiały;
    }

    public void setCukierTrzcinowy(double cukierTrzcinowy) {
        this.cukierTrzcinowy = cukierTrzcinowy;
    }

    public double getCukierTrzcinowy() {
        return cukierTrzcinowy;
    }
    /*-------------------------------------------------------------------------------------------------*/
static String j;
static String h;
    public void pobieranieCukru() {
        System.out.println("Czy chcesz cukier do kawy? (Tak/Nie)");
        System.out.println(" ");
        j = skannn.nextLine();
        if (j.equals("Tak") || j.equals("tak") || j.equals("T") || j.equals("t")) {
            System.out.println("Jaki cukier chcesz? (Biały = 1 | Trzcinowy = 2)");
            System.out.println(" ");
            h = skan.nextLine();
            if (h.equals("1")) {
                czyBrakujeBiałego();
                cukierBiały -= 0.1;
            } else if (h.equals("2")) {
                czyBrakujeTrzcinowego();
                cukierTrzcinowy -= 0.1;
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                pobieranieCukru();
            }
        }
        if(!(j.equals("Tak") || j.equals("tak") || j.equals("T") || j.equals("t") || j.equals("Nie") || j.equals("nie") || j.equals("N") || j.equals("n"))){
            System.out.println("BŁĄD! Spróbuj ponownie");
            pobieranieCukru();
        }
    }
    public void czyBrakujeBiałego() {
        if (cukierBiały <= 0.05) {
            System.out.println("Niedługo zabraknie cukru białego!");
            System.out.println("Czy chcesz uzupełnić go teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Poziom cukru białego został uzupełniony.");
                cukierBiały = 0.5;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; za niski poziom cukru białego");
                czyBrakujeBiałego();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyBrakujeBiałego();
            }
        }

    }


    public void czyBrakujeTrzcinowego() {
        if (cukierTrzcinowy <= 0.05) {
            System.out.println("Niedługo zabraknie cukru trzcinowego!");
            System.out.println("Czy chcesz uzupełnić go teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Poziom cukru trzcinowego został uzupełniony.");
                cukierTrzcinowy = 0.5;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; za niski poziom cukru trzcinowego");
                czyBrakujeTrzcinowego();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyBrakujeTrzcinowego();
            }
        }

    }
}
