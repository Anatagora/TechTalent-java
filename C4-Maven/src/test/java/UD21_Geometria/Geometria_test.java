package UD21_Geometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UD21_JUnit_Geometria.Geometria;

public class Geometria_test {

    private Geometria geometria;

    @BeforeEach
    public void setUp() {
        geometria = new Geometria();
    }

    @Test
    public void testAreaCirculo() {
        double radio = 5;
        double esperado = 3.1416 * Math.pow(radio, 2);
        double resultado = geometria.areaCirculo(radio);
        assertEquals(esperado, resultado, 0.0001, "El área del círculo calculada no es correcta");
    }

    @Test
    public void testAreaTrapecio() {
        int baseMayor = 10;
        int baseMenor = 6;
        int altura = 4;
        int esperado = ((baseMayor + baseMenor) / 2) * altura;
        int resultado = geometria.areatrapecio(baseMayor, baseMenor, altura);
        assertEquals(esperado, resultado, "El área del trapecio calculada no es correcta");
    }

    @Test
    public void testFigura() {
        int id = 3;
        String esperado = "Triangulo";
        String resultado = geometria.figura(id);
        assertEquals(esperado, resultado, "El nombre de la figura no es correcto");
    }
}

