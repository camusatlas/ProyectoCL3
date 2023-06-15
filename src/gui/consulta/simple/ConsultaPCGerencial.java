package gui.consulta.simple;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class ConsultaPCGerencial extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaPCGerencial frame = new ConsultaPCGerencial();
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
	public ConsultaPCGerencial() {
		setTitle("Consulta PCGerencial");
		setFrameIcon(new ImageIcon(ConsultaPCGerencial.class.getResource("/iconos/Computer.gif")));
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 933, 614);

	}

}
