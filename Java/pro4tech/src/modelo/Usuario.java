package modelo;

public class Usuario {
    
    private int usuarioId;
    private String nomeUsuario;
    private String empresaUsuario;
    private String funcaoUsuario;
    private String telefoneUsuario;
    private String emailUsuario;
    private int perfilUsuario;
    private String senha;
    private String loginUsuario;
    private int CodProjeto;

    public Usuario(int usuarioId, String nomeUsuario, String empresaUsuario, String funcaoUsuario, String telefoneUsuario, String emailUsuario, int perfilUsuario, String senha, String loginUsuario, int codProjeto) {
        this.usuarioId = usuarioId;
        this.nomeUsuario = nomeUsuario;
        this.empresaUsuario = empresaUsuario;
        this.funcaoUsuario = funcaoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.perfilUsuario = perfilUsuario;
        this.senha = senha;
        this.loginUsuario = loginUsuario;
        this.CodProjeto = codProjeto;
    }

    public Usuario(String nomeUsuario, String empresaUsuario, String funcaoUsuario, String telefoneUsuario, String emailUsuario, int perfilUsuario, String senha, String loginUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.empresaUsuario = empresaUsuario;
        this.funcaoUsuario = funcaoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.perfilUsuario = perfilUsuario;
        this.senha = senha;
        this.loginUsuario = loginUsuario;
        //this.CodProjeto = CodProjeto;
    }
    
    

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmpresaUsuario() {
        return empresaUsuario;
    }

    public void setEmpresaUsuario(String empresaUsuario) {
        this.empresaUsuario = empresaUsuario;
    }

    public String getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setFuncaoUsuario(String funcaoUsuario) {
        this.funcaoUsuario = funcaoUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public int getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(int perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public int getCodProjeto() {
        return CodProjeto;
    }

    public void setCodProjeto(int CodProjeto) {
        this.CodProjeto = CodProjeto;
    }
    
}
