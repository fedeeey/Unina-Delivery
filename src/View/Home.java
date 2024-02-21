package View;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel selectedPanel; 		//Pannello selezionato

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Home() {
    	setSize(new Dimension(970, 634));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/Images/UninaIcona.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setTitle("Home");

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(0, 52, 73));
        mainPanel.setLayout(new MigLayout("fill, insets 0", "[419.00][468.00,grow]", "[51.00][540.00,grow]"));

        getContentPane().add(mainPanel);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setDragMode(1);
        desktopPane.setBackground(new Color(156, 178, 192));
        mainPanel.add(desktopPane, "cell 1 1,grow");
        desktopPane.setLayout(new BorderLayout(0, 0));
        
        JPanel MenuBar = new JPanel();
        MenuBar.setBackground(new Color(0, 52, 73));
        mainPanel.add(MenuBar, "cell 1 0,shrinkx 0,grow");
        MenuBar.setLayout(new MigLayout("", "[][][][][][][][][101.00,grow]", "[45.00]"));
        
        JButton btnLogout = new JButton("Logout");
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFont(new Font("Roboto", Font.BOLD, 12));
        btnLogout.setBackground(new Color(0, 52, 73));
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
            }
        });
        
        JLabel lblBenvenutoUtente = new JLabel("Benvenuto,");
        lblBenvenutoUtente.setForeground(new Color(255, 255, 255));
        lblBenvenutoUtente.setFont(new Font("Roboto", Font.BOLD, 12));
        lblBenvenutoUtente.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-utente-uomo-cerchiato-24.png")));
        MenuBar.add(lblBenvenutoUtente, "cell 0 0");
        MenuBar.add(btnLogout, "cell 8 0,alignx right,growy");
        
        JPanel SideBar = new JPanel();
        SideBar.setBackground(new Color(0, 52, 73));
        mainPanel.add(SideBar, "cell 0 0 1 2,grow");
        SideBar.setLayout(new MigLayout("", "[323.00,grow,center]", "[90.00][50.00][50.00][50.00][50.00][50.00]"));
        
        JLabel lblLogoUnina = new JLabel("");
        lblLogoUnina.setIcon(new ImageIcon(Home.class.getResource("/Images/UninaHome.png")));
        SideBar.add(lblLogoUnina, "cell 0 0,alignx center,aligny center");
        
        JPanel ViewOrdini = new JPanel();
        ViewOrdini.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VisualizzaOrdini visualizzaOrdiniFrame = new VisualizzaOrdini();
                desktopPane.add(visualizzaOrdiniFrame); // Aggiungi l'internal frame al desktop pane
                visualizzaOrdiniFrame.setVisible(true); // Rendi visibile l'internal frame
            }
        });
        ViewOrdini.setBackground(new Color(0, 52, 73));
        SideBar.add(ViewOrdini, "cell 0 1,grow");
        ViewOrdini.setLayout(null);
        
        JLabel lblVisualizzaOrdini = new JLabel("Visualizza ordini");
        lblVisualizzaOrdini.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-menu-30.png")));
        lblVisualizzaOrdini.setForeground(new Color(255, 255, 255));
        lblVisualizzaOrdini.setFont(new Font("Roboto", Font.BOLD, 16));
        lblVisualizzaOrdini.setBounds(10, 0, 234, 50);
        ViewOrdini.add(lblVisualizzaOrdini);
        
        JPanel CreateSped = new JPanel();
        CreateSped.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		CreaSpedizione createSped = new CreaSpedizione();
        		desktopPane.removeAll();
        		desktopPane.add(createSped).setVisible(true);
        	}
        });
        CreateSped.setBackground(new Color(0, 52, 73));
        SideBar.add(CreateSped, "cell 0 2,grow");
        CreateSped.setLayout(null);
        
        JLabel lblCreaSpedizione = new JLabel("Crea spedizione");
        lblCreaSpedizione.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-menu-30.png")));
        lblCreaSpedizione.setForeground(Color.WHITE);
        lblCreaSpedizione.setFont(new Font("Roboto", Font.BOLD, 16));
        lblCreaSpedizione.setBounds(10, 0, 234, 50);
        CreateSped.add(lblCreaSpedizione);
        
        JPanel ProgSped = new JPanel();
        ProgSped.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ProgrammaSpedizione progSped = new ProgrammaSpedizione();
        		desktopPane.removeAll();
        		desktopPane.add(progSped).setVisible(true);
        	}
        });
        ProgSped.setBackground(new Color(0, 52, 73));
        SideBar.add(ProgSped, "cell 0 3,grow");
        ProgSped.setLayout(null);
        
        JLabel lblProgrammaSpedizione = new JLabel("Programma spedizione");
        lblProgrammaSpedizione.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-menu-30.png")));
        lblProgrammaSpedizione.setForeground(Color.WHITE);
        lblProgrammaSpedizione.setFont(new Font("Roboto", Font.BOLD, 16));
        lblProgrammaSpedizione.setBounds(10, 0, 234, 50);
        ProgSped.add(lblProgrammaSpedizione);
        
        JPanel ViewSpedProg = new JPanel();
        ViewSpedProg.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		VisualizzaSpedizioniProgrammate viewProgSped = new VisualizzaSpedizioniProgrammate();
        		desktopPane.removeAll();
        		desktopPane.add(viewProgSped).setVisible(true);
        	}
        });
        ViewSpedProg.setBackground(new Color(0, 52, 73));
        SideBar.add(ViewSpedProg, "cell 0 4,grow");
        ViewSpedProg.setLayout(null);
        
        JLabel lblVisualizzaSpedizioniProgrammate = new JLabel("Visualizza spedizioni programmate");
        lblVisualizzaSpedizioniProgrammate.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-menu-30.png")));
        lblVisualizzaSpedizioniProgrammate.setForeground(Color.WHITE);
        lblVisualizzaSpedizioniProgrammate.setFont(new Font("Roboto", Font.BOLD, 16));
        lblVisualizzaSpedizioniProgrammate.setBounds(10, 0, 308, 50);
        ViewSpedProg.add(lblVisualizzaSpedizioniProgrammate);
        
        JPanel ViewStats = new JPanel();
        ViewStats.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
            		Statistiche viewStats = new Statistiche();
            		desktopPane.removeAll();
            		desktopPane.add(viewStats).setVisible(true);
        	}
        });
        ViewStats.setBackground(new Color(0, 52, 73));
        SideBar.add(ViewStats, "cell 0 5,grow");
        ViewStats.setLayout(null);
        
        JLabel lblStatistiche = new JLabel("Statistiche");
        lblStatistiche.setIcon(new ImageIcon(Home.class.getResource("/Images/icons8-menu-30.png")));
        lblStatistiche.setForeground(Color.WHITE);
        lblStatistiche.setFont(new Font("Roboto", Font.BOLD, 16));
        lblStatistiche.setBounds(10, 0, 234, 50);
        ViewStats.add(lblStatistiche);
        
        //MouseListener usato per modificare il colore quando selezioniamo nel menu
        addMouseListenerToComponent(lblVisualizzaOrdini, ViewOrdini);
        addMouseListenerToComponent(lblCreaSpedizione, CreateSped);
        addMouseListenerToComponent(lblProgrammaSpedizione, ProgSped);
        addMouseListenerToComponent(lblVisualizzaSpedizioniProgrammate, ViewSpedProg);
        addMouseListenerToComponent(lblStatistiche, ViewStats);
    }
    
    //Metodo per aggiungere il MouseListener a un component
    private void addMouseListenerToComponent(Component component, JPanel panel) {
        component.addMouseListener(new MouseAdapter() {
        @Override
            public void mousePressed(MouseEvent e) {
                if (selectedPanel != null) {
                    selectedPanel.setBackground(new Color(0, 52, 73));
                }
                panel.setBackground(new Color(0, 92, 133));
                selectedPanel = panel;
            }
        });
    }
}