/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cferreira
 */
public class DecidirCandidaturasController {
  private CentroExposicoes ce;
    Candidatura c;
    Atribuicao a;

    public DecidirCandidaturasController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public List<Atribuicao> getListaAtribuicoes(String id) {
        List<Atribuicao> atrs = new ArrayList<>();
        for (Exposicao exp : ce.getRegistoExposicoes().getListaExpFAE(id)) {
            atrs.addAll(exp.getAtribuicoes(id));
        }
        return atrs;
    }

    public void setAtribuicao(Atribuicao at) {
        a = at;
    }

    public void setDados(String decisao, String justificacao) {
        a.getAvaliacao().setDecisao(decisao);
        a.getAvaliacao().setJustificacao(justificacao);
    }
}
