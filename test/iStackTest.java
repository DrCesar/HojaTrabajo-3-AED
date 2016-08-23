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
public class iStackTest {
    
    public iStackTest() {
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
     * Test of push method, of class iStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object c = null;
        iStack instance = new iStackImpl();
        instance.push(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class iStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        iStack instance = new iStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class iStack.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        iStack instance = new iStackImpl();
        Object expResult = null;
        Object result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class iStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        iStack instance = new iStackImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class iStackImpl implements iStack {

        @Override    
        public void push(Object c) {
        }
        
        @Override
        public Object pop() {
            return null;
        }

        public Object top() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        
    }
    
}
