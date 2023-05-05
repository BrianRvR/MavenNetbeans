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
public class RestadorTest {
    @Test
    public void testRestarDosNumeros() {
        Restador restador = new Restador();
        int resultado = restador.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testRestarTresNumeros() {
        Restador restador = new Restador();
        int resultado = restador.restar(10, 4, 2);
        assertEquals(4, resultado);
    }
}
