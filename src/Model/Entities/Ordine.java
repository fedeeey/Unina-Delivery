package Model.Entities;

import java.util.Date;

public class Ordine {

	private int idOrdine;
	private Date dataOrdine;
	private Boolean completamento;

	public Ordine(int idOrdine, Date dataOrdine, Boolean completamento) {
	this.setIdOrdine(idOrdine);
	this.setDataOrdine(dataOrdine);
	this.setCompletamento(completamento);
	
	}
	
	public int getIdOrdine() {
		return idOrdine;
	}
	
	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}
	
	public Date getDataOrdine() {
		return dataOrdine;
	}
	
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	
	public Boolean getCompletamento() {
		return completamento;
	}
	
	public void setCompletamento(Boolean completamento) {
		this.completamento = completamento;
	}
}