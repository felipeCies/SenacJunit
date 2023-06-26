package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    @Test
    void soma() {
        int resultado = Calculadora.soma(2, 2);
        Assertions.assertEquals(4, resultado);
    }
    @Test
    void subtracao(){
        int resultado = Calculadora.subtracao(3,3);
        Assertions.assertEquals(0, resultado);
    }
    @Test
    void divisao(){
        int resultado = Calculadora.divisao(1,1);
        Assertions.assertEquals(1, resultado);
    }
    @Test
    void multiplicacao(){
        int resultado = Calculadora.multiplicacao(5,4);
        Assertions.assertEquals(20, resultado);
    }

}