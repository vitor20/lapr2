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
    private Recurso rec;
        
    public RegistoRecurso(){
        listaRecursos=new ArrayList<>();
    }
    
    public List<Recurso> getListaRecursos(){
        return this.listaRecursos;
    }
    
    public void setListaRecursos(List<Recurso> list){
        this.listaRecursos=list;
    }
    
}
