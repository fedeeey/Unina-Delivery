package Model.Entities;

import java.util.Date;

public class Spedizione {
	
	private int idSpedizione;
	private String destinazione;
	private Date arrivoPrev;
	private String societa;
	private String stato;
	private Date dataSped;
	
	public Spedizione(int idSpedizione, String destinazione, Date arrivoPrev, String societa, String stato, Date dataSped) {
		this.setIdSpedizione(idSpedizione);
		this.setDestinazione(destinazione);
		this.setArrivoPrev(arrivoPrev);
		this.setSocieta(societa);
		this.setStato(stato);
		this.setDataSped(dataSped);
	}

	public int getIdSpedizione() {
		return idSpedizione;
	}

	public void setIdSpedizione(int idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public Date getArrivoPrev() {
		return arrivoPrev;
	}

	public void setArrivoPrev(Date arrivoPrev) {
		this.arrivoPrev = arrivoPrev;
	}

	public String getSocieta() {
		return societa;
	}

	public void setSocieta(String societa) {
		this.societa = societa;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Date getDataSped() {
		return dataSped;
	}

	public void setDataSped(Date dataSped) {
		this.dataSped = dataSped;
	}
}