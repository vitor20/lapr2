/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expo.model;

import expo.model.FAE;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Exposicao
{
    private String m_sTitulo;
    private String m_sDescritivo;
    private Date m_oDtInicio;
    private Date m_oDtFim;
    private String m_sLocal;
    private final List<Organizador> m_lOrganizadores;
    private final List<FAE> m_lFAEs;
    private final List<Decisao> m_lDecisoes;
    
    
    public Exposicao()
    {
        this.m_lOrganizadores = new ArrayList<>();
        this.m_lDecisoes = new ArrayList<>();
        this.m_lFAEs=new ArrayList<>();
    }
    
    public void setTitulo(String titulo)
    {
        this.m_sTitulo = titulo;
    }
    
    public void setDescritivo(String descritivo)
    {
        this.m_sDescritivo = descritivo;
    }
    
    public void setPeriodo(Date dtInicio, Date dtFim)
    {
        this.setDataInicio(dtInicio);
        this.setDataFim(dtFim);
    }    
      
    private void setDataInicio(Date dtInicio)
    {
        this.m_oDtInicio = dtInicio;
    }
    
    private void setDataFim(Date dtFim)
    {
        this.m_oDtFim = dtFim;
    }
    
    public void setLocal(String local)
    {
        this.m_sLocal = local;
    }
    
    public FAE getFAE(Utilizador u) {
      for (FAE fae : this.m_lFAEs)
      {
          if (fae.m_oUFae.equals(u))
              return fae;
      }
        
      return null;
    }
    
    public List<Decisao> getListaCandidaturaPorDecidir(FAE fae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getInformacaoDaCandidaturaPorDecidir(Decisao d) {
        return this.m_lDecisoes.get(m_lDecisoes.indexOf(d)).getInfoCandidatura();
    }
     
    public void registaDecisao(Decisao d) {
        this.m_lDecisoes.get(m_lDecisoes.indexOf(d)).setDecidida();
    }
    
    public void addOrganizador(Utilizador u)
    {
        Organizador org = new Organizador();
        org.setUtilizador(u);
        if (validaOrganizador(org))
            addOrganizador(org);
    }
    
    public boolean validaOrganizador(Organizador o)
    {
        if (o.valida())
        {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }
    
     public boolean validaDecisao(Decisao d)
    {
        if (d.valida())
        {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }
     
    public boolean valida()
    {
        // Introduzir as validações aqui
        return true;
    }
    
    private boolean addOrganizador(Organizador o)
    {
        return this.m_lOrganizadores.add(o);
    }
    
    @Override
    public String toString()
    {
        String sTxt;
        sTxt = String.format("%s;%s;%s;%s%s;\n", this.m_sTitulo,this.m_sDescritivo,this.m_oDtInicio.toString(),this.m_oDtInicio.toString(),this.m_oDtFim.toString(),this.m_sLocal);
         
        for(Organizador org: this.m_lOrganizadores)
        {
            sTxt += String.format("%s \n",org.toString());
        }
        
        return sTxt;
    }

    public boolean hasOrganizador(Utilizador u)
    {
        for( Iterator<Organizador> it = this.m_lOrganizadores.listIterator(); it.hasNext(); )
        {
            Organizador org = it.next();
                
            if (org.isUtilizador(u))
                return true;
        }
        return false;
    }

    public FAE addMembroFAE(Utilizador u) 
    {
        FAE fae = new FAE(u);
        validaMembroFAE(fae);
        return fae;
    }

    public boolean registaMembroFAE(FAE fae) 
    {
        if (this.validaMembroFAE(fae))
            return this.m_lFAEs.add(fae);
        return false;
    }

  
    private boolean validaMembroFAE(FAE fae)
    {
        if (fae.valida())
        {
            // Introduzir as validações aqui
            return true;
        }
        return false;
    }

    

  
}
