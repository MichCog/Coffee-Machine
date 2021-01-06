package com.company;

import java.util.concurrent.TimeUnit;

public class grzałka {
    private int temperatura; /* w stopniach Celsjusza*/

    public grzałka(int temperatura) {
        this.temperatura = temperatura;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void sprawdzenieTemperatury() throws InterruptedException {
        if (temperatura < 100) {
            temperatura++;
            sprawdzenieTemperatury();

        } else if (temperatura > 100) {
            temperatura--;
            sprawdzenieTemperatury();

        }
    }

    public void nagrzewanieWody() throws InterruptedException {
        System.out.println("Nagrzewam wodę...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Woda została nagrzana do odpowiedniej temperatury!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" ");
    }


    public void nagrzewanieMleka() throws InterruptedException {
        if (pojemnikNaMleko.j.equals("Tak") || pojemnikNaMleko.j.equals("tak") || pojemnikNaMleko.j.equals("T") || pojemnikNaMleko.j.equals("t")) {
            System.out.println("Nagrzewam mleko...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Mleko zostało nagrzane do odpowiedniej temperatury!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(" ");
        }
    }
}
