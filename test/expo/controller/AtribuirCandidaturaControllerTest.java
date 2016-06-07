/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.Atribuicao;
import expo.model.Exposicao;
import expo.model.MecanismoAtribuicao;
import java.util.List;
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
public class AtribuirCandidaturaControllerTest {
    
    public AtribuirCandidaturaControllerTest() {
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
     * Test of getListaMecanismos method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaMecanismos() {
        System.out.println("getListaMecanismos");
        AtribuirCandidaturaController instance = null;
        List<MecanismoAtribuicao> expResult = null;
        List<MecanismoAtribuicao> result = instance.getListaMecanismos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMecanismo method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testSetMecanismo() {
        System.out.println("setMecanismo");
        int i = 0;
        AtribuirCandidaturaController instance = null;
        List<Atribuicao> expResult = null;
        List<Atribuicao> result = instance.setMecanismo(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaAtribuicoes method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testRegistaAtribuicoes() {
        System.out.println("registaAtribuicoes");
        AtribuirCandidaturaController instance = null;
        instance.registaAtribuicoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaExpOrg method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testGetListaExpOrg() {
        System.out.println("getListaExpOrg");
        String id = "";
        AtribuirCandidaturaController instance = null;
        List<Exposicao> expResult = null;
        List<Exposicao> result = instance.getListaExpOrg(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExposicao method, of class AtribuirCandidaturaController.
     */
    @Test
    public void testSetExposicao() {
        System.out.println("setExposicao");
        Exposicao exp = null;
        AtribuirCandidaturaController instance = null;
        instance.setExposicao(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
