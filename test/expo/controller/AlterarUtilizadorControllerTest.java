/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Utilizador;
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
public class AlterarUtilizadorControllerTest {
    
    public AlterarUtilizadorControllerTest() {
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
     * Test of getUtilizador method, of class AlterarUtilizadorController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        CentroExposicoes ce = new CentroExposicoes();
        
        AlterarUtilizadorController instance = new AlterarUtilizadorController(ce);
        instance.getUtilizador("email@gmail.com");
    }

    /**
     * Test of alterarDados method, of class AlterarUtilizadorController.
     */
    @Test
    public void testAlterarDados() {
        System.out.println("alterarDados");
        
        String nome = "nomee";
        String username = "usernamee";
        String email = "emaill@gmail.com";
        String password = "passwordd";
        
        CentroExposicoes ce = new CentroExposicoes();
        AlterarUtilizadorController instance = new AlterarUtilizadorController(ce);
        
        Utilizador uti = new Utilizador("nome", "username", "email@gmail.com", "password");
        ce.getRegistoUtilizadores().addUtilizador(uti);
        instance.getUtilizador(uti.getEmail());
        
        boolean expResult = true;
        boolean result = instance.alterarDados(nome, username, email, password);
        
        assertEquals(expResult, result);
    }
    
}
