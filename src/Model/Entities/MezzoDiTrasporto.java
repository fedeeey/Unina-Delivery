package Model.Entities;

public class MezzoDiTrasporto {
	private String targa;
	private Integer capacitàPeso;
	private Integer capacitàSpazio;
	private Boolean disponibilita;
	private String modello;
	
	public MezzoDiTrasporto(String targa, Integer capacitàPeso, Integer capacitàSpazio, Boolean disponibilità, String modello) {
		this.setTarga(targa);
		this.setCapacitàPeso(capacitàPeso);
		this.setCapacitàSpazio(capacitàSpazio);
		this.setDisponibilita(disponibilita);
		this.setModello(modello);
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Integer getCapacitàPeso() {
		return capacitàPeso;
	}

	public void setCapacitàPeso(Integer capacitàPeso) {
		this.capacitàPeso = capacitàPeso;
	}

	public Integer getCapacitàSpazio() {
		return capacitàSpazio;
	}

	public void setCapacitàSpazio(Integer capacitàSpazio) {
		this.capacitàSpazio = capacitàSpazio;
	}

	public Boolean getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(Boolean disponibilita) {
		this.disponibilita = disponibilita;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

}