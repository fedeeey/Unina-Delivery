package Model.Entities;

public class DettaglioOrdine {
	
	private int idDettaglio;
	private int quantita;
	
	public DettaglioOrdine(int idDettaglio, int quantita) {
		this.setIdDettaglio(idDettaglio);
		this.setQuantita(quantita);
	}

	public int getIdDettaglio() {
		return idDettaglio;
	}

	public void setIdDettaglio(int idDettaglio) {
		this.idDettaglio = idDettaglio;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
}
