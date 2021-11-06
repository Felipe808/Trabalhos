package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JButton;

public class ViewMenuPizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenuPizza frame = new ViewMenuPizza();
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
	public ViewMenuPizza() {
		setBackground(new Color(255, 215, 0));
		setTitle("Pizza Sabor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 454);
		contentPane =  new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monte sua Pizza");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(208, 11, 174, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxMussarela = new JCheckBox("Mussarela");
		chckbxMussarela.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxMussarela.setBackground(new Color(255, 215, 0));
		chckbxMussarela.setBounds(32, 99, 97, 23);
		contentPane.add(chckbxMussarela);
		
		JCheckBox chckbxPepperpni = new JCheckBox("Pepperoni");
		chckbxPepperpni.setBackground(new Color(255, 215, 0));
		chckbxPepperpni.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxPepperpni.setBounds(32, 153, 97, 23);
		contentPane.add(chckbxPepperpni);
		
		JCheckBox chckbxSupreme = new JCheckBox("Supreme");
		chckbxSupreme.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxSupreme.setBackground(new Color(255, 215, 0));
		chckbxSupreme.setBounds(32, 211, 97, 23);
		contentPane.add(chckbxSupreme);
		
		JRadioButton rdbtnMpequena = new JRadioButton("R$ 15,00");
		rdbtnMpequena.setBackground(new Color(255, 215, 0));
		rdbtnMpequena.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnMpequena.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMpequena.setBounds(168, 99, 109, 23);
		contentPane.add(rdbtnMpequena);
		
		JRadioButton rdbtnPpequena = new JRadioButton("R$ 12,00");
		rdbtnPpequena.setBackground(new Color(255, 215, 0));
		rdbtnPpequena.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnPpequena.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPpequena.setBounds(168, 153, 109, 23);
		contentPane.add(rdbtnPpequena);
		
		JRadioButton rdbtnSpequena = new JRadioButton("R$ 17,00");
		rdbtnSpequena.setBackground(new Color(255, 215, 0));
		rdbtnSpequena.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnSpequena.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSpequena.setBounds(168, 211, 109, 23);
		contentPane.add(rdbtnSpequena);
		
		JRadioButton rdbtnMmedia = new JRadioButton("R$ 21,60");
		rdbtnMmedia.setBackground(new Color(255, 215, 0));
		rdbtnMmedia.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnMmedia.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMmedia.setBounds(298, 99, 109, 23);
		contentPane.add(rdbtnMmedia);
		
		JRadioButton rdbtnPmedia = new JRadioButton("R$ 27,00");
		rdbtnPmedia.setBackground(new Color(255, 215, 0));
		rdbtnPmedia.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnPmedia.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPmedia.setBounds(298, 153, 109, 23);
		contentPane.add(rdbtnPmedia);
		
		JRadioButton rdbtnSmedia = new JRadioButton("R$ 30,60");
		rdbtnSmedia.setBackground(new Color(255, 215, 0));
		rdbtnSmedia.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnSmedia.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSmedia.setBounds(298, 211, 109, 23);
		contentPane.add(rdbtnSmedia);
		
		JRadioButton rdbtnMgrande = new JRadioButton("R$ 26,40");
		rdbtnMgrande.setBackground(new Color(255, 215, 0));
		rdbtnMgrande.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnMgrande.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMgrande.setBounds(424, 99, 109, 23);
		contentPane.add(rdbtnMgrande);
		
		JRadioButton rdbtnPgrande = new JRadioButton("R$ 33,00");
		rdbtnPgrande.setBackground(new Color(255, 215, 0));
		rdbtnPgrande.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnPgrande.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPgrande.setBounds(424, 153, 109, 23);
		contentPane.add(rdbtnPgrande);
		
		JRadioButton rdbtnSgrande = new JRadioButton("R$ 37,40");
		rdbtnSgrande.setBackground(new Color(255, 215, 0));
		rdbtnSgrande.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnSgrande.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSgrande.setBounds(424, 211, 109, 23);
		contentPane.add(rdbtnSgrande);
		
		JLabel lblSabores = new JLabel("Sabores");
		lblSabores.setForeground(new Color(255, 255, 255));
		lblSabores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSabores.setHorizontalAlignment(SwingConstants.CENTER);
		lblSabores.setBounds(59, 59, 46, 14);
		contentPane.add(lblSabores);
		
		JLabel lblPequeno = new JLabel("Pequena");
		lblPequeno.setForeground(new Color(255, 255, 255));
		lblPequeno.setHorizontalAlignment(SwingConstants.CENTER);
		lblPequeno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPequeno.setBounds(185, 59, 78, 14);
		contentPane.add(lblPequeno);
		
		JLabel lblMedia = new JLabel("Media");
		lblMedia.setForeground(new Color(255, 255, 255));
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMedia.setBounds(331, 59, 46, 14);
		contentPane.add(lblMedia);
		
		JLabel lblGrande = new JLabel("Grande");
		lblGrande.setForeground(new Color(255, 255, 255));
		lblGrande.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrande.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrande.setBounds(456, 59, 46, 14);
		contentPane.add(lblGrande);
		
		JLabel lblCoberturaEx = new JLabel("Coberturas extras");
		lblCoberturaEx.setForeground(new Color(255, 255, 255));
		lblCoberturaEx.setBackground(new Color(255, 255, 255));
		lblCoberturaEx.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCoberturaEx.setBounds(32, 259, 126, 14);
		contentPane.add(lblCoberturaEx);
		
		JRadioButton rdbtnBacon = new JRadioButton("R$ 2,00");
		rdbtnBacon.setBackground(new Color(255, 215, 0));
		rdbtnBacon.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnBacon.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnBacon.setBounds(32, 309, 78, 23);
		contentPane.add(rdbtnBacon);
		
		JRadioButton rdbtnCebola = new JRadioButton("R$ 1,50");
		rdbtnCebola.setBackground(new Color(255, 215, 0));
		rdbtnCebola.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCebola.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnCebola.setBounds(32, 360, 78, 23);
		contentPane.add(rdbtnCebola);
		
		JRadioButton rdbtnTomate = new JRadioButton("R$ 1,00");
		rdbtnTomate.setBackground(new Color(255, 215, 0));
		rdbtnTomate.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTomate.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnTomate.setBounds(135, 309, 78, 23);
		contentPane.add(rdbtnTomate);
		
		JRadioButton rdbtnCatupiry = new JRadioButton("R$ 3,00");
		rdbtnCatupiry.setBackground(new Color(255, 215, 0));
		rdbtnCatupiry.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCatupiry.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnCatupiry.setBounds(135, 360, 78, 23);
		contentPane.add(rdbtnCatupiry);
		
		JRadioButton rdbtnChampignon = new JRadioButton("R$ 2,50");
		rdbtnChampignon.setBackground(new Color(255, 215, 0));
		rdbtnChampignon.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnChampignon.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnChampignon.setBounds(235, 309, 78, 23);
		contentPane.add(rdbtnChampignon);
		
		JRadioButton rdbtnPresunto = new JRadioButton("R$ 2,50");
		rdbtnPresunto.setBackground(new Color(255, 215, 0));
		rdbtnPresunto.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPresunto.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnPresunto.setBounds(235, 360, 78, 23);
		contentPane.add(rdbtnPresunto);
		
		JLabel lblNewLabel_1 = new JLabel("Bacon");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(59, 288, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cebola");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(59, 339, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tomate");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(153, 288, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Catupiry");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setBounds(153, 339, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Champignon");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setBounds(251, 288, 62, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Presunto");
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setBounds(255, 339, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(407, 309, 126, 44);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Fechar Pedido");
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(407, 360, 126, 23);
		contentPane.add(btnNewButton);
	}
}
