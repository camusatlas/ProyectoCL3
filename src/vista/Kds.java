package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Kds extends JInternalFrame {
	private JTextField textHostName;
	private JTextField textNombreTienda;
	private JTextField textMarca;
	private JTextField textEmpresaTienda;
	private JTextField textNumeroTienda;
	private JTextField textIpkds;
	private JTextField textEstado;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kds frame = new Kds();
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
	public Kds() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setFrameIcon(new ImageIcon(Kds.class.getResource("/iconos/Bubble.gif")));
		setTitle("KDS");
		setBounds(100, 100, 822, 554);
		getContentPane().setLayout(null);
		
		JLabel lblkds = new JLabel("REGISTRO DE KDS");
		lblkds.setIcon(new ImageIcon(Kds.class.getResource("/iconos/Bubble.gif")));
		lblkds.setHorizontalAlignment(SwingConstants.CENTER);
		lblkds.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblkds.setBounds(10, 11, 786, 35);
		getContentPane().add(lblkds);
		
		JLabel lblHostName = new JLabel("HostName:");
		lblHostName.setBounds(31, 74, 135, 25);
		getContentPane().add(lblHostName);
		
		textHostName = new JTextField();
		textHostName.setBounds(216, 76, 163, 20);
		getContentPane().add(textHostName);
		textHostName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre de Tienda:");
		lblNewLabel.setBounds(31, 130, 135, 25);
		getContentPane().add(lblNewLabel);
		
		textNombreTienda = new JTextField();
		textNombreTienda.setBounds(216, 132, 163, 20);
		getContentPane().add(textNombreTienda);
		textNombreTienda.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca de la Tienda:");
		lblMarca.setBounds(31, 187, 135, 25);
		getContentPane().add(lblMarca);
		
		textMarca = new JTextField();
		textMarca.setBounds(216, 189, 163, 20);
		getContentPane().add(textMarca);
		textMarca.setColumns(10);
		
		JLabel lblEmpresa_Tienda = new JLabel("Empresa de la Tienda:");
		lblEmpresa_Tienda.setBounds(31, 249, 135, 25);
		getContentPane().add(lblEmpresa_Tienda);
		
		textEmpresaTienda = new JTextField();
		textEmpresaTienda.setBounds(216, 251, 163, 20);
		getContentPane().add(textEmpresaTienda);
		textEmpresaTienda.setColumns(10);
		
		JLabel lblNumeroTienda = new JLabel("Número de Tienda:");
		lblNumeroTienda.setBounds(440, 74, 128, 25);
		getContentPane().add(lblNumeroTienda);
		
		textNumeroTienda = new JTextField();
		textNumeroTienda.setBounds(578, 76, 158, 20);
		getContentPane().add(textNumeroTienda);
		textNumeroTienda.setColumns(10);
		
		JLabel lblIpKds = new JLabel("IP KDS:");
		lblIpKds.setBounds(440, 133, 128, 19);
		getContentPane().add(lblIpKds);
		
		textIpkds = new JTextField();
		textIpkds.setBounds(578, 132, 158, 20);
		getContentPane().add(textIpkds);
		textIpkds.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(440, 190, 128, 19);
		getContentPane().add(lblEstado);
		
		textEstado = new JTextField();
		textEstado.setBounds(578, 189, 158, 20);
		getContentPane().add(textEstado);
		textEstado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setBounds(440, 249, 128, 25);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(578, 251, 158, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setIcon(new ImageIcon(Kds.class.getResource("/iconos/Tick.gif")));
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnGenerar.setBounds(141, 357, 188, 96);
		getContentPane().add(btnGenerar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Kds.class.getResource("/iconos/Delete.gif")));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnCancelar.setBounds(440, 357, 188, 96);
		getContentPane().add(btnCancelar);

	}
}
