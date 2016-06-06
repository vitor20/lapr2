/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.controller;

import expo.model.*;

import java.util.List;

/**
 *
 * @author Pedro Santos
 */
public class RegistarCandidaturaController {

    private CentroExposicoes ce;
    Exposicao e;
    Candidatura c;

    public RegistarCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public List<Exposicao> getExposicoes() {
        return ce.getRegistoExposicoes().getExposicoes();
    }

    public Candidatura getCandidatura() {
        return c;
    }

    public Candidatura novaCandidatura(Exposicao e) {
        this.e = e;
        c = e.novaCandidatura();
        return c;
    }

    public void setDados(String nome, String morada, int nTelemovel, int nConvites, double areaExpositor) {
        c.setNome(nome);
        c.setMorada(morada);
        c.setTelemovel(nTelemovel);
        c.setQtdConvites(nConvites);
        c.setAreaPretendida(areaExpositor);
    }

    public void addProduto(String designacao) {
        c.addProduto(designacao);
    }

    public void addDemonstracao(String demo) {
        for (Demonstracao dem : getDemonstracoes()) {
            if (dem.getCodigo().equals(demo)) {
                c.addDemonstracao(dem);
            }
        }
    }

    public void registaCandidatura() {
        e.registaCandidatura(c);
    }

    public void novaCandidatura() {
        this.c = e.novaCandidatura();
    }

    public void setExposicao(Exposicao exp) {
        e = exp;
    }

    public List<Demonstracao> getDemonstracoes() {
        return (List<Demonstracao>) e.getDemonstracoes();
    }

    public List<Exposicao> getListExposicoes() {
        return ce.getRegistoExposicoes().getExposicoes();
    }
}
