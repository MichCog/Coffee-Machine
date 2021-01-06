package com.company;

import java.util.Scanner;

public class pojemnikNaMleko {
    private double mlekoKrowie;
    private double mlekoKozie;
    Scanner skan = new Scanner(System.in);
    Scanner skann = new Scanner(System.in);
    Scanner skannn = new Scanner(System.in);

    public pojemnikNaMleko(double mlekoKozie, double mlekoKrowie) {
        this.mlekoKozie = mlekoKozie;
        this.mlekoKrowie = mlekoKrowie;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setMlekoKrowie(double mlekoKrowie) {
        this.mlekoKrowie = mlekoKrowie;
    }

    public double getMlekoKrowie() {
        return mlekoKrowie;
    }

    public void setMlekoKozie(double mlekoKozie) {
        this.mlekoKozie = mlekoKozie;
    }

    public double getMlekoKozie() {
        return mlekoKozie;
    }

    /*-------------------------------------------------------------------------------------------------*/
    static String j;
    static String h;
    public void pobieranieMleka() {

        System.out.println("Czy chcesz mleko do kawy? (Tak/Nie)");
        System.out.println(" ");
        j = skannn.nextLine();
        if (j.equals("Tak") || j.equals("tak") || j.equals("T") || j.equals("t")) {
            System.out.println("Jakie mleko chcesz? (Krowie = 1 | Kozie = 2)");
            System.out.println(" ");
            h = skan.nextLine();
            if (h.equals("1")) {
                czyBrakujeMlekaKrowiego();
                mlekoKrowie -= 0.1;
            } else if (h.equals("2")) {
                czyBrakujeMlekaKoziego();
                mlekoKozie -= 0.1;
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                pobieranieMleka();
            }
        }
        if (!(j.equals("Tak") || j.equals("tak") || j.equals("T") || j.equals("t") || j.equals("Nie") || j.equals("nie") || j.equals("N") || j.equals("n"))) {
            System.out.println("BŁĄD! Spróbuj ponownie");
            pobieranieMleka();
        }
    }

    public void czyBrakujeMlekaKrowiego() {
        if (mlekoKrowie <= 0.1) {
            System.out.println("Brakuje Mleka Krowiego!");
            System.out.println("Czy chcesz uzupełnić jego poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Ilość Mleka Krowiego jest optymalna.");
                mlekoKrowie = 0.5;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak Mleka Krowiego");
                czyBrakujeMlekaKrowiego();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyBrakujeMlekaKrowiego();
            }
        }
    }

    public void czyBrakujeMlekaKoziego() {
        if (mlekoKozie <= 0.1) {
            System.out.println("Brakuje Mleka Koziego!");
            System.out.println("Czy chcesz uzupełnić jego poziom teraz? (Tak/Nie)");
            String d = skann.nextLine();
            if (d.equals("Tak") || d.equals("tak") || d.equals("T") || d.equals("t")) {
                System.out.println("Ilość Mleka Koziego jest optymalna.");
                mlekoKozie = 0.5;
            } else if (d.equals("Nie") || d.equals("nie") || d.equals("N") || d.equals("n")) {
                System.out.println("Brak możliwości zaparzenia kawy; brak Mleka Koziego");
                czyBrakujeMlekaKoziego();
            } else {
                System.out.println("BŁĄD! Spróbuj ponownie");
                czyBrakujeMlekaKoziego();
            }
        }
    }
}
