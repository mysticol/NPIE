/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NPIE;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Baptiste
 */
public class ComplexConversionTest {
    
    public ComplexConversionTest() {
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
     * Test of ComplexConv method, of class ComplexConversion.
     */
    @Test
    public void testComplexConv_3args() throws Exception {
        System.out.println("ComplexConv");
        Unit src = null;
        Unit tgt = null;
        String str = "";
        ComplexConversion instance = null;
        double expResult = 0.0;
        double result = instance.ComplexConv(src, tgt, str);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ComplexConv method, of class ComplexConversion.
     */
    @Test
    public void testComplexConv() throws Exception {
        System.out.println("ComplexConv");
        ComplexConversion instance = null;
        double expResult = 0.0;
        double result = instance.ComplexConv();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
