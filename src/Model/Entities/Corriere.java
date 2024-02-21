package Model.Entities;

public class Corriere {
	private String nomeCorriere;
	private String cognomeCorriere;
	private String nTelefonoCorriere;
	private Boolean disponibilità;
	
	public Corriere(String nomeCorriere, String cognomeCorriere, String nTelefonoCorriere, Boolean disponibilita) {
		this.setNomeCorriere(nomeCorriere);
		this.setCognomeCorriere(cognomeCorriere);
		this.setnTelefonoCorriere(nTelefonoCorriere);
		this.setDisponibilità(disponibilità);
	}

	public String getNomeCorriere() {
		return nomeCorriere;
	}

	public void setNomeCorriere(String nomeCorriere) {
		this.nomeCorriere = nomeCorriere;
	}

	public String getCognomeCorriere() {
		return cognomeCorriere;
	}

	public void setCognomeCorriere(String cognomeCorriere) {
		this.cognomeCorriere = cognomeCorriere;
	}

	public String getnTelefonoCorriere() {
		return nTelefonoCorriere;
	}

	public void setnTelefonoCorriere(String nTelefonoCorriere) {
		this.nTelefonoCorriere = nTelefonoCorriere;
	}

	public Boolean getDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(Boolean disponibilità) {
		this.disponibilità = disponibilità;
	}

}
