import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Tests extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Test test;
	private JLabel Jautaj;
	private JRadioButton pirmIzv, otrIzv, tresIzv, cetIzv;
	private JLabel pirmTeksts, otrTeksts, trsTeksts, ctrTeksts;
	private ButtonGroup grupa;
	private JButton Iesniegt;
	private JLabel Ramis;
	
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
		Jautajums[] jautajums = {
				new Jautajums("sss", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("ddd", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("ee", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("qqq", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("rrr", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("yyy", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("uuu", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("iii", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("mmm", new String[] {"1", "2", "3","4"}, 1),
				new Jautajums("bbb", new String[] {"1", "2", "3","4"}, 1),
		};
		test = new Test(jautajums);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Jautaj = new JLabel("New label");
		Jautaj.setFont(new Font("Tahoma", Font.BOLD, 19));
		Jautaj.setForeground(new Color(0, 0, 0));
		Jautaj.setBounds(358, 89, 216, 157);
		contentPane.add(Jautaj);
		
		
		Iesniegt = new JButton("Iesniegt");
		Iesniegt.setBackground(new Color(0, 0, 0));
		Iesniegt.setForeground(new Color(0, 0, 0));
		Iesniegt.setBounds(329, 434, 136, 48);
		contentPane.add(Iesniegt);
		Iesniegt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iesniegtAtb();
			}
		});
		
		pirmTeksts = new JLabel("New label");
		pirmTeksts.setForeground(new Color(255, 255, 255));
		pirmTeksts.setBounds(78, 131, 188, 25);
		contentPane.add(pirmTeksts);
		
		otrTeksts = new JLabel("New label");
		otrTeksts.setForeground(Color.WHITE);
		otrTeksts.setBounds(78, 187, 188, 25);
		contentPane.add(otrTeksts);
		
		Ramis = new JLabel("New label");
		Ramis.setBounds(329, 89, 445, 305);
		ImageIcon ramis = new ImageIcon(getClass().getResource("/resources/ramis.jpg"));
		Ramis.setIcon(ramis);
		contentPane.add(Ramis);
		
		trsTeksts = new JLabel("New label");
		trsTeksts.setForeground(Color.WHITE);
		trsTeksts.setBounds(78, 246, 188, 25);
		contentPane.add(trsTeksts);
		
		
		ctrTeksts = new JLabel("New label");
		ctrTeksts.setForeground(Color.WHITE);
		ctrTeksts.setBounds(78, 302, 188, 25);
		contentPane.add(ctrTeksts);
		
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
		
		cetIzv = new JRadioButton("");
		cetIzv.setBackground(new Color(0, 0, 0));
		cetIzv.setBounds(44, 304, 21, 23);
		contentPane.add(cetIzv);
		
		tresIzv = new JRadioButton("");
		tresIzv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tresIzv.setBackground(new Color(0, 0, 0));
		tresIzv.setBounds(44, 247, 21, 23);
		contentPane.add(tresIzv);
		
		pirmIzv = new JRadioButton("");
		pirmIzv.setBackground(new Color(0, 0, 0));
		pirmIzv.setBounds(44, 133, 21, 23);
		contentPane.add(pirmIzv);
		
		otrIzv = new JRadioButton("");
		otrIzv.setBackground(new Color(0, 0, 0));
		otrIzv.setBounds(44, 188, 21, 23);
		contentPane.add(otrIzv);
		
		
		grupa = new ButtonGroup();
		grupa.add(pirmIzv);
		grupa.add(otrIzv);
		grupa.add(tresIzv);
		grupa.add(cetIzv);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 784, 561);
		contentPane.add(lblNewLabel);
		
		ImageIcon bilde = new ImageIcon(getClass().getResource("/resources/back1.jpg"));
		lblNewLabel.setIcon(bilde);
		
			paraditJaut();
		}
	private void iesniegtAtb() {
		Jautajums pasreizejaisJautajums = test.getjautIzv();
		int pareizaAtb = pasreizejaisJautajums.getpareizaAtb();
		int izveletaAtb = -1;
		 if(pirmIzv.isSelected()) {
			 izveletaAtb = 1;
		 }else if(otrIzv.isSelected()) {
			 izveletaAtb = 2;
		 }else if(tresIzv.isSelected()) {
			 izveletaAtb = 3;
	}else if(cetIzv.isSelected()) {
		 izveletaAtb = 4;
	}
		 if(izveletaAtb == pareizaAtb) {
			 test.mainitRez();
			 JOptionPane.showMessageDialog(this, "Pareizi");
		 }else {
			 JOptionPane.showMessageDialog(this, "Nepareizi");
		 }
		 test.nakosaisJaut();
		 grupa.clearSelection();
		 paraditJaut();
	}
	private void paraditJaut() {
		if(!test.irnakosaisJaut()) {
			int jautSkaits = test.getJautDaudzums();
			int pareizi = test.getRez();
			int nepareizi = jautSkaits - pareizi;
			JOptionPane.showMessageDialog(this,  "Paldies par testu, jūsu rezūltāts ir "+pareizi+" no "+test.getJautDaudzums());
			return;
		}
		Jautajums pasreizejaisJautajums = test.getjautIzv();
		String jaut = pasreizejaisJautajums.getJaut();
		String[] opcijas = pasreizejaisJautajums.getIzveles();
		Jautaj.setText(jaut);
		pirmTeksts.setText(opcijas[0]);
		otrTeksts.setText(opcijas[1]);
		ctrTeksts.setText(opcijas[2]);
		trsTeksts.setText(opcijas[3]);
	}
}
