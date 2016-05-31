/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class CentroExposicoes
{
    private final List<Utilizador> m_lUtilizadores;
    private final List<Exposicao> m_lExposicoes;
    public CentroExposicoes()
    {
        this.m_lUtilizadores = new ArrayList<>();
        this.m_lExposicoes = new ArrayList<>();
        fillInData();
    }
    
    public Exposicao novaExposicao()
    {
        return new Exposicao();
    }

    public Utilizador novoUtilizador(){
        return new Utilizador();
    }

    public boolean registaUtilizador(Utilizador u){
        if(validaUtilizador(u)){
            addUtilizador(u);
            return true;
        }
        return false;
    }
    
    private boolean validaUtilizador(Utilizador u){
        return !m_lUtilizadores.contains(u);
    }
    
    private void addUtilizador(Utilizador u){
        m_lUtilizadores.add(u);
    }

    public List<Utilizador> getUtilizadores()
    {
        return this.m_lUtilizadores;
    }
    
    public boolean validaExposicao(Exposicao e)
    {
        if (e.valida())
        {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }
    
    public boolean registaExposicao(Exposicao e)
    {
        return this.addExposicao(e);
    }
    
    private boolean addExposicao(Exposicao e)
    {
        return this.m_lExposicoes.add(e);
    }

    private void fillInData()
    {
        // Dados de Teste
        //Preenche alguns utilizadore
        for(Integer i=1;i<=4;i++)
        {
            //this.m_lUtilizadores.add(new Utilizador("Utilizador " + i.toString(), "mail" + i.toString()+"@exposicoes.pt", Boolean.TRUE ));
        }
    }

    public List<Exposicao> getListaExposicoesDoFAE(Utilizador u) {
        List <Exposicao> l_ExpDoFAE=new ArrayList();
        
        for (Exposicao m: this.m_lExposicoes)
        {
            if(m.getFAE(u)!=null)
                l_ExpDoFAE.add(m);
                      
        }
        return l_ExpDoFAE;
    }
    
    public Utilizador getUtilizador(String strId)
    {
        for(Utilizador u:this.m_lUtilizadores)
        {
            if (u.hasID(strId))
                return u;
        }
        return null;
    }
     
    public List<Exposicao> getExposicaoOrganizador(String strId)
    {
        List<Exposicao> leOrganizador = new ArrayList<Exposicao>();

        Utilizador u = getUtilizador(strId);
        
        if(u != null )
        {
            for( Iterator<Exposicao> it = this.m_lExposicoes.listIterator(); it.hasNext(); )
            {
                Exposicao e = it.next();
                
                if (e.hasOrganizador(u))
                    leOrganizador.add(e);
            }
        }
        return leOrganizador;
    }

    public List<Utilizador> getUtilizadoresNaoRegistados(){
        List<Utilizador> lUsers = new ArrayList<Utilizador>();
        
        for(Utilizador u : m_lUtilizadores)
            if(!u.getRegistado())
                lUsers.add(u);
        return lUsers;
    }

    public Utilizador getUtilizadorInfo(String uId){
        for(Utilizador u : m_lUtilizadores)
            if (uId.equalsIgnoreCase(u.getUsername()))
                return u;
        return null;
    }

    public void confirmaRegistoUtilizador(Utilizador u){
        u.setRegistado(true);
    }
}
