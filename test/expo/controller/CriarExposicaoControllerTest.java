/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.Utilizador;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuno
 */
public class CriarExposicaoControllerTest {
    
    public CriarExposicaoControllerTest() {
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
     * Test of novaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testNovaExposicao() {
        System.out.println("novaExposicao");
        CriarExposicaoController instance = new CriarExposicaoController(new CentroExposicoes());
        Exposicao expResult = new Exposicao();
        Exposicao result = instance.novaExposicao();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of setDados method, of class CriarExposicaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String sTitulo = "titulo";
        String sDescritivo = "descricao";
        Date oDtInicio = new Date();
        Date oDtFim = new Date();
        Date oDtInicioSub = new Date();
        Date oDtFimSub = new Date();
        String sLocal = "local";
        CriarExposicaoController instance = new CriarExposicaoController(new CentroExposicoes());
        instance.novaExposicao();
        instance.setDados(sTitulo, sDescritivo, oDtInicio, oDtFim, oDtInicioSub, oDtFimSub, sLocal);
        String result = instance.getExposicaoString();
        assertEquals(sTitulo, result);
    }
    
    /**
     * Test of addOrganizador method, of class CriarExposicaoController.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("addOrganizador");
        
        CentroExposicoes ce = new CentroExposicoes();
        CriarExposicaoController instance = new CriarExposicaoController(ce);
        
        Utilizador u = new Utilizador("nome", "email@gmail.com", "username", "password");
        ce.getRegistoUtilizadores().addUtilizador(u);
        
        boolean result = instance.addOrganizador(u);
        boolean ExpResult = true;
        
        assertEquals(ExpResult, result);
    }

    /**
     * Test of validaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testValidaExposicao() {
        System.out.println("validaExposicao");
        CriarExposicaoController instance = null;
        boolean expResult = false;
        boolean result = instance.validaExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaExposicao method, of class CriarExposicaoController.
     */
    @Test
    public void testRegistaExposicao() {
        System.out.println("registaExposicao");
        CriarExposicaoController instance = null;
        Exposicao expResult = null;
        Exposicao result = instance.registaExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExposicaoString method, of class CriarExposicaoController.
     */
    @Test
    public void testGetExposicaoString() {
        System.out.println("getExposicaoString");
        CriarExposicaoController instance = null;
        String expResult = "";
        String result = instance.getExposicaoString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
