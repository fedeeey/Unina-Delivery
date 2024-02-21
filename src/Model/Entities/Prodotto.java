package Model.Entities;

public class Prodotto {
	
	private int idProdotto;
	private String nomeProdotto;
	private String dimensioni;
	private float peso;
	private int quantitaDisp;
	private float prezzo;
	
	public Prodotto(int idProdotto, String nomeProdotto, String dimensioni, float peso, int quantitaDisp, float prezzo) {
		this.setIdProdotto(idProdotto);
		this.setNomeProdotto(nomeProdotto);
		this.setDimensioni(dimensioni);
		this.setPeso(peso);
		this.setQuantitaDisp(quantitaDisp);
		this.setPrezzo(prezzo);
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getQuantitaDisp() {
		return quantitaDisp;
	}

	public void setQuantitaDisp(int quantitaDisp) {
		this.quantitaDisp = quantitaDisp;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
}
