package org.example;

public class PromotionManager {
    public double applyDiscount(double subtotal, ClientCategory type, String promoCode) {
        double discount = 0;
        // خصم vip
        if (type == ClientCategory.VIP) {
            discount = subtotal * 0.20;
        }     
           // خصم اضافي 
        if ("SAVE10".equals(promoCode)) {
            discount += 10;
        }
        return discount;
    }
}