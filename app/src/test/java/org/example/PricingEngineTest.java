package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 
import java.util.Arrays;

class PricingEngineTest {
    @Test
    void testVipPricingWithPromo() {
        SalesProcessor engine = new SalesProcessor();
        double result = engine.calculateFinalPrice(Arrays.asList(100.0), Arrays.asList(1), ClientCategory.VIP, "SAVE10");
        assertEquals(83.3, result, 0.01);
    }

    @Test
    void testRegularPricingNoPromo() {
        SalesProcessor engine = new SalesProcessor();
        double result = engine.calculateFinalPrice(Arrays.asList(200.0), Arrays.asList(1), ClientCategory.REGULAR, null);
        assertEquals(238.0, result, 0.01);
    }
}