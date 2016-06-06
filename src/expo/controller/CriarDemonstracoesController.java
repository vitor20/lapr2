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
import expo.model.ListaRecursosDemonstracao;
import expo.model.Recurso;
import expo.model.RegistoExposicoes;
import expo.model.RegistoRecurso;
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
    private RegistoRecurso registoRecurso;
    private ListaRecursosDemonstracao listaRecursoDemonstracao;
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
          m_listaDemonstracoes=this.exposicao.getListaDemonstracoes();
      }
      
      public void novaDemonstracao(){
          demonstracao=m_listaDemonstracoes.novaDemonstracao();
      }
      
      public void setDados(String cod, String desc){
          demonstracao.setCodigo(cod);
          demonstracao.setDescricao(desc);
      }
      
      public RegistoRecurso getListaRecursos(){
          return this.registoRecurso;
      }
      
      public void addRecursoDemonstracao(Recurso rec){
          this.listaRecursoDemonstracao=demonstracao.getListaRecursos();
          this.listaRecursoDemonstracao.addRecurso(rec);
      }
      
      public boolean registaDemonstracao(){
          return this.m_listaDemonstracoes.addDemonstracao(demonstracao);
      }
      
      public String getDemonstracaoInfo(){
          return this.demonstracao.toString();
      }

    
}
