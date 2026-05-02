package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 
import java.util.Arrays;

class PricingEngineTest {
    @Test
    void testVipPricingWithPromo() {
        PricingEngine engine = new PricingEngine();
        double result = engine.calculateFinalPrice(Arrays.asList(100.0), Arrays.asList(1), CustomerType.VIP, "SAVE10");
        assertEquals(83.3, result, 0.01);
    }

    @Test
    void testRegularPricingNoPromo() {
        PricingEngine engine = new PricingEngine();
        double result = engine.calculateFinalPrice(Arrays.asList(200.0), Arrays.asList(1), CustomerType.REGULAR, null);
        assertEquals(238.0, result, 0.01);
    }
}