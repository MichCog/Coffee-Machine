package com.company;

import java.util.concurrent.TimeUnit;

public class pompaMleka {
    private int ciśnienieMleka; /*w barach*/

    public pompaMleka(int ciśnienieMleka) {
        this.ciśnienieMleka = ciśnienieMleka;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setCiśnienieMleka(int ciśnienieMleka) {
        this.ciśnienieMleka = ciśnienieMleka;
    }

    public int getCiśnienieMleka() {
        return ciśnienieMleka;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void uruchamianiePompyMleka() throws InterruptedException {
        if (pojemnikNaMleko.j.equals("Tak") || pojemnikNaMleko.j.equals("tak") || pojemnikNaMleko.j.equals("T") || pojemnikNaMleko.j.equals("t")) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Uruchamiam pompę mleka...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(" ");
        }
    }

    public void sprawdzenieCiśnieniaMleka() {
        if (ciśnienieMleka < 15) {
            ciśnienieMleka++;
            sprawdzenieCiśnieniaMleka();

        } else if (ciśnienieMleka > 15) {
            ciśnienieMleka--;
            sprawdzenieCiśnieniaMleka();

        }
    }
}
