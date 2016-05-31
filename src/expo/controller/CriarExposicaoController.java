/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.Utilizador;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 * ------------------------------------
 */
public class CriarExposicaoController
{
    private final CentroExposicoes m_oCE;
    private Exposicao m_exposicao;
    public CriarExposicaoController(CentroExposicoes ce)
    {
        this.m_oCE = ce;
    }
    
    public void novaExposicao()
    {
        this.m_exposicao = this.m_oCE.novaExposicao();
    }
    
    public void setDados(String sTitulo, String sDescritivo, Date oDtInicio, Date oDtFim, String sLocal)
    {
        this.m_exposicao.setTitulo(sTitulo);
        this.m_exposicao.setDescritivo(sDescritivo);
        this.m_exposicao.setPeriodo(oDtInicio,oDtFim);
        this.m_exposicao.setLocal(sLocal);
    }
    
    public List<Utilizador> getListaUtilizadores()
    {
        return this.m_oCE.getUtilizadores();
    }
    
    public void addOrganizador(Utilizador u)
    {
        this.m_exposicao.addOrganizador(u);
    }
    
    public boolean validaExposicao()
    {
        return this.m_oCE.validaExposicao(m_exposicao);
    }
    
    public boolean registaExposicao()
    {
        return this.m_oCE.registaExposicao(m_exposicao);
    }

    public String getExposicaoString()
    {
        return this.m_exposicao.toString();
    }
}
