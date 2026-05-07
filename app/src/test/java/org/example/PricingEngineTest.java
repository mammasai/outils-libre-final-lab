package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class PricingEngineTest {
    @Test
    public void testLogic() {
        mainProcessor proc = new mainProcessor();
        double res = proc.processFinalPrice(Arrays.asList(100.0), Arrays.asList(1), lesclients.NORMAL);
        assertEquals(119.0, res, 0.01); // 100 + 19% TVA
    }
}