package vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class primero extends JFrame 
implements ActionListener{

	private JPanel contentPane;
	private JButton btnVer;
	private JButton btnOcultar;
	private JLabel lblHola;

	/**
	 * Launch the application.
	 * 
	 * 
	 * lalala
	 * a
	 * la
	 * al
	 * lal
	 * a
	 * 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primero frame = new primero();
					frame.setVisible(true);
				} catch (Exception valorboton) {
					valorboton.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public primero() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHola = new JLabel("hola");
		lblHola.setForeground(Color.DARK_GRAY);
		lblHola.setBounds(201, 11, 187, 14);
		contentPane.add(lblHola);
		
		btnVer = new JButton("Ver");
		btnVer.setForeground(Color.DARK_GRAY);
		
		
		btnVer.setBounds(87, 66, 89, 23);
		contentPane.add(btnVer);
		
		btnOcultar = new JButton("Ocultar");
		btnOcultar.setForeground(Color.DARK_GRAY);
		btnOcultar.setBounds(258, 66, 89, 23);
		contentPane.add(btnOcultar);
		
		
		btnVer.addActionListener(this);
		btnOcultar.addActionListener(this); 
		
	}

	@Override
	public void actionPerformed(ActionEvent valorboton) {
		// TODO Auto-generated method stub
		
		if (valorboton.getSource() == btnVer) {
			lblHola.setText (" SE HA PULSADO EL BOTÓN VER"); 
			btnOcultar.setVisible(true);
			btnVer.setVisible(false);
		}
		if (valorboton.getSource() == btnOcultar) {
			lblHola.setText (" SE HA PULSADO EL BOTÓN OCULTAR");
			btnOcultar.setVisible(false);
			btnVer.setVisible(true);
		}
		
		
	}
}
