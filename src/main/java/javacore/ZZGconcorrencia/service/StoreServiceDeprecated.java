package javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        System.out.printf("%s generatin price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown() {
        ex.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
