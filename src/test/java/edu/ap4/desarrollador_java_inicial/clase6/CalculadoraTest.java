/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.ap4.desarrollador_java_inicial.clase6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class CalculadoraTest {
    Calculadora calculadoraAxiliar;
    
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
        calculadoraAxiliar = new Calculadora();  
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double unNumero = 150.0;
        double otroNumero = 180.0;
        Calculadora instance = new Calculadora();
        double expResult = 330.0;
        double result = instance.sumar(unNumero, otroNumero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double unNumero = 90.0;
        double otroNumero = 50.0;
        Calculadora instance = new Calculadora();
        double expResult = 40.0;
        double result = instance.restar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double unNumero = 80.0;
        double otroNumero = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 240.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMultiplicar2() {
        System.out.println("multiplicar");
        double unNumero = calculadoraAxiliar.restar(90, 50);
        double otroNumero = 15.0;
        Calculadora instance = new Calculadora();
        double expResult = 605.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertFalse("No da 605",result == expResult);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMultiplicar3() {
        System.out.println("multiplicar");
        double unNumero = calculadoraAxiliar.sumar(70, 40);
        double otroNumero = 25.0;
        Calculadora instance = new Calculadora();
        double expResult = 2700.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertFalse("No da 2700",result == expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double unNumero = calculadoraAxiliar.sumar(150, 180);
        double otroNumero = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 110.0;
        double result = instance.dividir(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
