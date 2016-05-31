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
}
