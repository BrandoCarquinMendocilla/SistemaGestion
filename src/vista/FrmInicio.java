package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class FrmInicio extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmProducto;
	private JMenuItem mntmVendedor;

	//PASO1
	private FrmProducto frmProducto= new FrmProducto();
	private FrmVendedor frmVendedor = new FrmVendedor();
	
	private  FrmConsultasProducto frmConsultasProducto = new FrmConsultasProducto();
	private  FrmConsultasVendedor frmConsultasVendedor = new FrmConsultasVendedor();
	private JMenuItem mntmConsultaProducto;
	private JMenuItem mntmConsultaVendedor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInicio frame = new FrmInicio();
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
	public FrmInicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmInicio.class.getResource("/iconos/Company.gif")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("SISTEMA  DE GESTION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 366);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdministracion = new JMenu("ADMINISTRACION");
		mnAdministracion.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnAdministracion.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/User group.gif")));
		menuBar.add(mnAdministracion);
		
		mntmProducto = new JMenuItem("Producto");
		mntmProducto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_DOWN_MASK));
		mntmProducto.addActionListener(this);
		mntmProducto.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Gift.gif")));
		mnAdministracion.add(mntmProducto);
		
		mntmVendedor = new JMenuItem("Vendedor");
		mntmVendedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.ALT_DOWN_MASK));
		mntmVendedor.addActionListener(this);
		mntmVendedor.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Boy.gif")));
		mnAdministracion.add(mntmVendedor);
		
		JMenu mnConsultas = new JMenu("CONSULTAS");
		mnConsultas.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnConsultas.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Closed folder.gif")));
		menuBar.add(mnConsultas);
		
		mntmConsultaProducto = new JMenuItem("Consulta de Producto");
		mntmConsultaProducto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mntmConsultaProducto.addActionListener(this);
		mntmConsultaProducto.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Bar chart.gif")));
		mnConsultas.add(mntmConsultaProducto);
		
		mntmConsultaVendedor = new JMenuItem("Consulta de Vendedor");
		mntmConsultaVendedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		mntmConsultaVendedor.addActionListener(this);
		mntmConsultaVendedor.setIcon(new ImageIcon(FrmInicio.class.getResource("/iconos/Book.gif")));
		mnConsultas.add(mntmConsultaVendedor);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.activeCaption);
		//PASO2
		desktopPane.add(frmProducto);
		desktopPane.add(frmVendedor);
		desktopPane.add(frmConsultasProducto);
		desktopPane.add(frmConsultasVendedor);
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConsultaVendedor) {
			actionPerformedMntmConsultaVendedorJMenuItem(e);
		}
		if (e.getSource() == mntmConsultaProducto) {
			actionPerformedMntmConsultaProductoJMenuItem(e);
		}
		if (e.getSource() == mntmVendedor) {
			actionPerformedMntmVendedorJMenuItem(e);
		}
		if (e.getSource() == mntmProducto) {
			actionPerformedMntmProductoJMenuItem(e);
		}
	}
	protected void actionPerformedMntmProductoJMenuItem(ActionEvent e) {
		//PASO3
		frmProducto.setVisible(true);
	}
	
	
	protected void actionPerformedMntmVendedorJMenuItem(ActionEvent e) {
		//PASO3
		frmVendedor.setVisible(true);
	}
	protected void actionPerformedMntmConsultaProductoJMenuItem(ActionEvent e) {
		frmConsultasProducto.setVisible(true);
	}
	protected void actionPerformedMntmConsultaVendedorJMenuItem(ActionEvent e) {
		frmConsultasVendedor.setVisible(true);
	}
}
