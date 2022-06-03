package modelo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MensagemIndividual {
    
    private int codMensagemIndividual;
    private String assuntoMsgIndividual;
    private Date dataMsgIndividual;
    private Timestamp horaMsgIndividual;
    private String conteudoMsgIndividual;
    private int quemEnvia;
    private int quemRecebe;

    public MensagemIndividual(int codMensagemIndividual, String assuntoMsgIndividual, Date dataMsgIndividual, Timestamp horaMsgIndividual, String conteudoMsgIndividual, int remetente, int usuarioId) {
        this.codMensagemIndividual = codMensagemIndividual;
        this.assuntoMsgIndividual = assuntoMsgIndividual;
        this.dataMsgIndividual = dataMsgIndividual;
        this.horaMsgIndividual = horaMsgIndividual;
        this.conteudoMsgIndividual = conteudoMsgIndividual;
        this.quemEnvia = remetente;
        this.quemRecebe = usuarioId;
    }

   

    public MensagemIndividual(String assuntoMsgIndividual, Date dataMsgIndividual, Timestamp horaMsgIndividual, String conteudoMsgIndividual, int remetente, int usuarioId) {
         this.assuntoMsgIndividual = assuntoMsgIndividual;
        this.dataMsgIndividual = dataMsgIndividual;
        this.horaMsgIndividual = horaMsgIndividual;
        this.conteudoMsgIndividual = conteudoMsgIndividual;
        this.quemEnvia = remetente;
        this.quemRecebe = usuarioId;
    }

    public int getCodMensagemIndividual() {
        return codMensagemIndividual;
    }

    public void setCodMensagemIndividual(int codMensagemIndividual) {
        this.codMensagemIndividual = codMensagemIndividual;
    }

    public String getAssuntoMsgIndividual() {
        return assuntoMsgIndividual;
    }

    public void setAssuntoMsgIndividual(String assuntoMsgIndividual) {
        this.assuntoMsgIndividual = assuntoMsgIndividual;
    }

    public Date getDataMsgIndividual() {
        return dataMsgIndividual;
    }

    public void setDataMsgIndividual(Date dataMsgIndividual) {
        this.dataMsgIndividual = dataMsgIndividual;
    }

    public Timestamp getHoraMsgIndividual() {
        return horaMsgIndividual;
    }

    public void setHoraMsgIndividual(Timestamp horaMsgIndividual) {
        this.horaMsgIndividual = horaMsgIndividual;
    }

    public String getConteudoMsgIndividual() {
        return conteudoMsgIndividual;
    }

    public void setConteudoMsgIndividual(String conteudoMsgIndividual) {
        this.conteudoMsgIndividual = conteudoMsgIndividual;
    }

    public int getQuemEnvia() {
        return quemEnvia;
    }

    public void setQuemEnvia(int quemEnvia) {
        this.quemEnvia = quemEnvia;
    }

    public int getQuemRecebe() {
        return quemRecebe;
    }

    public void setQuemRecebe(int quemRecebe) {
        this.quemRecebe = quemRecebe;
    }

    public long getDataLong(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String hora = dateFormat.format(new Date(horaMsgIndividual.getTime()));
        
        return dataMsgIndividual.getTime() + horaMsgIndividual.getTime();
    }
    
    
    
    
}
