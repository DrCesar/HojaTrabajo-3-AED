/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wadeowen
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of preCalc method, of class Calculadora.
     */
    @Test
    public void testPreCalc() {
        System.out.println("preCalc");
        String s = "";
        Calculadora instance = new Calculadora();
        instance.setTipo(s);
        instance.preCalc(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of infixToPostfix method, of class Calculadora.
     */
    @Test
    public void testInfixToPostfix() {
        System.out.println("infixToPostfix");
        Calculadora instance = new Calculadora();
        //instance.infixToPostfix();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.getResultado();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInfix method, of class Calculadora.
     */
    @Test
    public void testGetInfix() {
        System.out.println("getInfix");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.getInfix();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Calculadora.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String s = "";
        Calculadora instance = new Calculadora();
        instance.setTipo(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
