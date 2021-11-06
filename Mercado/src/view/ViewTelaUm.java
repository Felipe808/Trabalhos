package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

public class ViewTelaUm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/*** Launch the application.*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaUm frame = new ViewTelaUm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*** Create the frame*/
	
	public ViewTelaUm() {
		setTitle("Z\u00E9 Cadinho");
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 429);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(219, 322, 115, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Produtos de entretenimento do mercadinho");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(131, 33, 304, 14);
		contentPane.add(label);
		
		JLabel lblJogos = new JLabel("Jogos");
		lblJogos.setForeground(Color.WHITE);
		lblJogos.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJogos.setBounds(57, 78, 74, 23);
		contentPane.add(lblJogos);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setForeground(Color.WHITE);
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValor.setBounds(239, 78, 74, 23);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade.setBounds(403, 78, 74, 23);
		contentPane.add(lblQuantidade);
		
		JCheckBox chckbxBaralho = new JCheckBox("Baralho");
		chckbxBaralho.setForeground(Color.WHITE);
		chckbxBaralho.setBackground(Color.DARK_GRAY);
		chckbxBaralho.setBounds(56, 108, 97, 23);
		contentPane.add(chckbxBaralho);
		
		JCheckBox chckbxDama = new JCheckBox("Dama");
		chckbxDama.setForeground(Color.WHITE);
		chckbxDama.setBackground(Color.DARK_GRAY);
		chckbxDama.setBounds(56, 134, 97, 23);
		contentPane.add(chckbxDama);
		
		JCheckBox chckbxUno = new JCheckBox("Uno");
		chckbxUno.setForeground(Color.WHITE);
		chckbxUno.setBackground(Color.DARK_GRAY);
		chckbxUno.setBounds(56, 160, 97, 23);
		contentPane.add(chckbxUno);
		
		JCheckBox chckbxXadrez = new JCheckBox("Xadrez");
		chckbxXadrez.setForeground(Color.WHITE);
		chckbxXadrez.setBackground(Color.DARK_GRAY);
		chckbxXadrez.setBounds(56, 186, 97, 23);
		contentPane.add(chckbxXadrez);
		
		JCheckBox chckbxSuperTrunfo = new JCheckBox("Super Trunfo");
		chckbxSuperTrunfo.setForeground(Color.WHITE);
		chckbxSuperTrunfo.setBackground(Color.DARK_GRAY);
		chckbxSuperTrunfo.setBounds(56, 212, 97, 23);
		contentPane.add(chckbxSuperTrunfo);
		
		JCheckBox chckbxPegaVaretas = new JCheckBox("Pega Varetas");
		chckbxPegaVaretas.setForeground(Color.WHITE);
		chckbxPegaVaretas.setBackground(Color.DARK_GRAY);
		chckbxPegaVaretas.setBounds(57, 238, 97, 23);
		contentPane.add(chckbxPegaVaretas);
		
		JLabel lblValorBaralho = new JLabel("R$ 15,00");
		lblValorBaralho.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorBaralho.setForeground(Color.WHITE);
		lblValorBaralho.setBounds(249, 117, 60, 14); 
		contentPane.add(lblValorBaralho);
		
		JLabel lblValorDama = new JLabel("R$ 25,00");
		lblValorDama.setForeground(Color.WHITE);
		lblValorDama.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorDama.setBounds(249, 143, 60, 14);
		contentPane.add(lblValorDama);
		
		JLabel lblValorUno = new JLabel("R$ 15,00");
		lblValorUno.setForeground(Color.WHITE);
		lblValorUno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorUno.setBounds(249, 169, 60, 14);
		contentPane.add(lblValorUno);
		
		JLabel lblValorXadres = new JLabel("R$ 30,00");
		lblValorXadres.setForeground(Color.WHITE);
		lblValorXadres.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorXadres.setBounds(249, 195, 60, 14);
		contentPane.add(lblValorXadres);
		
		JLabel lblValorSuperT = new JLabel("R$ 15,00");
		lblValorSuperT.setForeground(Color.WHITE);
		lblValorSuperT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorSuperT.setBounds(249, 221, 60, 14);
		contentPane.add(lblValorSuperT);
		
		JLabel lblValorPegaV = new JLabel("R$ 20,00");
		lblValorPegaV.setForeground(Color.WHITE);
		lblValorPegaV.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblValorPegaV.setBounds(249, 247, 60, 14);
		contentPane.add(lblValorPegaV);
		
		textField = new JTextField();
		textField.setBounds(418, 108, 48, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(418, 134, 48, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(418, 160, 48, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(418, 186, 48, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(418, 212, 48, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(418, 238, 48, 20);
		contentPane.add(textField_5);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(239, 288, 74, 28);
		contentPane.add(panel);
		
		
		
	}
}
