/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavennetbeans;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brian
 */
public class SumadorTest {
    @Test
    public void testSumarDosNumeros() {
        Sumador s = new Sumador();
        int resultado = s.sumar(2, 3);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testSumarTresNumeros() {
        Sumador s = new Sumador();
        int resultado = s.sumar(2, 3, 4);
        assertEquals(9, resultado);
    }
}
