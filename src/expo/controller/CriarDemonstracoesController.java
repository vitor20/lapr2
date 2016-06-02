/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Demonstracao;
import expo.model.Exposicao;
import expo.model.ListaDemonstracoes;
import expo.model.RegistoExposicoes;
import java.util.List;

/**
 *
 * @author VITOR
 */
public class CriarDemonstracoesController {
    private CentroExposicoes m_centro;
    private RegistoExposicoes m_registoExposicoes;
    private Exposicao exposicao;
    private Demonstracao demonstracao;
    private ListaDemonstracoes m_listaDemonstracoes;
    
     public CriarDemonstracoesController(CentroExposicoes centro) {
        m_centro = centro;
        m_registoExposicoes = centro.getRegistoExposicoes();    
    }
     
      public List<Exposicao> getListaExposiçoesOrganizador(String strID) {
        return m_registoExposicoes.getExposicaoOrganizador(strID);
    }
      
      public void setExposicão(Exposicao exp){
          this.exposicao=exp;
          //demonstracao=this.exposicao.ge
      }

    
}
