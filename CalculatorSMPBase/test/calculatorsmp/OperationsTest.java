/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALICE
 */
public class OperationsTest {
    
    public OperationsTest() {
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
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        
        System.out.println("MakeFormula");
        
        String expResult = "";
        String result = Operations.MakeFormula();
        
        
        
        // Formula no vacia
        assertNotNull(null, result);
        assertFalse("No contiene vacios", result.contains(" "));
        //formula sin operadores repetidos
        assertFalse("No contiene dos operadores seguidos +", result.contains("++"));
        assertFalse("No contiene dos operadores seguidos -", result.contains("--"));
        assertFalse("No contiene dos operadores seguidos /", result.contains("//"));
        assertFalse("No contiene dos operadores seguidos *", result.contains("**"));
        
               
    }

    /**
     * Test of Solve method, of class Calculator.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        
        String formula = "2/0";
        String expResult = "indefinido";
        
        assertEquals(expResult, formula);
        
        formula = "83*5+52+99";
        expResult = "566";
        
        assertEquals(expResult, formula);
        
    }
    
}

    
