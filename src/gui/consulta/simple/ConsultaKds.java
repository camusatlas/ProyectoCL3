package gui.consulta.simple;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ConsultaKds extends JInternalFrame {
	private JTextField textHostName;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaKds frame = new ConsultaKds();
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
	public ConsultaKds() {
		setFrameIcon(new ImageIcon(ConsultaKds.class.getResource("/iconos/Bubble.gif")));
		setTitle("Consulta KDS");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 856, 584);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta KDS");
		lblNewLabel.setIcon(new ImageIcon(ConsultaKds.class.getResource("/iconos/Bubble.gif")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 24, 820, 52);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HostName:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 103, 120, 33);
		getContentPane().add(lblNewLabel_1);
		
		textHostName = new JTextField();
		textHostName.setBounds(171, 103, 356, 33);
		getContentPane().add(textHostName);
		textHostName.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 820, 336);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"HostName", "Nombre Tienda", "Marca Tienda", "Empres_Tienda", "N\u00FAmero_Tienda", "IP_KDS", "Estado", "Modelo"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(89);
		table.getColumnModel().getColumn(4).setPreferredWidth(93);
		table.getColumnModel().getColumn(7).setPreferredWidth(54);
		scrollPane.setViewportView(table);
		
		JButton btnFiltrar = new JButton("Filtarar");
		btnFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFiltrar.setIcon(new ImageIcon(ConsultaKds.class.getResource("/iconos/Zoom.gif")));
		btnFiltrar.setBounds(634, 99, 131, 65);
		getContentPane().add(btnFiltrar);

	}
}
