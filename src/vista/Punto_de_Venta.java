package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Punto_de_Venta extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Punto_de_Venta frame = new Punto_de_Venta();
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
	public Punto_de_Venta() {
		setFrameIcon(new ImageIcon(Punto_de_Venta.class.getResource("/iconos/Dollar.gif")));
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Puntos de Ventas");
		setBounds(100, 100, 944, 592);
		getContentPane().setLayout(null);
		
		JLabel lblPunto_de_Venta = new JLabel("Puntos de Ventas");
		lblPunto_de_Venta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunto_de_Venta.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPunto_de_Venta.setBounds(10, 11, 908, 54);
		getContentPane().add(lblPunto_de_Venta);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblBuscar.setBounds(34, 105, 106, 39);
		getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(150, 105, 314, 35);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setIcon(new ImageIcon(Punto_de_Venta.class.getResource("/iconos/Search.gif")));
		btnBuscar.setBounds(539, 105, 138, 54);
		getContentPane().add(btnBuscar);

	}

}
