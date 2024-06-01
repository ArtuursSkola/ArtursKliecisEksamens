import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Tests extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tests frame = new Tests();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tests() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel otrTeksts = new JLabel("New label");
		otrTeksts.setForeground(Color.WHITE);
		otrTeksts.setBounds(78, 187, 188, 25);
		contentPane.add(otrTeksts);
		
		JLabel ctrTeksts = new JLabel("New label");
		ctrTeksts.setForeground(Color.WHITE);
		ctrTeksts.setBounds(78, 302, 188, 25);
		contentPane.add(ctrTeksts);
		
		JLabel trsTeksts = new JLabel("New label");
		trsTeksts.setForeground(Color.WHITE);
		trsTeksts.setBounds(78, 246, 188, 25);
		contentPane.add(trsTeksts);
		
		JLabel pirmTeksts = new JLabel("New label");
		pirmTeksts.setForeground(new Color(255, 255, 255));
		pirmTeksts.setBounds(78, 131, 188, 25);
		contentPane.add(pirmTeksts);
		
		JLabel lblNewLabel_1 = new JLabel("1. Jautājums");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(258, 3, 386, 59);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 73, 784, 12);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(32, 133, 8, 196);
		contentPane.add(separator);
		
		JRadioButton cetIzv = new JRadioButton("New radio button");
		cetIzv.setBackground(new Color(0, 0, 0));
		cetIzv.setBounds(44, 304, 21, 23);
		contentPane.add(cetIzv);
		
		JRadioButton tresIzv = new JRadioButton("New radio button");
		tresIzv.setBackground(new Color(0, 0, 0));
		tresIzv.setBounds(44, 247, 21, 23);
		contentPane.add(tresIzv);
		
		JRadioButton pirmIzv = new JRadioButton("");
		pirmIzv.setBackground(new Color(0, 0, 0));
		pirmIzv.setBounds(44, 133, 21, 23);
		contentPane.add(pirmIzv);
		
		JRadioButton otrIzv = new JRadioButton("New radio button");
		otrIzv.setBackground(new Color(0, 0, 0));
		otrIzv.setBounds(44, 188, 21, 23);
		contentPane.add(otrIzv);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel);
		
		ImageIcon bilde = new ImageIcon(getClass().getResource("/resources/back1.jpg"));
		lblNewLabel.setIcon(bilde);
	}
}
