/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Exposicao {

    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private Date dataInicioSub;
    private Date dataFimSub;

    private String local;
    private final List<Organizador> m_lOrganizadores;
    private final List<FAE> m_lFAEs;
    private ListaOrganizadores listaOrganizadores;
    private ListaDemonstracoes listaDemonstracoes;
    private List<Atribuicao> listaAtribuicoes;

    public Exposicao() {
        this.m_lOrganizadores = new ArrayList<>();
        this.m_lFAEs = new ArrayList<>();
        this.listaOrganizadores = new ListaOrganizadores();
        this.listaDemonstracoes = new ListaDemonstracoes();
        this.listaAtribuicoes = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescritivo(String descritivo) {
        this.descricao = descritivo;
    }

    public void setPeriodo(Date dtInicio, Date dtFim) {
        this.setDataInicio(dtInicio);
        this.setDataFim(dtFim);
    }

    public void setPeriodoSubmissao(Date dtInicio, Date dtFim) {
        this.setDataInicioSubmissao(dtInicio);
        this.setDataFimSubmissao(dtFim);
    }

    private void setDataInicio(Date dtInicio) {
        this.dataInicio = dtInicio;
    }

    private void setDataFim(Date dtFim) {
        this.dataFim = dtFim;
    }

    private void setDataInicioSubmissao(Date dtInicio) {
        this.dataInicioSub = dtInicio;
    }

    private void setDataFimSubmissao(Date dtFim) {
        this.dataFimSub = dtFim;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public FAE getFAE(Utilizador u) {
        for (FAE fae : this.m_lFAEs) {
            if (fae.m_oUFae.equals(u)) {
                return fae;
            }
        }

        return null;
    }

    public void addOrganizador(Utilizador u) {
        Organizador org = new Organizador();
        org.setUtilizador(u);
        if (validaOrganizador(org)) {
            addOrganizador(org);
        }
    }

    public boolean validaOrganizador(Organizador o) {
        if (o.valida()) {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }

    public boolean valida() {
        if (!titulo.matches("[a-zA-Z]+")) {
            return false;
        } else if (!descricao.matches("[a-zA-Z]+")) {
            return false;
        } else if (!validarDatas()) {
            return false;
        } else if (!local.matches("[a-zA-Z]+")) {
            return false;
        }
        return true;
    }

    private boolean addOrganizador(Organizador o) {
        return this.m_lOrganizadores.add(o);
    }

    @Override
    public String toString() {
        String sTxt;
        sTxt = String.format("%s;%s;%s;%s%s;\n", this.titulo, this.descricao, this.dataInicio.toString(), this.dataFim.toString(), this.local);

        for (Organizador org : this.m_lOrganizadores) {
            sTxt += String.format("%s \n", org.toString());
        }

        return sTxt;
    }

    public boolean hasOrganizador(String id) {
        for (Iterator<Organizador> it = this.m_lOrganizadores.listIterator(); it.hasNext();) {
            Organizador org = it.next();

            if (org.getUtilizador().hasID(id)) {
                return true;
            }
        }
        return false;
    }

    public FAE addMembroFAE(Utilizador u) {
        FAE fae = new FAE(u);
        validaMembroFAE(fae);
        return fae;
    }

    public boolean registaMembroFAE(FAE fae) {
        if (this.validaMembroFAE(fae)) {
            return this.m_lFAEs.add(fae);
        }
        return false;
    }

    private boolean validaMembroFAE(FAE fae) {
        if (fae.valida() && !this.m_lFAEs.contains(fae)) {
            return true;
        }
        return false;
    }

    public ListaOrganizadores getListaOrganizadores() {
        return this.listaOrganizadores;
    }

    public ListaDemonstracoes getListaDemonstracoes() {
        return this.listaDemonstracoes;
    }

    private boolean validarDatas() {
        Date data_atual = new Date(System.currentTimeMillis());
        if (this.dataFim.after(this.dataInicio) && this.dataFimSub.after(dataInicioSub) && data_atual.before(dataFimSub) && data_atual.before(dataInicio)) {
            return true;
        }
        return false;
    }

    public void addAtribuicao(Atribuicao a) {
        listaAtribuicoes.add(a);
    }

    public List<Atribuicao> getAtribuicoes(String id) {
        List<Atribuicao> atr = new ArrayList<>();
        for (Atribuicao at : listaAtribuicoes) {
            if (at.getFae().getUtilizador().getUsername().equals(id)) {
                atr.add(at);
            }
        }
        return atr;
    }

    public List<Atribuicao> getListaAtribuicoes() {
        return listaAtribuicoes;
    }

    public Atribuicao novaAtribuicao() {
        return new Atribuicao();
    }

    public void addAtribuicoes(List<Atribuicao> atrs) {
        listaAtribuicoes.addAll(atrs);
    }

    public boolean hasFAE(String id) {
        for (FAE fae : m_lFAEs) {
            if (fae.getUtilizador().hasID(id)) {
                return true;
            }
        }
        return false;
    }
}
