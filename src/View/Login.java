package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Images/UninaIcona.png")));
		setTitle("UninaDelivery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 917, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelSX = new JPanel();
		panelSX.setBackground(new Color(0, 52, 73));
		panelSX.setBounds(0, 0, 459, 508);
		panel.add(panelSX);
		panelSX.setLayout(null);
		
		JLabel lblIconaUninaDelivery = new JLabel("");
		lblIconaUninaDelivery.setIcon(new ImageIcon(Login.class.getResource("/Images/Unina.png")));
		lblIconaUninaDelivery.setBounds(-16, 128, 411, 218);
		panelSX.add(lblIconaUninaDelivery);
		
		JPanel panelDX = new JPanel();
		panelDX.setBackground(new Color(156, 178, 192));
		panelDX.setBounds(458, 0, 459, 508);
		panel.add(panelDX);
		panelDX.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtEmail.setBackground(UIManager.getColor("Button.light"));
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				email.setText("");
			}
		});
		txtEmail.setToolTipText("");
		txtEmail.setBounds(125, 171, 220, 34);
		panelDX.add(txtEmail);
		txtEmail.setColumns(10);
		
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
		passwordField.setBounds(125, 250, 220, 34);
		panelDX.add(passwordField);
		
		JLabel IconaEmail = new JLabel("");
		IconaEmail.setIcon(new ImageIcon(Login.class.getResource("/Images/icons8-userpic-32.png")));
		IconaEmail.setBounds(83, 171, 32, 34);
		panelDX.add(IconaEmail);
		
		JLabel IconaPassword = new JLabel("");
		IconaPassword.setIcon(new ImageIcon(Login.class.getResource("/Images/icons8-password-32.png")));
		IconaPassword.setBounds(83, 250, 32, 34);
		panelDX.add(IconaPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Roboto", Font.BOLD, 14));
		lblEmail.setBounds(125, 152, 46, 14);
		panelDX.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Roboto", Font.BOLD, 14));
		lblPassword.setBounds(125, 231, 74, 14);
		panelDX.add(lblPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSignIn.setBackground(new Color(156, 178, 192));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home homeFrame = new Home();
				homeFrame.setVisible(true);
			}
		});
		btnSignIn.setBounds(70, 320, 124, 34);
		panelDX.add(btnSignIn);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        SignUp signUpFrame = new SignUp();
		        signUpFrame.setVisible(true);
		        setVisible(false);
		    }
		});
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSignUp.setBackground(new Color(156, 178, 192));
		btnSignUp.setBounds(264, 320, 124, 34);
		panelDX.add(btnSignUp);
	}
}