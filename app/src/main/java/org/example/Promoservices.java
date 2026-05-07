package org.example;

public class Promoservices {
    public static final double REMISE_VIP = 0.05;

    public static double calculateDiscount(double amount, lesclients type) {
        if (type == lesclients.PREMIUM) {
            return amount * REMISE_VIP;
        }
        return 0;
    }
}