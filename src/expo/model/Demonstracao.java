/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.List;

/**
 *
 * @author VITOR
 */
public class Demonstracao {
    private String m_codigo;
    private String m_descricao;
    private ListaRecursosDemonstracao listaDemonstracoes;
    
    public Demonstracao(){ 
        this.m_descricao="Sem descrição";
        this.listaDemonstracoes=new ListaRecursosDemonstracao(this);
    }
    
    public Demonstracao(String cod){
        this.m_codigo=cod;
        this.m_descricao="Sem descrição";
        this.listaDemonstracoes=new ListaRecursosDemonstracao(this);
    }
    
    public Demonstracao(String cod,String des){
        this.m_codigo=cod;
        this.m_descricao=des;
        this.listaDemonstracoes=new ListaRecursosDemonstracao(this);
    }
    
    public void setCodigo(String cod){
        this.m_codigo=cod;
    }
    
    public void setDescricao(String des){
        this.m_descricao=des;
    }
    
    public void setListaRecursos(List<Recurso> list){
        this.listaDemonstracoes.setListaRecursosDemontracoes(list);
    }
    
    public String getCodigo(){
        return this.m_codigo;
    }
    
    public String getDescricao(){
        return this.m_descricao;
    }
    
    public ListaRecursosDemonstracao getListaRecursos(){
        return this.listaDemonstracoes;
    }
    
    public boolean valida(){
        return true;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+this.m_codigo+"\nDescricao:"+this.m_descricao;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this.m_codigo==((Demonstracao)obj).m_codigo){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
