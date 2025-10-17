import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientificCalculator sciCalc = new ScientificCalculator();

    @Test
    void calcFactorial() {
        sciCalc = new ScientificCalculator();
        assertEquals(120,sciCalc.calcFactorial(5));
    }
}