package Model.Entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operatore {
	private String emailOperatore;
	private String password;
	private String nomeOperatore;
	private String cognomeOperatore;
	private String nTelefonoOperatore;
	
	public Operatore(String emailOperatore, String password, String nomeOperatore, String cognomeOperatore, String nTelefonoOperatore) {
		this.setEmailOperatore(emailOperatore);
		this.setPassword(password);
		this.setNomeOperatore(nomeOperatore);
		this.setCognomeOperatore(cognomeOperatore);
		this.setnTelefonoOperatore(nTelefonoOperatore);
	}

	//Metodi
	public String getEmailOperatore() {
		return emailOperatore;
	}
	
	//Metodo per il controllo del formato dell'email
    private static final String formato_email = "^(.+)@(.+)$";

    private static final Pattern pattern = Pattern.compile(formato_email);

    public void setEmailOperatore(String emailOperatore) {
        Matcher matcher = pattern.matcher(emailOperatore);
        if (matcher.matches()) {
            this.emailOperatore = emailOperatore;
        } else {
            throw new IllegalArgumentException("Formato email non valido.");
        }
    }
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("La password deve essere lunga almeno 6 caratteri");
        }
    }

	public String getNomeOperatore() {
		return nomeOperatore;
	}

	public void setNomeOperatore(String nomeOperatore) {
		this.nomeOperatore = nomeOperatore;
	}

	public String getCognomeOperatore() {
		return cognomeOperatore;
	}

	public void setCognomeOperatore(String cognomeOperatore) {
		this.cognomeOperatore = cognomeOperatore;
	}

	public String getnTelefonoOperatore() {
		return nTelefonoOperatore;
	}

	public void setnTelefonoOperatore(String nTelefonoOperatore) {
		this.nTelefonoOperatore = nTelefonoOperatore;
	}

}