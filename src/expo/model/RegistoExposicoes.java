/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistoExposicoes {
    private ArrayList<Exposicao> listaExposicoes;
    
    public RegistoExposicoes(){
        listaExposicoes = new ArrayList<>();
    }
    
    public Exposicao novaExposicao(){
        return new Exposicao();
    }
    
    public boolean validaExposicao(Exposicao e) {
        if (e.valida()) {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }

    public boolean registaExposicao(Exposicao e) {
        if(validaExposicao(e)){
            return this.addExposicao(e);
        }else{
            return false;
        }
    }

    private boolean addExposicao(Exposicao e) {
        return this.listaExposicoes.add(e);
    }
    
    public List<Exposicao> getListaExposicoesDoFAE(Utilizador u) {
        List<Exposicao> l_ExpDoFAE = new ArrayList();

        for (Exposicao m : this.listaExposicoes) {
            if (m.getFAE(u) != null) {
                l_ExpDoFAE.add(m);
            }

        }
        return l_ExpDoFAE;
    }
    
    public List<Exposicao> getExposicaoOrganizador(String strId) {
        List<Exposicao> leOrganizador = new ArrayList<Exposicao>();

//        Utilizador u = getUtilizador(strId);
//
//        if (u != null) {
//            for (Iterator<Exposicao> it = this.listaExposicoes.listIterator(); it.hasNext();) {
//                Exposicao e = it.next();
//
//                if (e.hasOrganizador(u)) {
//                    leOrganizador.add(e);
//                }
//            }
//        }
        return leOrganizador;
    }
}
