package gui.consulta.simple;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class ConsultaServidor extends JInternalFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaServidor frame = new ConsultaServidor();
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
	public ConsultaServidor() {
		setFrameIcon(new ImageIcon(ConsultaServidor.class.getResource("/iconos/Database.gif")));
		setTitle("Consulta Serviodres");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 759, 576);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Servidores");
		lblNewLabel.setIcon(new ImageIcon(ConsultaServidor.class.getResource("/iconos/Database.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(10, 11, 723, 61);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HostName:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 89, 100, 32);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(130, 92, 413, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 723, 364);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre_Empresa", "C\u00F3digo_Tienda", "Nombre_Tienda", "Marca_Tienda", "Departamento", "Provincia", "Distrito", "Regi\u00F3n", "IP_Servidor", "HostName", "Estado_Tienda", "Version Micros", "Tama\u00F1oBD", "Sistema Operativo"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(97);
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setPreferredWidth(87);
		table.getColumnModel().getColumn(3).setPreferredWidth(79);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(54);
		table.getColumnModel().getColumn(6).setPreferredWidth(44);
		table.getColumnModel().getColumn(7).setPreferredWidth(47);
		table.getColumnModel().getColumn(9).setPreferredWidth(63);
		table.getColumnModel().getColumn(10).setPreferredWidth(83);
		table.getColumnModel().getColumn(11).setPreferredWidth(82);
		table.getColumnModel().getColumn(12).setPreferredWidth(67);
		table.getColumnModel().getColumn(13).setPreferredWidth(101);
		scrollPane.setViewportView(table);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(ConsultaServidor.class.getResource("/iconos/Zoom.gif")));
		btnFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFiltrar.setBounds(588, 83, 113, 54);
		getContentPane().add(btnFiltrar);

	}

}
