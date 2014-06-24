/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NPIE;

import java.util.ArrayList;
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
public class UnitTest {
    
    public UnitTest() {
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
     * Test of getName method, of class Unit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Unit instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Unit.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Unit instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitSystem method, of class Unit.
     */
    @Test
    public void testGetUnitSystem() {
        System.out.println("getUnitSystem");
        Unit instance = null;
        UnitSystem expResult = null;
        UnitSystem result = instance.getUnitSystem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnitSystem method, of class Unit.
     */
    @Test
    public void testSetUnitSystem() {
        System.out.println("setUnitSystem");
        UnitSystem unitSystem = null;
        Unit instance = null;
        instance.setUnitSystem(unitSystem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitType method, of class Unit.
     */
    @Test
    public void testGetUnitType() {
        System.out.println("getUnitType");
        Unit instance = null;
        UnitType expResult = null;
        UnitType result = instance.getUnitType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnitType method, of class Unit.
     */
    @Test
    public void testSetUnitType() {
        System.out.println("setUnitType");
        UnitType unitType = null;
        Unit instance = null;
        instance.setUnitType(unitType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactor method, of class Unit.
     */
    @Test
    public void testGetFactor() {
        System.out.println("getFactor");
        Unit instance = null;
        double expResult = 0.0;
        double result = instance.getFactor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactor method, of class Unit.
     */
    @Test
    public void testSetFactor() {
        System.out.println("setFactor");
        float factor = 0.0F;
        Unit instance = null;
        instance.setFactor(factor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactorType method, of class Unit.
     */
    @Test
    public void testGetFactorType() {
        System.out.println("getFactorType");
        Unit instance = null;
        FactorType expResult = null;
        FactorType result = instance.getFactorType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactorType method, of class Unit.
     */
    @Test
    public void testSetFactorType() {
        System.out.println("setFactorType");
        FactorType factorType = null;
        Unit instance = null;
        instance.setFactorType(factorType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReference method, of class Unit.
     */
    @Test
    public void testGetReference() {
        System.out.println("getReference");
        Unit instance = null;
        boolean expResult = false;
        boolean result = instance.getReference();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReference method, of class Unit.
     */
    @Test
    public void testSetReference() {
        System.out.println("setReference");
        boolean reference = false;
        Unit instance = null;
        instance.setReference(reference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Unit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Unit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddUnit method, of class Unit.
     */
   /* @Test
    public void testAddUnit() {
        System.out.println("AddUnit");
        Unit expResult = null;
        Unit result = Unit.AddUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of displayUnits method, of class Unit.
     */
    @Test
    public void testDisplayUnits() {
        System.out.println("displayUnits");
        ArrayList<Unit> liste = null;
        Unit.displayUnits(liste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
