
package expo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CentroExposicoes {

    private final List<MecanismoAtribuicao> listaMecanismos;
    private final List<Utilizador> m_lUtilizadores;
    private ArrayList<GestorDeExposicoes> listaGestores;
    private RegistoUtilizadores m_RegistoUtilizadores;
    private RegistoExposicoes registo_expo;
    private RegistoRecurso registo_recurso;

    public CentroExposicoes() {
        m_RegistoUtilizadores = new RegistoUtilizadores();
        this.registo_expo = new RegistoExposicoes();
        this.m_lUtilizadores = new ArrayList<>();
        listaMecanismos = new ArrayList<>();
        listaGestores = new ArrayList<>();
        fillInData();
    }

//    public Utilizador novoUtilizador() {
//        return new Utilizador();
//    }
//
//    public boolean registaUtilizador(Utilizador u) {
//        if (validaUtilizador(u)) {
//            addUtilizador(u);
//            return true;
//        }
//        return false;
//    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.m_RegistoUtilizadores;
    }

    public RegistoRecurso getRegistoRecurso() {
        return this.registo_recurso;
    }

    public RegistoExposicoes getRegistoExposicoes() {
        return this.registo_expo;
    }
    
    public ArrayList<Utilizador> getUtilizadores() {
        return this.m_RegistoUtilizadores.getUtilizadores();
    }
    
    public boolean utilizadorConfirmado(String username) {
        for (Utilizador utl : getRegistoUtilizadores().getUtilizadores()) {
            if (utl.getUsername().equals(username) && utl.getRegistado()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean verificaUtilizador(String username, String password) {
        for (Utilizador u : getUtilizadores()) {
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    private boolean validaUtilizador(Utilizador u) {
        return !m_lUtilizadores.contains(u);
    }

//    private void addUtilizador(Utilizador u) {
//        m_lUtilizadores.add(u);
//    }


    private void fillInData() {
        // Dados de Teste
        //Preenche alguns utilizadore
        for (Integer i = 1; i <= 4; i++) {
            //this.m_lUtilizadores.add(new Utilizador("Utilizador " + i.toString(), "mail" + i.toString()+"@exposicoes.pt", Boolean.TRUE ));
        }
    }

    public Utilizador getUtilizador(String strId) {
        for (Utilizador u : this.m_lUtilizadores) {
            if (u.hasID(strId)) {
                return u;
            }
        }
        return null;
    }

    public List<Utilizador> getUtilizadoresNaoRegistados() {
        List<Utilizador> lUsers = new ArrayList<Utilizador>();

        for (Utilizador u : m_lUtilizadores) {
            if (!u.getRegistado()) {
                lUsers.add(u);
            }
        }
        return lUsers;
    }

    public void confirmaRegistoUtilizador(Utilizador u) {
        u.setRegistado(true);
    }

    
    public List<MecanismoAtribuicao> getListaMecanismos() {
        return listaMecanismos;
    }
}
