package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class VisualizzaOrdini extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField DataRange;
	private JTextField FilterByEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizzaOrdini frame = new VisualizzaOrdini();
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
	public VisualizzaOrdini() {
		setBounds(100, 100, 580, 631);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(156, 178, 192));
		getContentPane().add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[474.00,grow,fill]", "[88.00][][grow]"));
		
		JPanel MainBar = new JPanel();
		MainBar.setBackground(new Color(156, 178, 192));
		panel.add(MainBar, "cell 0 0,grow");
		MainBar.setLayout(new MigLayout("", "[172.00][][62.00][189.00][]", "[grow][grow][]"));
		
		JTextArea txtrVisualizzaOrdini = new JTextArea();
		txtrVisualizzaOrdini.setEditable(false);
		txtrVisualizzaOrdini.setForeground(new Color(0, 52, 73));
		txtrVisualizzaOrdini.setBackground(new Color(156, 178, 192));
		txtrVisualizzaOrdini.setText("Visualizza Ordini");
		txtrVisualizzaOrdini.setFont(new Font("Scary Halloween Font", Font.BOLD, 24));
		MainBar.add(txtrVisualizzaOrdini, "cell 0 0,grow");
		
		JTextArea txtrFiltraPerPeriodo = new JTextArea();
		txtrFiltraPerPeriodo.setEditable(false);
		txtrFiltraPerPeriodo.setForeground(new Color(255, 255, 255));
		txtrFiltraPerPeriodo.setFont(new Font("Roboto", Font.BOLD, 14));
		txtrFiltraPerPeriodo.setText("Filtra per periodo");
		txtrFiltraPerPeriodo.setBackground(new Color(156, 178, 192));
		MainBar.add(txtrFiltraPerPeriodo, "cell 0 1,grow");
		
		JTextArea txtrFiltraPerEmail = new JTextArea();
		txtrFiltraPerEmail.setEditable(false);
		txtrFiltraPerEmail.setText("Filtra per email");
		txtrFiltraPerEmail.setBackground(new Color(156, 178, 192));
		txtrFiltraPerEmail.setForeground(new Color(255, 255, 255));
		txtrFiltraPerEmail.setFont(new Font("Roboto", Font.BOLD, 14));
		MainBar.add(txtrFiltraPerEmail, "cell 3 1,grow");
		
		DataRange = new JTextField();
		MainBar.add(DataRange, "cell 0 2,growx");
		DataRange.setColumns(10);
		
		FilterByEmail = new JTextField();
		MainBar.add(FilterByEmail, "cell 3 2,growx");
		FilterByEmail.setColumns(10);
		
		JButton btnFiltra = new JButton("");
		btnFiltra.setIcon(new ImageIcon(VisualizzaOrdini.class.getResource("/Images/icons8-ricerca-24.png")));
		btnFiltra.setBackground(new Color(0, 52, 73));
		MainBar.add(btnFiltra, "cell 4 2");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Email", "Nome", "Cognome", "Id Ordine", "Data Ordine"
			}
		));
		table.setFont(new Font("Roboto", Font.PLAIN, 12));
		table.setBackground(new Color(185, 200, 210));
		table.setBorder(null);
		panel.add(table, "cell 0 1 1 2,grow");

	}

}
