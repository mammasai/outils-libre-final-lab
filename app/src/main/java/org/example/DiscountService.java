package org.example;

public class DiscountService {
    public double applyDiscount(double subtotal, CustomerType type, String promoCode) {
        double discount = 0;
        // خصم vip
        if (type == CustomerType.VIP) {
            discount = subtotal * 0.20;
        }     
           // خصم اضافي 
        if ("SAVE10".equals(promoCode)) {
            discount += 10;
        }
        return discount;
    }
}