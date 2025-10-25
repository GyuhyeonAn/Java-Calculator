import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void calcFactorial() {
        ScientificCalculator calcFact = new ScientificCalculator();
        assertEquals(6, calcFact.calcFactorial(3));
    }
}