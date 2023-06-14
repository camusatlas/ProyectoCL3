package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmServidor extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmServidor frame = new FrmServidor();
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
	public FrmServidor() {
		setFont(new Font("Dialog", Font.PLAIN, 14));
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Servidores");
		setFrameIcon(new ImageIcon(FrmServidor.class.getResource("/iconos/Database.gif")));
		setBounds(100, 100, 1025, 607);
		getContentPane().setLayout(null);
		
		JLabel lblListado_de_Servidores = new JLabel("Listado de Servidores");
		lblListado_de_Servidores.setHorizontalAlignment(SwingConstants.CENTER);
		lblListado_de_Servidores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblListado_de_Servidores.setBounds(10, 26, 989, 48);
		getContentPane().add(lblListado_de_Servidores);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBuscar.setBounds(26, 107, 102, 35);
		getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(104, 104, 344, 45);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(FrmServidor.class.getResource("/iconos/Search.gif")));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBuscar.setBounds(555, 101, 157, 48);
		getContentPane().add(btnBuscar);

	}
}
