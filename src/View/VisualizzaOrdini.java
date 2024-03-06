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
import com.toedter.calendar.JDateChooser;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JScrollPane;


public class VisualizzaOrdini extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
    private JDateChooser startDateChooser;
    private JDateChooser endDateChooser;
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
		setBounds(100, 100, 695, 631);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(156, 178, 192));
		getContentPane().add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[474.00,grow,fill]", "[88.00][][grow]"));
		
		JPanel MainBar = new JPanel();
		MainBar.setBackground(new Color(156, 178, 192));
		panel.add(MainBar, "cell 0 0,grow");
		MainBar.setLayout(new MigLayout("", "[221.00][82.00][41.00][][][189.00][]", "[grow][11.00,grow][]"));
		
		JTextArea txtrVisualizzaOrdini = new JTextArea();
		txtrVisualizzaOrdini.setEditable(false);
		txtrVisualizzaOrdini.setForeground(new Color(0, 52, 73));
		txtrVisualizzaOrdini.setBackground(new Color(156, 178, 192));
		txtrVisualizzaOrdini.setText("Lista Ordini");
		txtrVisualizzaOrdini.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		MainBar.add(txtrVisualizzaOrdini, "cell 0 0,grow");
		
		JTextArea txtrInizio = new JTextArea();
		txtrInizio.setEditable(false);
		txtrInizio.setForeground(new Color(255, 255, 255));
		txtrInizio.setFont(new Font("Roboto", Font.BOLD, 14));
		txtrInizio.setText("Filtra per periodo");
		txtrInizio.setBackground(new Color(156, 178, 192));
		MainBar.add(txtrInizio, "cell 0 1,grow");
		
		startDateChooser = new JDateChooser(); // Crea un JDateChooser per la data di inizio
		startDateChooser.getCalendarButton().setIcon(new ImageIcon(VisualizzaOrdini.class.getResource("/Images/icons8-calendario-15.png")));
        MainBar.add(startDateChooser, "cell 0 2,growx");
        
        JTextArea txtrA = new JTextArea();
        txtrA.setEditable(false);
        txtrA.setForeground(new Color(255, 255, 255));
		txtrA.setFont(new Font("Roboto", Font.BOLD, 14));
		txtrA.setText("a");
		txtrA.setBackground(new Color(156, 178, 192));
		MainBar.add(txtrA, "cell 0 2,alignx center,aligny center");
        
        endDateChooser = new JDateChooser();
        endDateChooser.getCalendarButton().setIcon(new ImageIcon(VisualizzaOrdini.class.getResource("/Images/icons8-calendario-15.png")));
        MainBar.add(endDateChooser, "cell 0 2,growx");
		
		JTextArea txtrFiltraPerEmail = new JTextArea();
		txtrFiltraPerEmail.setEditable(false);
		txtrFiltraPerEmail.setText("Filtra per email");
		txtrFiltraPerEmail.setBackground(new Color(156, 178, 192));
		txtrFiltraPerEmail.setForeground(new Color(255, 255, 255));
		txtrFiltraPerEmail.setFont(new Font("Roboto", Font.BOLD, 14));
		MainBar.add(txtrFiltraPerEmail, "cell 5 1,grow");
		
		FilterByEmail = new JTextField();
		MainBar.add(FilterByEmail, "cell 5 2,growx");
		FilterByEmail.setColumns(10);
		
		JButton btnFiltra = new JButton("");
		btnFiltra.setIcon(new ImageIcon(VisualizzaOrdini.class.getResource("/Images/icons8-ricerca-24.png")));
		btnFiltra.setBackground(new Color(0, 52, 73));
		MainBar.add(btnFiltra, "cell 6 2");
		
		JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane, "cell 0 1,grow");


        table = new JTable();
        scrollPane.setViewportView(table);
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

		InternalFrameUI ifu = this.getUI();
        ((BasicInternalFrameUI)ifu).setNorthPane(null);
        this.setBorder(null);

	}

}
