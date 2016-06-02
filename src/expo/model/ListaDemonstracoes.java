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
public class ListaDemonstracoes {
    private Exposicao m_exposicao;
    private List<Demonstracao> m_listDemonstracoes;
    
    public ListaDemonstracoes(){
        m_listDemonstracoes=new ArrayList<Demonstracao>();
    }
    
    public ListaDemonstracoes(Exposicao e){
        this.m_exposicao=e;
        m_listDemonstracoes=new ArrayList<Demonstracao>();
    }
    
    public Demonstracao novaDemonstracao(){
        return new Demonstracao();
    }
    public List<Demonstracao> getListaDemonstracoes(){
        return this.m_listDemonstracoes;
    }
    
    public void setListaDemonstracoes(List<Demonstracao> lista){
        this.m_listDemonstracoes=lista;
    }
    
    public void addDemonstracao(Demonstracao demo){
        if(valida(demo)){
            this.m_listDemonstracoes.add(demo);
        }
    }
    
    public boolean valida(Demonstracao demo){
        for(Demonstracao dem : this.m_listDemonstracoes){
            if(dem.equals(demo)){
                return false;
            }
        }
        return true;
    }
}
