package UD21_Geometria;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraGrupoTest {

    @Test
    public void testAddition() {
        Calculadora_Grupo calculator = new Calculadora_Grupo();
        double result = calculator.calculate(5, 3, "+");
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculadora_Grupo calculator = new Calculadora_Grupo();
        double result = calculator.calculate(5, 3, "-");
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculadora_Grupo calculator = new Calculadora_Grupo();
        double result = calculator.calculate(5, 3, "*");
        assertEquals(15.0, result, 0.001);
    }
}
