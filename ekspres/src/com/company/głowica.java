package com.company;

import java.util.concurrent.TimeUnit;

public class głowica {
    public void mieszanie() throws InterruptedException {
        System.out.println("Składniki są właśnie mieszane w głowicy...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println(" ");
    }

    public void wlewDoKubka() throws InterruptedException {
        System.out.println("Przelewam gotową kawę do kubka...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println(" ");
    }

}
