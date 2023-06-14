package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class FrInicio extends JFrame implements ActionListener {
	private JMenuItem mntmServidores;
	private JMenuItem mntmPunto_de_Venta;
	private JMenuItem mntmKDS;
	private JMenuItem mntmPCGerenciales;

	
	//Paso N°1
	private FrmServidor frmServidor = new FrmServidor();
	private Punto_de_Venta Punto_de_Venta = new Punto_de_Venta();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrInicio frame = new FrInicio();
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
	public FrInicio() {
		setTitle("Tiendas Delosi");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 594);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnListado = new JMenu("Listado");
		mnListado.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Lists.gif")));
		menuBar.add(mnListado);
		
		mntmServidores = new JMenuItem("Servidores");
		mntmServidores.addActionListener(this);
		mntmServidores.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Database.gif")));
		mnListado.add(mntmServidores);
		
		mntmPunto_de_Venta = new JMenuItem("Punto de Ventas");
		mntmPunto_de_Venta.addActionListener(this);
		mntmPunto_de_Venta.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Dollar.gif")));
		mnListado.add(mntmPunto_de_Venta);
		
		mntmKDS = new JMenuItem("KDS");
		mntmKDS.addActionListener(this);
		mntmKDS.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Bubble.gif")));
		mnListado.add(mntmKDS);
		
		mntmPCGerenciales = new JMenuItem("PCGerenciales");
		mntmPCGerenciales.addActionListener(this);
		mntmPCGerenciales.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Computer.gif")));
		mnListado.add(mntmPCGerenciales);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		contentPane.add(desktopPane_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		
		//Paso N°2
		desktopPane.add(frmServidor);
		desktopPane.add(Punto_de_Venta);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmPCGerenciales) {
			actionPerformedMntmPCGerencialesJMenuItem(e);
		}
		if (e.getSource() == mntmKDS) {
			actionPerformedMntmKDSJMenuItem(e);
		}
		if (e.getSource() == mntmPunto_de_Venta) {
			actionPerformedMntmPunto_de_VentaJMenuItem(e);
		}
		if (e.getSource() == mntmServidores) {
			actionPerformedMntmServidoresJMenuItem(e);
		}
	}
	protected void actionPerformedMntmServidoresJMenuItem(ActionEvent e) {
		frmServidor.setVisible(true);
	}
	protected void actionPerformedMntmPunto_de_VentaJMenuItem(ActionEvent e) {
		Punto_de_Venta.setVisible(true);
	}
	protected void actionPerformedMntmKDSJMenuItem(ActionEvent e) {
		
	}
	protected void actionPerformedMntmPCGerencialesJMenuItem(ActionEvent e) {
		
	}
}
