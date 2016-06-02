/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class CentroExposicoes {

    private RegistoUtilizadores m_RegistoUtilizadores;
    private final List<Utilizador> m_lUtilizadores;
    private RegistoExposicoes registo_expo;
    private RegistoRecurso registo_recurso;

    public CentroExposicoes() {
        m_RegistoUtilizadores = new RegistoUtilizadores();
        this.m_lUtilizadores = new ArrayList<>();
        this.registo_expo = new RegistoExposicoes();
        fillInData();
    }

    public Utilizador novoUtilizador() {
        return new Utilizador();
    }

    public boolean registaUtilizador(Utilizador u) {
        if (validaUtilizador(u)) {
            addUtilizador(u);
            return true;
        }
        return false;
    }

    private boolean validaUtilizador(Utilizador u) {
        return !m_lUtilizadores.contains(u);
    }

    private void addUtilizador(Utilizador u) {
        m_lUtilizadores.add(u);
    }

    public List<Utilizador> getUtilizadores() {
        return this.m_lUtilizadores;
    }

    private void fillInData() {
        // Dados de Teste
        //Preenche alguns utilizadore
        for (Integer i = 1; i <= 4; i++) {
            //this.m_lUtilizadores.add(new Utilizador("Utilizador " + i.toString(), "mail" + i.toString()+"@exposicoes.pt", Boolean.TRUE ));
        }
    }

    public Utilizador getUtilizador(String strId) {
        for (Utilizador u : this.m_lUtilizadores) {
            if (u.hasID(strId)) {
                return u;
            }
        }
        return null;
    }

    public List<Utilizador> getUtilizadoresNaoRegistados() {
        List<Utilizador> lUsers = new ArrayList<Utilizador>();

        for (Utilizador u : m_lUtilizadores) {
            if (!u.getRegistado()) {
                lUsers.add(u);
            }
        }
        return lUsers;
    }

    public Utilizador getUtilizadorInfo(String uId) {
        for (Utilizador u : m_lUtilizadores) {
            if (uId.equalsIgnoreCase(u.getUsername())) {
                return u;
            }
        }
        return null;
    }

    public void confirmaRegistoUtilizador(Utilizador u) {
        u.setRegistado(true);
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.m_RegistoUtilizadores;
    }
    
    public RegistoRecurso getRegistoRecurso(){
        return this.registo_recurso;
    }
    
    public RegistoExposicoes getRegistoExposicoes() {
        return this.registo_expo;
    }
}
