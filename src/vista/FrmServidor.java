package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.List;
import java.awt.Label;

public class FrmServidor extends JInternalFrame {
	private JTextField textNomEmpresa;
	private JTextField textCodigoTiend;
	private JTextField textNombreTienda;
	private JTextField textMarcaTienda;
	private JTextField textDepartamento;
	private JTextField textProvincia;
	private JTextField textField;
	private JTextField textRegion;
	private JTextField textIPServidor;
	private JTextField textHostname;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 786, 607);
		getContentPane().setLayout(null);
		
		JLabel lblListado_de_Servidores = new JLabel("REGISTRO SERVIDORES");
		lblListado_de_Servidores.setIcon(new ImageIcon(FrmServidor.class.getResource("/iconos/Database.gif")));
		lblListado_de_Servidores.setHorizontalAlignment(SwingConstants.CENTER);
		lblListado_de_Servidores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblListado_de_Servidores.setBounds(10, 26, 750, 48);
		getContentPane().add(lblListado_de_Servidores);
		
		JLabel lblNewLabel = new JLabel("Nombre de la Empresa:");
		lblNewLabel.setBounds(20, 97, 154, 24);
		getContentPane().add(lblNewLabel);
		
		textNomEmpresa = new JTextField();
		textNomEmpresa.setBounds(184, 99, 172, 20);
		getContentPane().add(textNomEmpresa);
		textNomEmpresa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Código de Tienda:");
		lblNewLabel_1.setBounds(20, 145, 154, 24);
		getContentPane().add(lblNewLabel_1);
		
		textCodigoTiend = new JTextField();
		textCodigoTiend.setBounds(184, 147, 172, 20);
		getContentPane().add(textCodigoTiend);
		textCodigoTiend.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Tienda:");
		lblNewLabel_2.setBounds(20, 189, 154, 24);
		getContentPane().add(lblNewLabel_2);
		
		textNombreTienda = new JTextField();
		textNombreTienda.setBounds(184, 191, 172, 20);
		getContentPane().add(textNombreTienda);
		textNombreTienda.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Marca de Tienda:");
		lblNewLabel_3.setBounds(20, 237, 154, 24);
		getContentPane().add(lblNewLabel_3);
		
		textMarcaTienda = new JTextField();
		textMarcaTienda.setBounds(184, 239, 172, 20);
		getContentPane().add(textMarcaTienda);
		textMarcaTienda.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Departamento:");
		lblNewLabel_4.setBounds(20, 285, 154, 24);
		getContentPane().add(lblNewLabel_4);
		
		textDepartamento = new JTextField();
		textDepartamento.setBounds(184, 287, 172, 20);
		getContentPane().add(textDepartamento);
		textDepartamento.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Provincia:");
		lblNewLabel_5.setBounds(20, 343, 154, 24);
		getContentPane().add(lblNewLabel_5);
		
		textProvincia = new JTextField();
		textProvincia.setBounds(184, 345, 172, 20);
		getContentPane().add(textProvincia);
		textProvincia.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Distrito:");
		lblNewLabel_6.setBounds(20, 392, 154, 24);
		getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(184, 394, 172, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Región:");
		lblNewLabel_7.setBounds(404, 97, 154, 24);
		getContentPane().add(lblNewLabel_7);
		
		textRegion = new JTextField();
		textRegion.setBounds(562, 97, 150, 24);
		getContentPane().add(textRegion);
		textRegion.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("IP_Servidor:");
		lblNewLabel_8.setBounds(404, 145, 154, 24);
		getContentPane().add(lblNewLabel_8);
		
		textIPServidor = new JTextField();
		textIPServidor.setBounds(562, 147, 150, 20);
		getContentPane().add(textIPServidor);
		textIPServidor.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("HostName:");
		lblNewLabel_9.setBounds(404, 189, 154, 24);
		getContentPane().add(lblNewLabel_9);
		
		textHostname = new JTextField();
		textHostname.setBounds(562, 191, 150, 20);
		getContentPane().add(textHostname);
		textHostname.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Estado de Tienda:");
		lblNewLabel_10.setBounds(404, 237, 154, 19);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Versión Micros");
		lblNewLabel_11.setBounds(404, 285, 154, 24);
		getContentPane().add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setBounds(562, 287, 150, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Tamaño de la BDatos:");
		lblNewLabel_12.setBounds(404, 343, 154, 19);
		getContentPane().add(lblNewLabel_12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(562, 342, 150, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Sistema Operativo:");
		lblNewLabel_13.setBounds(404, 392, 154, 19);
		getContentPane().add(lblNewLabel_13);
		
		textField_3 = new JTextField();
		textField_3.setBounds(562, 391, 150, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGenerar.setIcon(new ImageIcon(FrmServidor.class.getResource("/iconos/Tick.gif")));
		btnGenerar.setBounds(182, 464, 150, 88);
		getContentPane().add(btnGenerar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(FrmServidor.class.getResource("/iconos/Delete.gif")));
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCancelar.setBounds(460, 464, 150, 88);
		getContentPane().add(btnCancelar);

	}
}
