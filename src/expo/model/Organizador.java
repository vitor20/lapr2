/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

public class Organizador {

    private Utilizador m_oUtilizador;

    public Organizador(Utilizador uti) {
        this.m_oUtilizador = uti;
    }

    public void setUtilizador(Utilizador u) {
        this.m_oUtilizador = u;
    }

    public String getUsernameOrganizador(){
        return this.m_oUtilizador.getUsername();
    }
    
    public boolean valida() {
        if(this.m_oUtilizador.valida()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.m_oUtilizador.toString();
    }

    public boolean isUtilizador(Utilizador u) {
        if (this.m_oUtilizador != null) {
            return this.m_oUtilizador.equals(u);
        }
        return false;
    }

    public Utilizador getUtilizador() {
        return m_oUtilizador;
    }
}
