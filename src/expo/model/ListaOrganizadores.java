/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.ArrayList;


/**
 *
 * @author Nuno
 */
public class ListaOrganizadores {
    public ArrayList<Organizador> listaOrganizadores;
    
    public ListaOrganizadores(){
        listaOrganizadores = new ArrayList<>();
    }
    
    public ArrayList<Organizador> getListaOrganizadores(){
        return this.listaOrganizadores;
    }
    
    public boolean addOrganizador(Utilizador uti){
        if(uti==null){
            return false;
        }
        Organizador org = new Organizador(uti);
        
        if(org.valida() && validaOrganizador(org)){
            return addOrganizador(org);
        }
        return false;
    }

    private boolean validaOrganizador(Organizador org) {
        if(org.getUtilizador().valida()){
            return true;
        }
        return false;
    }

    private boolean addOrganizador(Organizador org) {
        return this.listaOrganizadores.add(org);
    }
}
