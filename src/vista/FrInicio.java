package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.consulta.simple.ConsultaKds;
import gui.consulta.simple.ConsultaPCGerencial;
import gui.consulta.simple.ConsultaServidor;
import gui.consulta.simple.ConsultaWorckStation;

import java.awt.Frame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class FrInicio extends JFrame implements ActionListener {
	private JMenuItem mntmServidoresR;
	private JMenuItem mntmPunto_de_VentaR;
	private JMenuItem mntmKDSR;
	private JMenuItem mntmPCGerencialesR;

	
	//Paso N°1
	private FrmServidor frmServidor = new FrmServidor();
	private Punto_de_Venta Punto_de_Venta = new Punto_de_Venta();
	private Kds Kds = new Kds();
	
	//// Paso1 Consultar ////
	private ConsultaServidor ConsultaServidor = new ConsultaServidor();
	private ConsultaWorckStation ConsultaWorckStation = new ConsultaWorckStation();
	private ConsultaKds ConsultaKds = new ConsultaKds();
	private ConsultaPCGerencial ConsultaPCGerencial = new ConsultaPCGerencial();
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrInicio.class.getResource("/iconos/Microsoft.gif")));
		setTitle("Tiendas Delosi");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 594);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		mnRegistrar.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Lists.gif")));
		menuBar.add(mnRegistrar);
		
		mntmServidoresR = new JMenuItem("Servidores");
		mntmServidoresR.addActionListener(this);
		mntmServidoresR.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Database.gif")));
		mnRegistrar.add(mntmServidoresR);
		
		mntmPunto_de_VentaR = new JMenuItem("WorckStation");
		mntmPunto_de_VentaR.addActionListener(this);
		mntmPunto_de_VentaR.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Dollar.gif")));
		mnRegistrar.add(mntmPunto_de_VentaR);
		
		mntmKDSR = new JMenuItem("KDS");
		mntmKDSR.addActionListener(this);
		mntmKDSR.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Bubble.gif")));
		mnRegistrar.add(mntmKDSR);
		
		mntmPCGerencialesR = new JMenuItem("PCGerenciales");
		mntmPCGerencialesR.addActionListener(this);
		mntmPCGerencialesR.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Computer.gif")));
		mnRegistrar.add(mntmPCGerencialesR);
		
		JMenu mnConsultar = new JMenu("Consultar");
		mnConsultar.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Closed folder.gif")));
		menuBar.add(mnConsultar);
		
		JMenuItem mntmServidorC = new JMenuItem("Consulta Servidor");
		mntmServidorC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaServidor.setVisible(true);
			}
		});
		mntmServidorC.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Database.gif")));
		mnConsultar.add(mntmServidorC);
		
		JMenuItem mntmWordStationC = new JMenuItem("Consulta WorckStation");
		mntmWordStationC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaWorckStation.setVisible(true);
			}
		});
		mntmWordStationC.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Dollar.gif")));
		mnConsultar.add(mntmWordStationC);
		
		JMenuItem mntmKdsC = new JMenuItem("Consulta KDS");
		mntmKdsC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaKds.setVisible(true);
			}
		});
		mntmKdsC.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Bubble.gif")));
		mnConsultar.add(mntmKdsC);
		
		JMenuItem mntmPCGerencialC = new JMenuItem("Consulta PCGerecial");
		mntmPCGerencialC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaPCGerencial.setVisible(true);
			}
		});
		mntmPCGerencialC.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Computer.gif")));
		mnConsultar.add(mntmPCGerencialC);
		
		JMenu mnNewMenu_2 = new JMenu("Mantenimiento");
		mnNewMenu_2.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Open file.gif")));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmServidorM = new JMenuItem("Servidor");
		mntmServidorM.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Database.gif")));
		mnNewMenu_2.add(mntmServidorM);
		
		JMenuItem mntmWorckStationM = new JMenuItem("WorckStation");
		mntmWorckStationM.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Dollar.gif")));
		mnNewMenu_2.add(mntmWorckStationM);
		
		JMenuItem mntmKdsM = new JMenuItem("KDS");
		mntmKdsM.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Bubble.gif")));
		mnNewMenu_2.add(mntmKdsM);
		
		JMenuItem mntmPCGerencialM = new JMenuItem("PCGerencial");
		mntmPCGerencialM.setIcon(new ImageIcon(FrInicio.class.getResource("/iconos/Computer.gif")));
		mnNewMenu_2.add(mntmPCGerencialM);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		contentPane.add(desktopPane_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		desktopPane.add(Punto_de_Venta);
		frmServidor.setBounds(61, 0, 786, 607);
		//Punto_de_Venta.getContentPane().add(frmServidor);
		desktopPane.add(Kds);
		desktopPane.add(frmServidor);
		
		//Paso 2 consulta
		desktopPane.add(ConsultaServidor);
		desktopPane.add(ConsultaWorckStation);
		desktopPane.add(ConsultaKds);
		desktopPane.add(ConsultaPCGerencial);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmPCGerencialesR) {
			actionPerformedMntmPCGerencialesJMenuItem(e);
		}
		if (e.getSource() == mntmKDSR) {
			actionPerformedMntmKDSJMenuItem(e);
		}
		if (e.getSource() == mntmPunto_de_VentaR) {
			actionPerformedMntmPunto_de_VentaJMenuItem(e);
		}
		if (e.getSource() == mntmServidoresR) {
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
		Kds.setVisible(true);
	}
	protected void actionPerformedMntmPCGerencialesJMenuItem(ActionEvent e) {
		
	}
}
