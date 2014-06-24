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
public class ConversionTest {

    public ConversionTest() {
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

    Unit kilometre = new Unit("Kilometre", UnitSystem.MetricSystem, UnitType.Length, 1, FactorType.Simple, true);
    Unit metre = new Unit("Metre", UnitSystem.MetricSystem, UnitType.Length, 1, FactorType.Simple, true);
    Conversion conv = new Conversion(kilometre, metre, 25);

    /**
     * Test of getSource method, of class Conversion.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        conv.getSource();
    }

    /**
     * Test of setSource method, of class Conversion.
     */
    @Test
    public void testSetSource() {
        System.out.println("setSource");
        conv.setSource(metre);
    }

    /**
     * Test of getTarget method, of class Conversion.
     */
    @Test
    public void testGetTarget() {
        System.out.println("getTarget");
        conv.getTarget();
    }

    /**
     * Test of setTarget method, of class Conversion.
     */
    @Test
    public void testSetTarget() {
        System.out.println("setTarget");
        conv.setTarget(kilometre);
    }

    /**
     * Test of getAmount method, of class Conversion.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        conv.getAmount();
    }

    /**
     * Test of setAmount method, of class Conversion.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        conv.setAmount(35);
    }

}
