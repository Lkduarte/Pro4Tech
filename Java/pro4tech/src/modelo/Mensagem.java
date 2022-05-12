package modelo;

import java.sql.Timestamp;
import java.util.Date;

public class Mensagem {
    private int codMensagem;
    private String assuntoMsg;
    private Date dataMsg;
    private Timestamp horaMsg;
    private String conteudoMsg;
    private String tipo;
    private int usuarioId;
    private int perfilId;
    private int codProjeto;

    public int getCodMensagem() {
        return codMensagem;
    }

    public void setCodMensagem(int codMensagem) {
        this.codMensagem = codMensagem;
    }

    public String getAssuntoMsg() {
        return assuntoMsg;
    }

    public void setAssuntoMsg(String assuntoMsg) {
        this.assuntoMsg = assuntoMsg;
    }

    public Date getDataMsg() {
        return dataMsg;
    }

    public void setDataMsg(Date dataMsg) {
        this.dataMsg = dataMsg;
    }

    public Timestamp getHoraMsg() {
        return horaMsg;
    }

    public void setHoraMsg(Timestamp horaMsg) {
        this.horaMsg = horaMsg;
    }

    public String getConteudoMsg() {
        return conteudoMsg;
    }

    public void setConteudoMsg(String conteudoMsg) {
        this.conteudoMsg = conteudoMsg;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    public int getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(int codProjeto) {
        this.codProjeto = codProjeto;
    }
    
    
    
}
