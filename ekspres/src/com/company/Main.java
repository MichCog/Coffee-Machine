package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        panelPrzedni włącz = new panelPrzedni();
        włącz.czyWłączony();
        Scanner jojo = new Scanner(System.in);
        String h;
        włącz.dioda();
        if (włącz.dioda == 1) {
            System.out.println("---------------------------------------------------------------------------");
            pojemnikNaKubki kubek = new pojemnikNaKubki(50);
            kubek.wysuwanieKubka();
            /*---------------------------------------------------------------------------*/
            pojemnikNaKawę kawa = new pojemnikNaKawę(0.5, 0.5, 0.5, 0.5, 0.5);
            kawa.pobieranieKawy();
            /*---------------------------------------------------------------------------*/
            młynekDoKawy młynek = new młynekDoKawy(1);
            młynek.mielenieKawy();
            /*---------------------------------------------------------------------------*/
            pojemnikNaMleko mleko = new pojemnikNaMleko(0.5, 0.5);
            mleko.pobieranieMleka();
            /*---------------------------------------------------------------------------*/
            pojemnikNaCukier cukier = new pojemnikNaCukier(0.04, 0.04);
            cukier.pobieranieCukru();
            /*---------------------------------------------------------------------------*/
            pojemnikNaWodę woda = new pojemnikNaWodę(0.5);
            woda.pobieranieWody();
            /*---------------------------------------------------------------------------*/
            grzałka grzanie = new grzałka(250);
            grzanie.sprawdzenieTemperatury();
            grzanie.nagrzewanieWody();
            grzanie.nagrzewanieMleka();
            /*---------------------------------------------------------------------------*/
            pompaWody pompaw = new pompaWody(15);
            pompaw.sprawdzenieCiśnieniaWody();
            pompaw.uruchamianiePompyWody();
            /*---------------------------------------------------------------------------*/
            pompaMleka pompam = new pompaMleka(15);
            pompam.sprawdzenieCiśnieniaMleka();
            pompam.uruchamianiePompyMleka();
            /*---------------------------------------------------------------------------*/
            głowica głow = new głowica();
            głow.mieszanie();
            głow.wlewDoKubka();
            /*---------------------------------------------------------------------------*/
            przepisyUżytkownika Przepis = new przepisyUżytkownika();
            Przepis.czyDodajemyPrzepis();
            /*---------------------------------------------------------------------------*/
            System.out.println(" ");
            System.out.println(" Czy chcesz przygotować kolejną kawę?(Tak/Nie)");
            h = jojo.nextLine();

            do {
                kubek.wysuwanieKubka();
                kawa.pobieranieKawy();
                /*---------------------------------------------------------------------------*/
                młynek.mielenieKawy();
                /*---------------------------------------------------------------------------*/
                mleko.pobieranieMleka();
                /*---------------------------------------------------------------------------*/
                cukier.pobieranieCukru();
                /*---------------------------------------------------------------------------*/
                woda.pobieranieWody();
                /*---------------------------------------------------------------------------*/
                grzanie.sprawdzenieTemperatury();
                grzanie.nagrzewanieWody();
                grzanie.nagrzewanieMleka();
                /*---------------------------------------------------------------------------*/
                pompaw.sprawdzenieCiśnieniaWody();
                pompaw.uruchamianiePompyWody();
                /*---------------------------------------------------------------------------*/
                pompam.sprawdzenieCiśnieniaMleka();
                pompam.uruchamianiePompyMleka();
                /*---------------------------------------------------------------------------*/
                głow.mieszanie();
                głow.wlewDoKubka();
                /*---------------------------------------------------------------------------*/
                przepisyUżytkownika.i += 1;
                Przepis.czyDodajemyPrzepis();
                /*---------------------------------------------------------------------------*/

                System.out.println(" ");
                System.out.println(" Czy chcesz przygotować kolejną kawę?(Tak/Nie)");
                h = jojo.nextLine();
            } while (h.equals("Tak") || h.equals("tak") || h.equals("T") || h.equals("t"));

            włącz.koniec();
        }

    }
}




