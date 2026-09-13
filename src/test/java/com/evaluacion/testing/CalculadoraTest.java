package com.evaluacion.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumaUnitaria() {
        int resultado = 5 + 5;
        assertEquals(10, resultado, "La suma básica unitaria debe ser 10");
    }
}