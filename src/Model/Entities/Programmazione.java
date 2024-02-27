package Model.Entities;

import java.util.Date;

public class Programmazione {
	private int idProgrammazione;
	private Date proxConsegna;
	private Date dataFine;
	private String orario;
	private String frequenza;
	
	public Programmazione(int idProgrammazione, Date proxConsegna, Date dataFine, String orario, String frequenza) {
		this.setIdProgrammazione(idProgrammazione);
		this.setProxConsegna(proxConsegna);
		this.setDataFine(dataFine);
		this.setOrario(orario);
		this.setFrequenza(frequenza);
	}

	public int getIdProgrammazione() {
		return idProgrammazione;
	}

	public void setIdProgrammazione(int idProgrammazione) {
		this.idProgrammazione = idProgrammazione;
	}

	public Date getProxConsegna() {
		return proxConsegna;
	}

	public void setProxConsegna(Date proxConsegna) {
		this.proxConsegna = proxConsegna;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public String getOrario() {
		return orario;
	}

	public void setOrario(String orario) {
		this.orario = orario;
	}

	public String getFrequenza() {
		return frequenza;
	}

	public void setFrequenza(String frequenza) {
		this.frequenza = frequenza;
	}

}