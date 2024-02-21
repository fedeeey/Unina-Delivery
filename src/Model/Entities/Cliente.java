package Model.Entities;

import java.util.Date;

public class Cliente {
	private String emailCliente;
	private String nTelefonoCliente;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String indirizzoPredefinito;

	public Cliente(String emailCliente, String nTelefonoCliente, String nome, String cognome, Date dataNascita, String indirizzoPredefinito) {
		this.setEmailCliente(emailCliente);
		this.setnTelefonoCliente(nTelefonoCliente);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setDataNascita(dataNascita);
		this.setIndirizzoPredefinito(indirizzoPredefinito);
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getnTelefonoCliente() {
		return nTelefonoCliente;
	}

	public void setnTelefonoCliente(String nTelefonoCliente) {
		this.nTelefonoCliente = nTelefonoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getIndirizzoPredefinito() {
		return indirizzoPredefinito;
	}

	public void setIndirizzoPredefinito(String indirizzoPredefinito) {
		this.indirizzoPredefinito = indirizzoPredefinito;
	}
	
	
	
}
