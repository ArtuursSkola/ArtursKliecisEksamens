import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/resources/poga.png")));;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tests newWindow = new Tests();
				newWindow.setVisible(true);
				Menu.this.dispose();
			}
			
		});
		



		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setContentAreaFilled(false);
	    ImageIcon originalImageIcon3 = new ImageIcon(getClass().getResource("/resources/stop.png"));
	    ImageIcon scaledImageIcon3 = new ImageIcon(originalImageIcon3.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	    btnNewButton_1.setIcon(scaledImageIcon3);
		btnNewButton_1.setBounds(702, 0, 101, 51);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    System.exit(0);
					}
			    });
		
		JLabel lblNewLabel_3 = new JLabel("Artūrs Kliečis 2PT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 481, 196, 57);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Tests par ciklu ar pēcnosacijumu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(71, -21, 703, 274);
		contentPane.add(lblNewLabel_2);
				
			
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Sākt testu");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(340, 292, 153, 30);
		contentPane.add(lblNewLabel_1);
		btnNewButton.setBounds(269, 243, 258, 125);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel);
		
		ImageIcon bilde = new ImageIcon(getClass().getResource("/resources/back.jpg"));
		lblNewLabel.setIcon(bilde);
	}
}
