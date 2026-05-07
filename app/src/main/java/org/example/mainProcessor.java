package org.example;

import java.util.Arrays;
import java.util.List;

public class mainProcessor {
    public double processFinalPrice(List<Double> unitPrices, List<Integer> quantities, lesclients clientType) {
        if (unitPrices == null || quantities == null || unitPrices.size() != quantities.size()) {
            throw new IllegalArgumentException("Données invalides");
        }

        double totalHT = 0;
        for (int i = 0; i < unitPrices.size(); i++) {
            totalHT += unitPrices.get(i) * quantities.get(i);
        }

        double discount = Promoservices.calculateDiscount(totalHT, clientType);
        double afterDiscount = totalHT - discount;
        double tax = afterDiscount * lesimpots.TVA_RATE;

        return afterDiscount + tax;
    }

    // دالة الـ Main لتجربة الكود مباشرة
    public static void main(String[] args) {
        mainProcessor engine = new mainProcessor();
        List<Double> p = Arrays.asList(1000.0, 2000.0);
        List<Integer> q = Arrays.asList(1, 1);
        
        double res = engine.processFinalPrice(p, q, lesclients.PREMIUM);
        System.out.println("Sallam! Final Price (with TVA 19%): " + res);
    }
}