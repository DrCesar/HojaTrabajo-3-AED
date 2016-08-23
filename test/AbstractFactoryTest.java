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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
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
     * Test of getStack method, of class AbstractFactory.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        String s = "";
        AbstractFactory instance = new AbstractFactoryImpl();
        iStack expResult = null;
        iStack result = instance.getStack(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class AbstractFactoryImpl extends AbstractFactory {

        public iStack getStack(String s) {
            return null;
        }
    }
    
}
