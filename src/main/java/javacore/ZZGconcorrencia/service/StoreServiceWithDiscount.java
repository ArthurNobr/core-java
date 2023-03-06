package javacore.ZZGconcorrencia.service;

import javacore.ZZGconcorrencia.dominio.Discount;
import javacore.ZZGconcorrencia.dominio.Quote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
//storeName, price, discountCode
public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        System.out.printf("Getting prices sync for store %s%n", storeName);
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return  storeName + ":" + price + ":" + discountCode;
    }

    public String applyDiscount(Quote quote){
        delay();
        double discontValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) /100;
        return String.format("'%s' original price: %.2f. Applying discount code '%s'. Final price: %.2f",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discontValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }


    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
