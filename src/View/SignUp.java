package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.Login.SignUpController;
import java.awt.Toolkit;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtCognome;
	private JTextField txtEmail;
	private JTextField txtCellulare;
	private JLabel lblErrore;
	private SignUpController signUpController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/Images/UninaIcona.png")));
		setTitle("UninaDelivery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 547);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 917, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 52, 73));
		panel_1.setBounds(0, 0, 459, 508);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Images/Unina.png")));
		lblNewLabel_2.setBounds(-16, 128, 411, 218);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(156, 178, 192));
		panel_2.setBounds(458, 0, 459, 508);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtNome.setBackground(UIManager.getColor("Button.light"));
		txtNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				email.setText("");
			}
		});
		txtNome.setToolTipText("");
		txtNome.setBounds(33, 54, 180, 34);
		panel_2.add(txtNome);
		txtNome.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto", Font.PLAIN, 12));
		passwordField.setBackground(UIManager.getColor("Button.light"));
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				password.setText("");
			}
		});
		passwordField.setToolTipText("");
		passwordField.setBounds(119, 267, 220, 34);
		panel_2.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		passwordField_1.setBackground(UIManager.getColor("Button.light"));
		passwordField_1.setBounds(119, 342, 220, 34);
		panel_2.add(passwordField_1);
		
		txtCognome = new JTextField();
		txtCognome.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtCognome.setBackground(UIManager.getColor("Button.light"));
		txtCognome.setBounds(246, 54, 180, 34);
		panel_2.add(txtCognome);
		txtCognome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtEmail.setBackground(UIManager.getColor("Button.light"));
		txtEmail.setBounds(119, 122, 220, 34);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtCellulare = new JTextField();
		txtCellulare.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtCellulare.setBackground(UIManager.getColor("Button.light"));
		txtCellulare.setBounds(119, 194, 220, 34);
		panel_2.add(txtCellulare);
		txtCellulare.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 37, 46, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setFont(new Font("Roboto", Font.BOLD, 14));
		lblCognome.setBounds(250, 37, 89, 14);
		panel_2.add(lblCognome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Roboto", Font.BOLD, 14));
		lblEmail.setBounds(120, 104, 46, 14);
		panel_2.add(lblEmail);
		
		JLabel lblCellulare = new JLabel("Cellulare");
		lblCellulare.setForeground(Color.WHITE);
		lblCellulare.setFont(new Font("Roboto", Font.BOLD, 14));
		lblCellulare.setBounds(120, 176, 79, 14);
		panel_2.add(lblCellulare);
		
		JLabel lblPasswoord = new JLabel("Password");
		lblPasswoord.setForeground(Color.WHITE);
		lblPasswoord.setFont(new Font("Roboto", Font.BOLD, 14));
		lblPasswoord.setBounds(120, 249, 79, 14);
		panel_2.add(lblPasswoord);
		
		JLabel lblConfermaPassword = new JLabel("Conferma password");
		lblConfermaPassword.setForeground(Color.WHITE);
		lblConfermaPassword.setFont(new Font("Roboto", Font.BOLD, 14));
		lblConfermaPassword.setBounds(120, 325, 146, 14);
		panel_2.add(lblConfermaPassword);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String nome = txtNome.getText();
	            String cognome = txtCognome.getText();
	            String email = txtEmail.getText();
	            String telefono = txtCellulare.getText();
	            String password = new String(passwordField.getPassword());
	            String confermaPassword = new String(passwordField_1.getPassword());

	            if (nome.isEmpty() || cognome.isEmpty() || email.isEmpty() || telefono.isEmpty() || password.isEmpty() || confermaPassword.isEmpty()) {
	                lblErrore.setText("Compilare tutti i campi.");
	            } else {
	                String messaggio = signUpController.signup(nome, cognome, email, telefono, password, confermaPassword);

	                lblErrore.setText(messaggio);
	            }
	        }
	    });
		btnNewButton.setBackground(new Color(156, 178, 192));
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(167, 431, 124, 35);
		panel_2.add(btnNewButton);
		
		JLabel lblErrore = new JLabel("");
		lblErrore.setBackground(new Color(156, 178, 192));
		lblErrore.setForeground(new Color(225, 6, 6));
		lblErrore.setFont(new Font("Roboto", Font.ITALIC, 12));
		lblErrore.setBounds(90, 399, 278, 21);
		panel_2.add(lblErrore);
		
		// Calcola il centro dello schermo
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - getWidth()) / 2;
        int centerY = (screenSize.height - getHeight()) / 2;

        // Setta la posizione della finestra
        setLocation(centerX, centerY);
	
	}
}

