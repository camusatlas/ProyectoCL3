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
	private JTextField textCodigoTienda;
	private JTextField textNumeroTienda;
	private JTextField textTienda;
	private JTextField textCaja;
	private JTextField textIP;
	private JTextField textHostName;

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
		setBounds(100, 100, 695, 404);
		getContentPane().setLayout(null);
		
		JLabel lblPunto_de_Venta = new JLabel("Puntos de Ventas");
		lblPunto_de_Venta.setIcon(new ImageIcon(Punto_de_Venta.class.getResource("/iconos/Dollar.gif")));
		lblPunto_de_Venta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunto_de_Venta.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPunto_de_Venta.setBounds(10, 11, 659, 54);
		getContentPane().add(lblPunto_de_Venta);
		
		JLabel lblNewLabel = new JLabel("Código de Marca:");
		lblNewLabel.setBounds(20, 84, 123, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número Tienda:");
		lblNewLabel_1.setBounds(20, 135, 123, 28);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tienda:");
		lblNewLabel_2.setBounds(20, 174, 123, 28);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Caja:");
		lblNewLabel_3.setBounds(20, 213, 123, 28);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IP_WorkStation:");
		lblNewLabel_4.setBounds(20, 252, 123, 28);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("HostName:");
		lblNewLabel_5.setBounds(20, 291, 123, 28);
		getContentPane().add(lblNewLabel_5);
		
		textCodigoTienda = new JTextField();
		textCodigoTienda.setBounds(153, 88, 171, 20);
		getContentPane().add(textCodigoTienda);
		textCodigoTienda.setColumns(10);
		
		textNumeroTienda = new JTextField();
		textNumeroTienda.setBounds(153, 135, 171, 20);
		getContentPane().add(textNumeroTienda);
		textNumeroTienda.setColumns(10);
		
		textTienda = new JTextField();
		textTienda.setBounds(153, 178, 171, 20);
		getContentPane().add(textTienda);
		textTienda.setColumns(10);
		
		textCaja = new JTextField();
		textCaja.setBounds(153, 217, 171, 20);
		getContentPane().add(textCaja);
		textCaja.setColumns(10);
		
		textIP = new JTextField();
		textIP.setBounds(153, 256, 171, 20);
		getContentPane().add(textIP);
		textIP.setColumns(10);
		
		textHostName = new JTextField();
		textHostName.setBounds(153, 295, 171, 20);
		getContentPane().add(textHostName);
		textHostName.setColumns(10);
		
		JButton btnGenerar = new JButton("Gernerar");
		btnGenerar.setIcon(new ImageIcon(Punto_de_Venta.class.getResource("/iconos/Tick.gif")));
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGenerar.setBounds(421, 117, 150, 65);
		getContentPane().add(btnGenerar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Punto_de_Venta.class.getResource("/iconos/Delete.gif")));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCancelar.setBounds(421, 234, 150, 65);
		getContentPane().add(btnCancelar);

	}

}
