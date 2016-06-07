/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.Organizador;
import expo.model.Recurso;
import expo.model.RegistoRecurso;
import expo.model.Utilizador;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VITOR
 */
public class CriarDemonstracoesControllerTest {
    
    private CentroExposicoes centro;
    private CriarDemonstracoesController controller;
    private Utilizador ut;
    private Exposicao exp;
    private Organizador org;
    
    
    
   public CriarDemonstracoesControllerTest() {
       centro=new CentroExposicoes();
       ut=new Utilizador("vitor","vitor@isep.pt","vc","vc");
       exp=new Exposicao();
       org = new Organizador(ut);
       exp.addOrganizador(ut);
       centro.getRegistoUtilizadores().addUtilizador(ut);
       centro.getRegistoExposicoes().registaExposicao(exp);
       controller=new CriarDemonstracoesController(centro);
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
     * Test of getListaExposiçoesOrganizador method, of class CriarDemonstracoesController.
     */
    @Test
    public void testGetListaExposiçoesOrganizador() {
        System.out.println("getListaExposi\u00e7oesOrganizador");
        String strID = "vc";
        List<Exposicao> ls = new ArrayList<>();
        ls.add(exp);
        CriarDemonstracoesController instance = controller;
        List<Exposicao> expResult = ls;
        List<Exposicao> result = instance.getListaExposiçoesOrganizador(strID);
        assertEquals(expResult, result);
    }

    /**
     * Test of setExposicão method, of class CriarDemonstracoesController.
     */
    @Test
    public void testSetExposicão() {
        System.out.println("setExposic\u00e3o");
        Exposicao exp = null;
        CriarDemonstracoesController instance = null;
        instance.setExposicão(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novaDemonstracao method, of class CriarDemonstracoesController.
     */
    @Test
    public void testNovaDemonstracao() {
        System.out.println("novaDemonstracao");
        CriarDemonstracoesController instance = null;
        instance.novaDemonstracao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDados method, of class CriarDemonstracoesController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String cod = "";
        String desc = "";
        CriarDemonstracoesController instance = null;
        instance.setDados(cod, desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaRecursos method, of class CriarDemonstracoesController.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
        CriarDemonstracoesController instance = null;
        RegistoRecurso expResult = null;
        RegistoRecurso result = instance.getListaRecursos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRecursoDemonstracao method, of class CriarDemonstracoesController.
     */
    @Test
    public void testAddRecursoDemonstracao() {
        System.out.println("addRecursoDemonstracao");
        Recurso rec = null;
        CriarDemonstracoesController instance = null;
        instance.addRecursoDemonstracao(rec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaDemonstracao method, of class CriarDemonstracoesController.
     */
    @Test
    public void testRegistaDemonstracao() {
        System.out.println("registaDemonstracao");
        CriarDemonstracoesController instance = null;
        boolean expResult = false;
        boolean result = instance.registaDemonstracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDemonstracaoInfo method, of class CriarDemonstracoesController.
     */
    @Test
    public void testGetDemonstracaoInfo() {
        System.out.println("getDemonstracaoInfo");
        CriarDemonstracoesController instance = null;
        String expResult = "";
        String result = instance.getDemonstracaoInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
