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
public class Decisao {
    private final Candidatura m_oCCandidatura;
    private final FAE m_oFfae;
    private Boolean m_BDecidida;
    private String m_oBDecisao;
    private String m_oSTexto;
    
    public Decisao(Candidatura c, FAE fae)
    {
        this.m_oCCandidatura=c;
        this.m_oFfae=fae;
        this.m_BDecidida=false;
        
    }
    public void setDecisao(String dec) {
       this.m_oBDecisao=dec;
    }  

    public void setTextoDescricao(String textoJustificacao) {
       this.m_oSTexto= textoJustificacao;
    }
    
    public String getInfoCandidatura(){
        return this.m_oCCandidatura.toString();
    }
    
     public boolean valida(){
        // Introduzir as validações aqui
        return true;
    }
     
    public void setDecidida(){
        this.m_BDecidida = true;
    } 
    
}
