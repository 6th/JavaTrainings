package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public final int i = 1;

    private static final Object lock = new Object();

    public static void main(String[] args) {
        System.out.println("Main.main");

        synchronized (Main.class) {

        }

        Map<String, String> map = new HashMap<String, String>();
    }


    private void test() throws InterruptedException {
        lock.wait();
    }
}
