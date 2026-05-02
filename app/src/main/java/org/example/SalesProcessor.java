package org.example;
import java.util.List;

public class SalesProcessor {
    private final PromotionManager discountService = new PromotionManager();
    private final FiscalCalculator taxService = new FiscalCalculator();

    public double calculateFinalPrice(List<Double> prices, List<Integer> quantities, ClientCategory type, String promoCode) {
        double subtotal = 0;
        for (int i = 0; i < prices.size(); i++) {
            subtotal += prices.get(i) * quantities.get(i);
        }

        double discount = discountService.applyDiscount(subtotal, type, promoCode);
        double taxableAmount = subtotal - discount;
        double tax = taxService.calculateTax(taxableAmount);

        return taxableAmount + tax;
    }
}