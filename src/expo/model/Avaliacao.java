/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.io.Serializable;

/**
 *
 * @author Pedro Santos
 */
public class Avaliacao implements Serializable {

    private Candidatura candidatura;
    private String decisao;
    private String justificacao;

    public Avaliacao() {

    }

    /**
     * @return the decisao
     */
    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    public String getJustificacao() {
        return justificacao;
    }

    public void setJustificacao(String justificacao) {
        this.justificacao = justificacao;
    }

    public Candidatura getCandidatura() {
        return candidatura;
    }

    public boolean valida() {
        if (justificacao == null || justificacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Texto descritivo inválido!");
        } else if (decisao == null || decisao.trim().isEmpty()) {
            throw new IllegalArgumentException("Decisão inválida!");
        } else if (!decisao.equalsIgnoreCase("Sim") && !decisao.equalsIgnoreCase("Nao") && !decisao.equalsIgnoreCase("Não")) {
            return false;
        }
        return true;
    }

    public boolean equals(Avaliacao a) {
        if (this == a) {
            return true;
        }
        if (a == null || getClass() != a.getClass()) {
            return false;
        }
        Avaliacao outraAvaliacao = (Avaliacao) a;

        return candidatura.equals(outraAvaliacao.candidatura);
    }

}
