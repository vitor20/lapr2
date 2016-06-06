/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Recurso;
import expo.model.RegistoRecurso;

/**
 *
 * @author VITOR
 */
public class CriarRecursoController {
    private CentroExposicoes m_centro;
    private RegistoRecurso registoRecurso;
    private Recurso recurso;
    
    public CriarRecursoController(CentroExposicoes centro){
        m_centro=centro;
        registoRecurso=this.m_centro.getRegistoRecurso();
    }
    
    public void novoRecurso(String descricao){
        registoRecurso=this.m_centro.getRegistoRecurso();
        recurso=registoRecurso.novoRecurso(descricao);
    }
    
    public boolean registaRecurso(){
         return registoRecurso.registaRecurso(recurso);
    }
    
    
}
