/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

/**
 *
 * @author cferreira
 */
public class FAE {
    Utilizador m_oUFae;
    
    public FAE()
    {
      
    }
    
    public FAE(Utilizador u)
    {
      this.m_oUFae = u;
    }
    
    public boolean valida()
    {
        // Introduzir as validações aqui
        return true;
    }
      
      public void setUtilizador(Utilizador m_oUFae) {
        this.m_oUFae = m_oUFae;
    }

    public Utilizador getUtilizador() {
        return m_oUFae;
    }
    
    @Override
    public String toString()
    {
        return this.m_oUFae != null ? this.m_oUFae.toString() : null;
    }
    
}
