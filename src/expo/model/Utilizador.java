package expo.model;

public class Utilizador {

    private String m_sNome;
    private String m_sEmail;
    private String m_sUserName;
    private String m_sPassword;
    private Boolean m_bRegistado;
    private int numeroTabela;
    private int nrCharsPassw;

    public Utilizador() {
        new Utilizador(null, null, null, null);
    }

    public Utilizador(String m_sNome, String m_sEmail, String m_sUsername, String m_sPassword) {
        setNome(m_sNome);
        setEmail(m_sEmail);
        setUsername(m_sUsername);
        setPassword(m_sPassword);
//        this.m_sNome = sNome;
//        this.m_sEmail = sEmail;
//        this.m_sUserName = sEmail;
//        this.m_bRegistado = bRegistado;
    }

    /*
    public Utilizador(String sID, String sNome, String sEmail)
    {
        this.m_sNome = sNome;
        this.m_sEmail = sEmail;
        this.m_sUserName = sID;
    } */
    public boolean hasID(String strId) {
        return m_sUserName.equalsIgnoreCase(strId);
    }

    public String getID() {
        return m_sUserName;
    }

    public String getNome() {
        return m_sNome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.m_sNome = nome;
        }
    }

    public String getEmail() {
        return m_sEmail;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.m_sEmail = email;
        }
    }

    public String getUsername() {
        return m_sUserName;
    }

    public void setUsername(String username) {
        if (username != null) {
            this.m_sUserName = username;
        }
    }

    public int getNumeroTabela() {
        return numeroTabela;
    }

    public void setNumeroTabela(int numeroTabela) {
        this.numeroTabela = numeroTabela;
    }

    public String getPassword() {
        return m_sPassword;
    }

    public void setPassword(String password) {
        if (password != null) {
            this.m_sPassword = password;
        }
    }

    public int getNrCharsPassw() {
        return nrCharsPassw;
    }

    public void setNrCharsPassw(int nrCharsPassw) {
        this.nrCharsPassw = nrCharsPassw;
    }

    public Boolean getRegistado() {
        return m_bRegistado;
    }

    public void setRegistado(Boolean registado) {
        this.m_bRegistado = registado;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", m_sNome, m_sEmail, m_sUserName, m_sPassword);
    }

    public boolean valida() {
        if (getNome()==null || getEmail()==null || getPassword()==null || getUsername()==null){
            return false;
        }
        return true;
    }

    public Utilizador clone() {
        return new Utilizador(this.getNome(), this.getUsername(), this.getPassword(), this.getEmail());
    }

    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || outroObjeto.getClass() != this.getClass()) {
            return false;
        }
        Utilizador outroUtilizador = (Utilizador) outroObjeto;
        return this.m_sNome.equalsIgnoreCase(outroUtilizador.m_sNome);
    }
}
