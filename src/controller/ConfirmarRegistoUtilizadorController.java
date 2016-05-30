package controller;

import java.util.List;
import model.CentroExposicoes;
import model.Utilizador;

/**
 *
 * @author Ecs
 */
public class ConfirmarRegistoUtilizadorController {
    
    private final CentroExposicoes m_ce;
    private Utilizador m_utilizadorAConfirmar;
    
    public ConfirmarRegistoUtilizadorController(CentroExposicoes ce){
        this.m_ce=ce;
    }    
    
    public List<Utilizador> iniciaConfirmacaoUtilizador(){
        return m_ce.getUtilizadoresNaoRegistados();
    }
    
    public Utilizador getUtilizadorInfo(String uId){
        m_utilizadorAConfirmar = m_ce.getUtilizadorInfo(uId);
        return m_utilizadorAConfirmar;
    }
    
    public void confirmaRegistoUtilizador(){
        m_ce.confirmaRegistoUtilizador(m_utilizadorAConfirmar);
    }
    
}
