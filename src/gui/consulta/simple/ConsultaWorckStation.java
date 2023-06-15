package gui.consulta.simple;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class ConsultaWorckStation extends JInternalFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaWorckStation frame = new ConsultaWorckStation();
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
	public ConsultaWorckStation() {
		setFrameIcon(new ImageIcon(ConsultaWorckStation.class.getResource("/iconos/Dollar.gif")));
		setTitle("Consulta WorckStation");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 858, 583);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta de WorclStation");
		lblNewLabel.setIcon(new ImageIcon(ConsultaWorckStation.class.getResource("/iconos/Dollar.gif")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setBounds(10, 26, 822, 59);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HostNAme:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 105, 112, 33);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(142, 108, 398, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 205, 822, 337);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cod_Marca", "N\u00FAmero de Tienda", "Tienda", "Caja", "IP_WorckStation", "HostName"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(96);
		scrollPane.setViewportView(table);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(ConsultaWorckStation.class.getResource("/iconos/Zoom.gif")));
		btnFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFiltrar.setBounds(618, 96, 147, 59);
		getContentPane().add(btnFiltrar);

	}
}
