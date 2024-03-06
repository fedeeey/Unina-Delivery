package Controller.Login;

import Model.DAO.OperatoreDAO;
import Model.Entities.Operatore;

public class LoginController {
    private OperatoreDAO operatoreDAO;

    public LoginController() {
        operatoreDAO = new OperatoreDAO();
    }

    public boolean authenticate(String email, String password) {
        Operatore operatore = operatoreDAO.getOperatoreByEmail(email);

        // Controlla se l'operatore esiste e se la password corrisponde
        if (operatore != null && operatore.getPassword().equals(password)) {
            return true; // L'autenticazione è riuscita
        } else {
            return false; // L'autenticazione ha fallito
        }
    }
}