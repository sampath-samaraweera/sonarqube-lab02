package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddOperations() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.calculate(2, 3, "add"));
        assertEquals(5, calc.calculate(2, 3, "add-again"));
    }

    @Test
    public void testSubOperations() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.calculate(2, 3, "sub"));
        assertEquals(-1, calc.calculate(2, 3, "sub-again"));
    }

    @Test
    public void testMulOperation() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.calculate(2, 3, "mul"));
    }

    @Test
    public void testDivOperation() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.calculate(6, 3, "div"));
        assertEquals(0, calc.calculate(2, 0, "div")); // division by zero
    }

    @Test
    public void testModOperation() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.calculate(5, 2, "mod"));
    }

    @Test
    public void testPowOperation() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.calculate(2, 3, "pow"));
    }

    @Test
    public void testUnknownOperation() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(2, 3, "unknown"));
    }
}