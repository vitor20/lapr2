/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Utilizador;

/**
 *
 * @author Nuno
 */
public class AlterarUtilizadorController {

    public CentroExposicoes ce;

    public Utilizador uti;

    public AlterarUtilizadorController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public void getUtilizador(String email) {
        uti = ce.getRegistoUtilizadores().getUtilizadorPorEmail(email);
    }

    public boolean alterarDados(String nome, String username, String email, String password) {
        Utilizador novoUti = uti.clone();
        
        novoUti.setNome(nome);
        novoUti.setUsername(username);
        novoUti.setEmail(email);
        novoUti.setPassword(password);
        
        return true;//this.ce.getRegistoUtilizadores();
    }
}
