
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("ESCALAS MUSICALES");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacundoSanchez = new JLabel("facundo sanchez");
		lblFacundoSanchez.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacundoSanchez.setBounds(321, 350, 108, 23);
		contentPane.add(lblFacundoSanchez);
		
		JLabel lblFasfacuhotmailcom = new JLabel("fas_facu@hotmail.com");
		lblFasfacuhotmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFasfacuhotmailcom.setBounds(150, 354, 139, 14);
		contentPane.add(lblFasfacuhotmailcom);
		
		JTextPane texto1 = new JTextPane();
		texto1.setToolTipText("");
		texto1.setBackground(Color.LIGHT_GRAY);
		texto1.setEditable(false);
		texto1.setBounds(9, 153, 199, 146);
		contentPane.add(texto1);
		
		JTextPane texto2 = new JTextPane();
		texto2.setToolTipText("");
		texto2.setEditable(false);
		texto2.setBackground(Color.LIGHT_GRAY);
		texto2.setBounds(217, 153, 212, 146);
		contentPane.add(texto2);
		
		JTextPane texto3 = new JTextPane();
		texto3.setToolTipText("");
		texto3.setEditable(false);
		texto3.setBackground(Color.LIGHT_GRAY);
		texto3.setBounds(10, 310, 419, 33);
		contentPane.add(texto3);
		
		JComboBox tonos1 = new JComboBox();
		tonos1.setModel(new DefaultComboBoxModel(new String[] {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI"}));
		tonos1.setBounds(10, 11, 198, 33);
		contentPane.add(tonos1);
		
		JComboBox escalas1 = new JComboBox();
		escalas1.setModel(new DefaultComboBoxModel(new String[] {"Mayor", "Menor", "dorico", "frigio", "lidio", "mixolidio", "locrio", "pentatonica mayor", "pentatonica mayor variada", "pentatonica menor"}));
		escalas1.setBounds(10, 75, 198, 33);
		contentPane.add(escalas1);
		
		JComboBox tonos2 = new JComboBox();
		tonos2.setModel(new DefaultComboBoxModel(new String[] {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI"}));
		tonos2.setBounds(218, 11, 211, 33);
		contentPane.add(tonos2);
		
		JComboBox escalas2 = new JComboBox();
		escalas2.setModel(new DefaultComboBoxModel(new String[] {"Mayor", "Menor", "dorico", "frigio", "lidio", "mixolidio", "locrio", "pentatonica mayor", "pentatonica mayor variada", "pentatonica menor"}));
		escalas2.setBounds(218, 75, 211, 33);
		contentPane.add(escalas2);
		
		
		JButton btnMostrar = new JButton("mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrar.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
				Escalas escala = new Escalas();
				tonos1.getSelectedItem().toString();
				
				
				
				switch (escalas1.getSelectedItem().toString()) {
				case "Mayor": texto1.setText(escala.mayor(tonos1.getSelectedItem().toString())); break;
				case "Menor": texto1.setText(escala.menor(tonos1.getSelectedItem().toString())); break;
				case "dorico": texto1.setText(escala.dorico(tonos1.getSelectedItem().toString())); break;
				case "frigio": texto1.setText(escala.frigio(tonos1.getSelectedItem().toString())); break;
				case "lidio": texto1.setText(escala.lidio(tonos1.getSelectedItem().toString())); break;
				case "mixolidio": texto1.setText(escala.mixolidio(tonos1.getSelectedItem().toString())); break;
				case "locrio": texto1.setText(escala.locrio(tonos1.getSelectedItem().toString())); break;
				case "pentatonica mayor": texto1.setText(escala.penMayor(tonos1.getSelectedItem().toString())); break;
				case "pentatonica mayor variada": texto1.setText(escala.penMayorVar(tonos1.getSelectedItem().toString())); break;
				case "pentatonica menor": texto1.setText(escala.penMenor(tonos1.getSelectedItem().toString())); break;
				default: texto1.setText("ERROR"); break;
				}
				
				switch (escalas2.getSelectedItem().toString()) {
				case "Mayor": texto2.setText(escala.mayor(tonos2.getSelectedItem().toString())); break;
				case "Menor": texto2.setText(escala.menor(tonos2.getSelectedItem().toString())); break;
				case "dorico": texto2.setText(escala.dorico(tonos2.getSelectedItem().toString())); break;
				case "frigio": texto2.setText(escala.frigio(tonos2.getSelectedItem().toString())); break;
				case "lidio": texto2.setText(escala.lidio(tonos2.getSelectedItem().toString())); break;
				case "mixolidio": texto2.setText(escala.mixolidio(tonos2.getSelectedItem().toString())); break;
				case "locrio": texto2.setText(escala.locrio(tonos2.getSelectedItem().toString())); break;
				case "pentatonica mayor": texto2.setText(escala.penMayor(tonos2.getSelectedItem().toString())); break;
				case "pentatonica mayor variada": texto2.setText(escala.penMayorVar(tonos2.getSelectedItem().toString())); break;
				case "pentatonica menor": texto2.setText(escala.penMenor(tonos2.getSelectedItem().toString())); break;
				default: texto2.setText("ERROR"); break;
				}
				
				texto3.setText(escala.buscar(texto1.getText(), texto2.getText() ));
			}		
			
		});
		btnMostrar.setBounds(170, 119, 99, 23);
		contentPane.add(btnMostrar);
		
		
		
		JLabel fondo = new JLabel("");
		fondo.setVerticalAlignment(SwingConstants.TOP);
		fondo.setBackground(new Color(240, 240, 240));
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setIcon(new ImageIcon("C:\\Users\\usuario\\Desktop\\tomar-conciencia-musica-823x400.jpg"));
		fondo.setBounds(0, 0, 440, 397);
		contentPane.add(fondo);
	}
}
