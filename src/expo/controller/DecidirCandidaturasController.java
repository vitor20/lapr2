/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.*;
import java.util.List;

/**
 *
 * @author cferreira
 */
public class DecidirCandidaturasController {

    private final CentroExposicoes m_oCE;
    private Exposicao m_exposicao;
    private Decisao m_decisao;
    private FAE m_oFfae;
    
    public DecidirCandidaturasController(CentroExposicoes ce) {
        this.m_oCE = ce;
    }

    public List<Exposicao> getListaExposicoesDoFAE(Utilizador u) {
        return this.m_oCE.getRegistoExposicoes().getListaExposicoesDoFAE(u);
    }

    public List<Decisao> selecionaExposicao(Exposicao exposicao, Utilizador u) {
        this.m_exposicao=exposicao;
        this.m_oFfae=m_exposicao.getFAE(u);
        
        return this.m_exposicao.getListaCandidaturaPorDecidir(m_oFfae);
    }

    public String getInformacaoDaCandidaturaPorDecidir(Decisao d) {
        this.m_decisao=d;
        return this.m_exposicao.getInformacaoDaCandidaturaPorDecidir(d);
    }
      
    public void setDecisao(String dec, String textoJustificacao) {
        this.m_decisao.setDecisao(dec);
        this.m_decisao.setTextoDescricao(textoJustificacao);
    }

    public void registaDecisao() {
        this.m_exposicao.registaDecisao(m_decisao);
        
    }

  
    
}


    
   
   