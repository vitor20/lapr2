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
 * @author Afonso S
 */
public class RegistoUtilizadores {

    private ArrayList<Utilizador> m_listaUtilizadores;

    public RegistoUtilizadores() {
        m_listaUtilizadores = new ArrayList<Utilizador>();
    }

    public Utilizador novoUtilizador() {
        return new Utilizador();
    }

    public boolean registaUtilizador(Utilizador u) {
        if (u.valida() && validaUtilizador(u)) {
            return addUtilizador(u);
        } else {
            return false;
        }
    }

    public boolean validaUtilizador(Utilizador u) {
        ArrayList<Utilizador> lu = getUtilizadores();
        for (Utilizador ut : lu) {
            if (u.getUsername().equals(ut.getUsername())) {
                return false;
            }
        }
        return true;
    }

    public boolean addUtilizador(Utilizador u) {
        return m_listaUtilizadores.add(u);
    }

    public Utilizador getUtilizadorByID(String strId) {
        for (Utilizador u : this.m_listaUtilizadores) {
            if (u.getUsername().equals(strId)) {
                return u;
            }
        }
        return null;
    }

    public Utilizador getUtilizadorPorEmail(String strEmail) {
        for (Utilizador u : this.m_listaUtilizadores) {
            if (u.getEmail().equals(strEmail)) {
                return u;
            }
        }
        return null;
    }

    public boolean alteraUtilizador(Utilizador uOriginal, Utilizador uClone) {
        if (uClone.valida()) {
            System.out.println("clone validado");
            List<Utilizador> lstUtilizadores = new ArrayList<Utilizador>(m_listaUtilizadores);
            lstUtilizadores.remove(uOriginal);
            lstUtilizadores.add(uClone);
            if (validaLista(lstUtilizadores, uClone)) {
                uOriginal.setNome(uClone.getNome());
                uOriginal.setEmail(uClone.getEmail());
                uOriginal.setUsername(uClone.getUsername());
                uOriginal.setPassword(uClone.getPassword());
            }else{
                return false;
            }
            return true;
        }
        return false;
    }

    public ArrayList<Utilizador> getUtilizadores() {

        return m_listaUtilizadores;
    }

    public Utilizador getUtilizadorInfo(String uId) {
        for (Utilizador u : m_listaUtilizadores) {
            if (uId.equalsIgnoreCase(u.getUsername())) {
                return u;
            }
        }
        return null;
    }
    
    private boolean validaLista(List<Utilizador> lista, Utilizador clone) {
        System.out.println("RegistoUtilizadores: validaLista: " + lista.toString());
        for(Utilizador uti : lista){
            if(clone.getEmail().equals(uti.getUsername())){
                throw new IllegalArgumentException("O Username já existe!");
            }else if(clone.getUsername().equals(uti.getEmail())){
                throw new IllegalArgumentException("O Email já existe!");
            }
        }
        return true;
    }
}
