package expo.model;

public class Utilizador {

    private String m_sNome;
    private String m_sEmail;
    private String m_sUserName;
    private String m_sPassword;
    private boolean boolean_registado;

    public Utilizador() {
        new Utilizador(null, null, null, null);
    }

    public Utilizador(String m_sNome, String m_sEmail, String m_sUsername, String m_sPassword) {
        setNome(m_sNome);
        setEmail(m_sEmail);
        setUsername(m_sUsername);
        setPassword(m_sPassword);
        this.boolean_registado = false;
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

    public String getPassword() {
        return m_sPassword;
    }

    public void setPassword(String password) {
        if (password != null) {
            this.m_sPassword = password;
        }
    }

    public boolean getRegistado() {
        return boolean_registado;
    }

    public void setRegistado(boolean registado) {
        this.boolean_registado = registado;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", m_sNome, m_sEmail, m_sUserName, m_sPassword);
    }

    public boolean valida() {
        if (this.m_sNome.isEmpty() || this.m_sPassword.isEmpty() || this.m_sUserName.isEmpty() || this.m_sEmail.isEmpty()) {
            throw new IllegalArgumentException("Existem campos em branco!");
        } else {
            if (!this.m_sNome.replaceAll(" ", "").matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Nome inválido!");
            } else {
                if (!this.m_sUserName.matches("[_.@a-zA-Z0-9]+")) {
                    throw new IllegalArgumentException("Username inválido!");
                } else {
                    if (!this.m_sEmail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                        throw new IllegalArgumentException("Email inválido!");
                    } else {
                        return true;
                    }
                }
            }
        }
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
