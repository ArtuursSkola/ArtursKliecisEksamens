
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;


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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		

		JLabel lblNewLabel_4 = new JLabel("Vārds:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(228, 295, 248, 38);
		contentPane.add(lblNewLabel_4);
		
		final JLabel lblNewLabel_5_1 = new JLabel("Vārds ir pārāk īss, vai satur ciparu!");
		lblNewLabel_5_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_1.setBounds(228, 227, 356, 30);
		lblNewLabel_5_1.setVisible(false);
		contentPane.add(lblNewLabel_5_1);
		
		final JLabel lblNewLabel_5 = new JLabel("Vārdā nedrīkst būt cipari vai simboli!");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5.setBounds(228, 254, 377, 30);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/resources/poga.png")));;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vards = name.getText();
				boolean derigs = true;
				boolean tikaiCipari = vards.matches("[a-zA-Z]+");
				boolean garums = (vards.length() >= 3 && vards.length() < 12);
				if(!tikaiCipari) {
					lblNewLabel_5.setVisible(true);
					derigs = false;
				}else {
					lblNewLabel_5.setVisible(false);
				}
				if(!garums) {
					lblNewLabel_5_1.setVisible(true);
					derigs = false;
				}
				if(vards.length() >= 3 && tikaiCipari && vards.length() < 12) {
				derigs = true;
				}
				if(derigs == true) {
				Tests newWindow = new Tests();
				newWindow.setVisible(true);
				Menu.this.dispose();
			}
			}
			
		});
		
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setToolTipText("");
		name.setBounds(301, 294, 188, 38);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Artūrs Kliečis 2PT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 481, 196, 57);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Tests par ciklu ar pēcnosacijumu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(39, 22, 764, 274);
		contentPane.add(lblNewLabel_2);
				
			
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Sākt testu");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(335, 367, 153, 30);
		contentPane.add(lblNewLabel_1);
		btnNewButton.setBounds(264, 318, 258, 125);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel);
		
		ImageIcon bilde = new ImageIcon(getClass().getResource("/resources/backround.png"));
		lblNewLabel.setIcon(bilde);
		
		JLabel label = new JLabel("New label");
		label.setBounds(349, 239, 46, 14);
		contentPane.add(label);
	}
}
