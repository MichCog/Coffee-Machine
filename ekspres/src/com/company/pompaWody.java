package com.company;

import java.util.concurrent.TimeUnit;

public class pompaWody {
    private int ciśnienieWody; /*w barach*/

    public pompaWody(int ciśnienieWody) {
        this.ciśnienieWody = ciśnienieWody;
    }

    /*----------------------------------------Gettery i settery----------------------------------------*/
    public void setCiśnienieWody(int ciśnienieWody) {
        this.ciśnienieWody = ciśnienieWody;
    }

    public int getCiśnienieWody() {
        return ciśnienieWody;
    }
    /*-------------------------------------------------------------------------------------------------*/

    public void uruchamianiePompyWody() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Uruchamiam pompę wody...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" ");
    }

    public void sprawdzenieCiśnieniaWody() {
        if (ciśnienieWody < 15) {
            ciśnienieWody++;
            sprawdzenieCiśnieniaWody();

        } else if (ciśnienieWody > 15) {
            ciśnienieWody--;
            sprawdzenieCiśnieniaWody();

        }
    }
}
