/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.RegistoUtilizadores;
import expo.model.Utilizador;
import expo.controller.RegistarUtilizadorController;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Afonso
 */
public class RegistarUtilizadorControllerTest {

    private RegistarUtilizadorController c;
    private Utilizador utlz;
    private Utilizador utlz2;
    
    public RegistarUtilizadorControllerTest() {
        CentroExposicoes cenTro = new CentroExposicoes();
        c = new RegistarUtilizadorController(cenTro);
        utlz = new Utilizador("João", "joaozito@hotmail.com", "Jonitazo", "1324jo");
        utlz2 = new Utilizador("Constança", "constita@gmail.com", "constantinopla", "raraYa");
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
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        CentroExposicoes e = new CentroExposicoes();
        RegistarUtilizadorController instance = new RegistarUtilizadorController(e);

        instance.novoUtilizador();
//        System.out.println("novoUtilizador");
//        String strNome = utlz.getNome();
//        String strUsername = utlz.getUsername();
//        String strPassword = utlz.getPassword();
//        String strEmail = utlz.getEmail();
//        RegistarUtilizadorController instance = c;
//        Utilizador expResult = utlz;
//        Utilizador result = instance.novoUtilizador();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDados method, of class RegistarUtilizadorController.
     */
    @Test
    public void testSetDados() {
        try {
            System.out.println("setDados");
            String strNome = utlz.getNome();
            String strUsername = utlz.getUsername();
            String strPassword = utlz.getPassword();
            String strEmail = utlz.getEmail();
            RegistarUtilizadorController instance = c;
            Utilizador expResult = utlz2;
            expResult.setNome(strNome);
            expResult.setUsername(strUsername);
            expResult.setPassword(strPassword);
            expResult.setEmail(strEmail);
            boolean result = instance.setDados(utlz.getNome(), utlz.getEmail(), utlz.getUsername(), utlz.getPassword());
            assertEquals(true, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }


}
