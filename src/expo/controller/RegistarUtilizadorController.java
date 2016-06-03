
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.RegistoUtilizadores;
import expo.model.Utilizador;

/**
 *
 * @author Afonso S
 */
public class RegistarUtilizadorController {

    public CentroExposicoes m_exp;
    private RegistoUtilizadores m_registo;
    private Utilizador m_utilizador;


    public RegistarUtilizadorController(CentroExposicoes centro) {
        m_exp = centro;
        m_registo = m_exp.getRegistoUtilizadores();
    }

    public Utilizador novoUtilizador() {
        return m_utilizador = m_registo.novoUtilizador();
    }


    public boolean setDados(String strNome, String strUsername, String strPassword, String strEmail) {
        m_utilizador.setUsername(strUsername);
        m_utilizador.setNome(strNome);
        m_utilizador.setPassword(strPassword);
        m_utilizador.setEmail(strEmail);
//        m_utilizador.setNumeroTabela(id);
//        m_utilizador.setNrCharsPassw(nrChars);
        return m_utilizador.valida();
    }


    public boolean registaUtilizador() {
        return m_registo.registaUtilizador(m_utilizador);
    }

}

