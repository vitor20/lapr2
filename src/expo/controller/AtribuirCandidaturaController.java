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
 * @author Pedro santos
 */
public class AtribuirCandidaturaController {

    private final CentroExposicoes m_centro_exposicoes;
    private Exposicao exposicao;
    private MecanismoAtribuicao mecanismo;
    private List<Atribuicao> atribuicoes;

    public AtribuirCandidaturaController(CentroExposicoes ce) {
        this.m_centro_exposicoes = ce;
    }

    public List<MecanismoAtribuicao> getListaMecanismos() {
        return m_centro_exposicoes.getListaMecanismos();
    }

    public List<Atribuicao> setMecanismo(int i) {
        this.mecanismo = m_centro_exposicoes.getListaMecanismos().get(i);
        return criarAtribuicoes();
    }

    private List<Atribuicao> criarAtribuicoes() {
        atribuicoes = mecanismo.gerarAtribuicoes(exposicao);
        return atribuicoes;
    }

    public void registaAtribuicoes() {
        exposicao.addAtribuicoes(atribuicoes);
    }

    public List<Exposicao> getListaExpOrg(String id) {
        List<Exposicao> lst = new ArrayList<>();
        for (Exposicao exp : m_centro_exposicoes.getRegistoExposicoes().getExposicoes()) {
            if (exp.hasOrganizador(id)) {
                lst.add(exp);
            }
        }
        return lst;
    }

    public void setExposicao(Exposicao exp) {
        exposicao = exp;
    }

}
