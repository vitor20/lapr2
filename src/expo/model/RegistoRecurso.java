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
public class RegistoRecurso {
    
    private List<Recurso> listaRecursos;
        
    public RegistoRecurso(){
        listaRecursos=new ArrayList<>();
    }
    
    public Recurso novoRecurso(String descricao){
        Recurso rec=new Recurso(descricao);
        if(rec.valida()){
            return rec;
        }
        return null;
    }
    
    public boolean registaRecurso(Recurso rec){
        if(this.validaRecurso(rec)){
            this.listaRecursos.add(rec);
            return true;
        }
        return false;
    }
    
    private boolean validaRecurso(Recurso rec){
       for(Recurso re : this.listaRecursos){
           if(re.equals(rec)){
               return false;
           }
       }
       return true;
    }
    
    public List<Recurso> getListaRecursos(){
        return this.listaRecursos;
    }
    
    public void setListaRecursos(List<Recurso> list){
        this.listaRecursos=list;
    }
    
}