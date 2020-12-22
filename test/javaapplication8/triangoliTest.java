/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giorgio Del Rocca
 */
public class triangoliTest {
    
    public triangoliTest() {
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
     * Test of tipologia method, of class triangoli.
     */
    @Test
    public void testTipologia() {
        System.out.println("tipologia");
        triangoli instance = new triangoli(8.0,6.0,10.0);
        String expResult = "scaleno, rettangolo";
        String result = instance.tipologia();
        assertEquals(expResult, result);
      
       
    }

    /**
     * Test of perimetro method, of class triangoli.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        triangoli instance = new triangoli(8.0,6.0,10.0);
        double expResult = 24.0;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
    }
       

    /**
     * Test of area method, of class triangoli.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        triangoli instance = new triangoli(8.0,6.0,10.0);
        double expResult = 24.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);

    }
    
}
