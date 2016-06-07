/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.Utilizador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro Santos
 */
public class RegistarUtilizadorControllerTest {
    
    public RegistarUtilizadorControllerTest() {
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
     * Test of novoUtilizador method, of class RegistarUtilizadorController.
     */
    @org.junit.Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        RegistarUtilizadorController instance = null;
        Utilizador expResult = null;
        Utilizador result = instance.novoUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDados method, of class RegistarUtilizadorController.
     */
    @org.junit.Test
    public void testSetDados() {
        System.out.println("setDados");
        String strNome = "";
        String strUsername = "";
        String strPassword = "";
        String strEmail = "";
        RegistarUtilizadorController instance = null;
        boolean expResult = false;
        boolean result = instance.setDados(strNome, strUsername, strPassword, strEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaUtilizador method, of class RegistarUtilizadorController.
     */
    @org.junit.Test
    public void testRegistaUtilizador() {
        System.out.println("registaUtilizador");
        RegistarUtilizadorController instance = null;
        boolean expResult = false;
        boolean result = instance.registaUtilizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
