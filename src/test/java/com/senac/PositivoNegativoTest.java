package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositivoNegativoTest {

    @Test
    void avalia() {
    String resultado = PositivoNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", resultado);
    }
}