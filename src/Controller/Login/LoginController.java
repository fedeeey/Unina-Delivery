package Controller.Login;

import Model.DAO.OperatoreDAO;
import Model.Entities.Operatore;

public class LoginController {
	private OperatoreDAO operatoreDAO;

	public LoginController() {
	  operatoreDAO = new OperatoreDAO();
	    }

	public boolean login(String email, String password) {
		Operatore operatore = operatoreDAO.getOperatoreByEmail(email);

	       if (operatore != null && operatore.getPassword().equals(password)) {
	           return true;
	       } else {
	            return false;
	       }
	}
}

