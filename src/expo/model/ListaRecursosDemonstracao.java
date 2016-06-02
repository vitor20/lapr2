/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VITOR
 */
public class ListaRecursosDemonstracao {
    private Demonstracao m_demonstracao;
    private List<Recurso> m_listaRecursos;
    
    public ListaRecursosDemonstracao(){
        m_listaRecursos= new ArrayList<Recurso>();
    }
    
    public ListaRecursosDemonstracao(Demonstracao dem){
        this.m_demonstracao=dem;
        m_listaRecursos=new ArrayList<Recurso>();
    }
    
    public List<Recurso> getListaRecursosDemonstracao(){
        return this.m_listaRecursos;
    }
        
    public void setListaRecursosDemontracoes(List<Recurso> list){
        this.m_listaRecursos=list;
    }
    
    public void addRecurso(Recurso rec){
        if(valida(rec)){
            this.m_listaRecursos.add(rec);
        }
    }
    
    public boolean valida(Recurso rec){
        if(rec!=null){
            return true;
        }
        return false;
    }
        
    
}
