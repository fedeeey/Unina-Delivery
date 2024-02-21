package Controller.Login;

import Model.DAO.OperatoreDAO;
import Model.Entities.Operatore;

public class SignUpController {
	private OperatoreDAO operatoreDAO;
	
	public SignUpController() {
		operatoreDAO = new OperatoreDAO();
	}

public String signup(String nome, String cognome, String email, String telefono, String password, String confermaPassword) {
	//Verifica che tutti i campi siano stati riempiti
    if (nome.isEmpty() || cognome.isEmpty() || email.isEmpty() || telefono.isEmpty() || password.isEmpty() || confermaPassword.isEmpty()) {
        return "Compilare tutti i campi.";
    }
	//Verifica se la password coincide
    if (!password.equals(confermaPassword)) {
        return "Le password non coincidono!";
    }

    try {
        //Crea un nuovo operatore utilizzando il metodo createOperatore
        Operatore nuovoOperatore = new Operatore(email, password, nome, cognome, telefono);
        operatoreDAO.createOperatore(nuovoOperatore);
        return "Registrazione riuscita!";
    } catch (Exception e) {
        e.printStackTrace();
        return "Si è verificato un errore durante la registrazione";
    }
}
}