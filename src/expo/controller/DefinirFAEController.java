/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expo.controller;

import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.FAE;
import expo.model.Utilizador;
import java.util.List;

/**
 *
 * @author rosamarianascimentodasilva
 */
public class DefinirFAEController
{
    private final CentroExposicoes m_centro_exposicoes;
    private Exposicao m_exp;
    
    private String strId;
   

    public DefinirFAEController(CentroExposicoes centroexposicoes)
    {
        m_centro_exposicoes = centroexposicoes;
    }

    public List<Exposicao> getExposicoesOrganizador(String strId)
    {
        return m_centro_exposicoes.getExposicaoOrganizador(strId);
    }
    
    public List<Utilizador> getUtilizadores()
    {
        return m_centro_exposicoes.getUtilizadores();
    }
    
    public void selectExposicao(Exposicao e)
    {
        this.m_exp = e;
    }
    
    public FAE addMembroFAE(String strID)
    {
        Utilizador u = m_centro_exposicoes.getUtilizador(strID);
        
        if( u!=null)
            return m_exp.addMembroFAE( u );
        else
            return null;
    }
    
    public boolean registaMembroFAE( FAE f )
    {
        return m_exp.registaMembroFAE(f);
    }
}
