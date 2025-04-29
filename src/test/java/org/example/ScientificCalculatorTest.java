package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    // Testes de operações básicas:

    @Test
    void testAdditionWithTwoPositiveNumbers() {
        ScientificCalculator calculator = new ScientificCalculator();
        double resultado = calculator.add(7.5, 2.5);
        assertEquals(10.0, resultado, "A soma de 7.5 + 2.5 deve ser 10.0");
    }


    @Test
    void testSubtractionWithPositiveOperands() {
        ScientificCalculator calc = new ScientificCalculator(); // setup
        double resultado = calc.subtract(10.0, 3.0); // execution
        assertEquals(7.0, resultado, "A subtração de 10 - 3 deve ser 7.0"); // assertion
    }

    // Testes de funções matemáticas:

    @Test
    void testSquareRootOfPositiveNumber() {
        double result = calculator.squareRoot(25.0);
        assertEquals(5.0, result, 0.0001, "Raiz quadrada de 25 deve ser 5.0");
    }

    @Test
    void testLogarithmOfENumberReturnsOne() {
        double result = calculator.log(Math.E);
        assertEquals(1.0, result, 0.0001, "Log de e deve ser 1.0");
    }

    @Test
    void testSineOfThirtyDegrees() {
        double result = calculator.sin(30.0);
        assertEquals(0.5, result, 0.0001, "Seno de 30° deve ser aproximadamente 0.5");
    }

    // Testes de exceções e erros:

    @Test
    void testSquareRootOfNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-9.0),
                "Raiz quadrada de número negativo deve lançar IllegalArgumentException");
    }

    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0, 0.0),
                "Dividir por zero deve lançar IllegalArgumentException");
    }
}