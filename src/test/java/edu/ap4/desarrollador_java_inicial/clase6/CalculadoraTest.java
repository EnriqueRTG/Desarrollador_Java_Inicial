/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @org.junit.Test
    public void testSumar() {
        System.out.println("sumar");
        double unNumero = 0.0;
        double otroNumero = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.sumar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @org.junit.Test
    public void testRestar() {
        System.out.println("restar");
        double unNumero = 0.0;
        double otroNumero = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.restar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @org.junit.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double unNumero = 0.0;
        double otroNumero = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @org.junit.Test
    public void testDividir() {
        System.out.println("dividir");
        double unNumero = 0.0;
        double otroNumero = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.dividir(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
