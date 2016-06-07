/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

/**
 *
 * @author VITOR
 */
public class Recurso {
    private String descricao;
    
    public Recurso(){
        this.descricao="Sem descriçao";
    }
    
    public Recurso(String des){
        this.descricao=des;
    }
    
    public void setDescricao(String des){
        this.descricao=des;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public boolean valida(){
        if(this.descricao==null){
            return false;
        }    
        return true;
    }
    
    @Override
    public String toString(){
        return descricao;
    }
    
    @Override
    public boolean equals(Object obj){
        return this.getDescricao().equalsIgnoreCase(((Recurso) obj).getDescricao());
    }
}
