package com.company;

import java.util.Scanner;

public class pojemnikNaKawę {
    private double arabicaSantos;
    private double blueMountain;
    private double arabicaMokka;
    private double robustaKameruńska;
    private double arabicaKenijska;
    Scanner skan = new Scanner(System.in);
    Scanner skann = new Scanner(System.in);

    public pojemnikNaKawę(double arabicaSantos, double blueMountain, double arabicaMokka, double robustaKameruńska, double arabicaKenijska) {
        this.arabicaSantos = arabicaSantos;
        this.blueMountain = blueMountain;
        this.arabicaMokka = arabicaMokka;
        this.robustaKameruńska = robustaKameruńska;
        this.arabicaKenijska = arabicaKenijska;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setArabicaSantos(double arabicaSantos) {
        this.arabicaSantos = arabicaSantos;
    }

    public double getArabicaSantos() {
        return arabicaSantos;
    }

    public void setBlueMountain(double blueMountain) {
        this.blueMountain = blueMountain;
    }

    public double getBlueMountain() {
        return blueMountain;
    }

    public void setArabicaMokka(double arabicaMokka) {
        this.arabicaMokka = arabicaMokka;
    }

    public double getArabicaMokka() {
        return arabicaMokka;
    }

    public void setRobustaKameruńska(double robustaKameruńska) {
        this.robustaKameruńska = robustaKameruńska;
    }

    public double getRobustaKameruńska() {
        return robustaKameruńska;
    }

    public void setArabicaKenijska(double arabicaKenijska) {
        this.arabicaKenijska = arabicaKenijska;
    }

    public double getArabicaKenijska() {
        return arabicaKenijska;
    }
    /*-------------------------------------------------------------------------------------------------*/
static String h;
    public void pobieranieKawy() {
        System.out.println("Jaki gatunek kawy chcesz? (Arabica Santos = 1 | Blue Mountain = 2 | Arabica Mokka = 3| Robusta Kameruńska = 4| Arabica Kenijska = 5)");
        System.out.println(" ");
        h = skan.nextLine();
        if (h.equals("1")) {
            czyBrakujeArabiciSantos();
            arabicaSantos -= 0.1;
        } else if (h.equals("2")) {
            czyBrakujeBlueMountain();
            blueMountain -= 0.1;
        } else if (h.equals("3")) {
            czyBrakujeArabiciMokka();
            arabicaMokka -= 0.1;
        } else if (h.equals("4")) {
            czyBrakujeRobustyKameruńskiej();
            robustaKameruńska -= 0.1;
        } else if (h.equals("5")) {
            czyBrakujeArabiciKenijskiej();
            arabicaKenijska -= 0.1;
        } if(!(h.equals("1") ||h.equals("2") ||h.equals("3") ||h.equals("4") ||h.equals("5"))){
            System.out.println("BŁĄD! Spróbuj ponownie");
            System.out.println(" ");
            pobieranieKawy();
        }
    }


    public void czyBrakujeArabiciSantos() {
        if (arabicaSantos <= 0.1) {
            System.out.println("Brakuje ziaren kawy Arabica Santos!");
            System.out.println("Czy chcesz uzupełnić jej poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                arabicaSantos = 0.5;
                System.out.println("Ilość Arabici Santos jest teraz optymalna.");
                System.out.println(" ");
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak ziaren Arabici Santos");
                System.out.println("Powracanie do menu wyboru gatunku kawy");
                System.out.println(" ");
                pobieranieKawy();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                System.out.println(" ");
                czyBrakujeArabiciSantos();
            }
        }
    }

    public void czyBrakujeBlueMountain() {
        if (blueMountain <= 0.1) {
            System.out.println("Brakuje ziaren kawy Blue Mountain!");
            System.out.println("Czy chcesz uzupełnić jej poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                blueMountain = 0.5;
                System.out.println("Ilość Blue Mountain jest teraz optymalna.");
                System.out.println(" ");
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak ziaren Blue Mountain");
                System.out.println("Powracanie do menu wyboru gatunku kawy");
                System.out.println(" ");
                pobieranieKawy();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                System.out.println(" ");
                czyBrakujeBlueMountain();
            }
        }
    }

    public void czyBrakujeArabiciMokka() {
        if (arabicaMokka <= 0.1) {
            System.out.println("Brakuje ziaren kawy Arabici Mokka!");
            System.out.println("Czy chcesz uzupełnić jej poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                arabicaMokka = 0.5;
                System.out.println("Ilość Arabici Mokka jest teraz optymalna.");
                System.out.println(" ");
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak ziaren Arabici Mokka");
                System.out.println("Powracanie do menu wyboru gatunku kawy");
                System.out.println(" ");
                pobieranieKawy();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                System.out.println(" ");
                czyBrakujeArabiciMokka();
            }
        }
    }

    public void czyBrakujeRobustyKameruńskiej() {
        if (robustaKameruńska <= 0.1) {
            System.out.println("Brakuje Robusty Kameruńskiej!");
            System.out.println("Czy chcesz uzupełnić jej poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                robustaKameruńska = 0.5;
                System.out.println("Ilość Robusty Kameruńskiej jest teraz optymalna.");
                System.out.println(" ");
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak ziaren Robusty Kameruńskiej");
                System.out.println("Powracanie do menu wyboru gatunku kawy");
                System.out.println(" ");
                pobieranieKawy();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                System.out.println(" ");
                czyBrakujeRobustyKameruńskiej();
            }
        }
    }

    public void czyBrakujeArabiciKenijskiej() {
        if (arabicaKenijska <= 0.1) {
            System.out.println("Brakuje Arabici Kenijskiej!");
            System.out.println("Czy chcesz uzupełnić jej poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                arabicaKenijska = 0.5;
                System.out.println("Ilość Arabici Kenijskiej jest teraz optymalna.");
                System.out.println(" ");
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak ziaren ArabiciKenijskiej");
                System.out.println("Powracanie do menu wyboru gatunku kawy");
                System.out.println(" ");
                pobieranieKawy();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                System.out.println(" ");
                czyBrakujeArabiciKenijskiej();
            }
        }
    }
}
