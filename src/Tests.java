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
import java.util.List;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jautajums[] jautajums = {
				new Jautajums("<html>Do while ciklā, kad cikls pārbaudīs, vai cikla nosacijums ir patiess?", new String[] {"Nekad", "Beigās", "Sākumā","Vidū"}, 2),
				new Jautajums("<html> Cik reizes programma izprintēs tekstu?: <br><br> int a = 0; <br> do{ <br> System.out.print('Sveiki')<br>}while(a==0);", new String[] {"Vienu reizi", "Nevienu reizi", "Bezgalīgi","Divas reizes"}, 3),
				new Jautajums("<html> Cik reizes ir garantēts, ka Do While cikls izpildīsies", new String[] {"Bezgalīgi", "Nevienu", "Vienu","Atkarībā, vai nosacijums ir nepatiess"}, 3),
				new Jautajums("<html> Cik reizes programma izprintēs tekstu?: <br><br> int x = 0; <br> do{ <br> System.out.print('Apsveicu');<br>}while(x==2);", new String[] {"Vienu reizi", "Nevienu reizi", "Bezgalīgi","Divas reizes"}, 1),
				new Jautajums("<html> Ko programma izprintēs?: <br> int a = 1; <br> do{ <br> System.out.print('N')<br>}while(a&lt;=5);", new String[] {"N", "NNNN", "Nekas","NNNNN"}, 4),
				new Jautajums("<html> Kas tiks izprintēts konsolē <br><br> int j = 0;<br> do{ <br> j++;<br> System.out.print(j+ ' ')<br>}while(j&lt;5);", new String[] {"0 1 2 3 4", "1 2 3 4 5", "Nekas","1 2 3 4"}, 2),
				new Jautajums("<html>Do While cikls tiks atkārtots, tiklīdz nosacijums kļūs ...", new String[] {"Nederīgs", "False", "Derīgs","True"}, 2),
				new Jautajums("<html> Kas notiek, ja Do While cikla nosacijums nekad nav nepatiess", new String[] {"Cikls izpildīsies bezgalīgi", "Cikls izpildīsies vienu reizi", "Cikls parādīs kļūdu","Cikls neizpildīsies"}, 1),
				new Jautajums("<html> Kas tiks izprintēts komsolē?<br><br> y = 32;<br>do{<br>System.out.print(y);<br>y++;<br>}while(y&lt;=30);", new String[] {"30", "31", "32","Nekas"}, 3),
				new Jautajums("<html>Kā atšķiras Do While cikls ar While ciklu?", new String[] {"<html>Do While cikls pārbauda cikla nosacijumu pirms tā darbības", "<html>While cikls pārbauda cikla nosacijumu pēc cikla darbības", "<html>Do While cikls nekad nepārbauda cikla nosacijumu","<html>Do While cikls pārbauda nosacijumu pēc cikla darbības"}, 4),
		};
		test = new Test(jautajums);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Jautaj = new JLabel("");
		Jautaj.setBackground(new Color(255, 255, 255));
		Jautaj.setHorizontalAlignment(SwingConstants.LEFT);
		Jautaj.setVerticalAlignment(SwingConstants.TOP);
		Jautaj.setFont(new Font("Tahoma", Font.BOLD, 19));
		Jautaj.setForeground(new Color(0, 0, 0));
		Jautaj.setBounds(346, 109, 365, 272);
		Jautaj.setOpaque(true);
		contentPane.add(Jautaj);
		
		
		Iesniegt = new JButton("Iesniegt");
		Iesniegt.setBackground(new Color(0, 0, 0));
		Iesniegt.setForeground(new Color(0, 0, 0));
		Iesniegt.setBounds(329, 434, 136, 48);
		contentPane.add(Iesniegt);
		Iesniegt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pirmIzv.isSelected() || otrIzv.isSelected() || cetIzv.isSelected() || tresIzv.isSelected()) {
				iesniegtAtb();
			}else {
				JOptionPane.showMessageDialog(null, "Lūdzu ivēlaties atbildi!", "Kļūda", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		
		pirmTeksts = new JLabel("New label");
		pirmTeksts.setForeground(new Color(255, 255, 255));
		pirmTeksts.setBounds(78, 131, 241, 45);
		contentPane.add(pirmTeksts);
		
		otrTeksts = new JLabel("New label");
		otrTeksts.setForeground(Color.WHITE);
		otrTeksts.setBounds(78, 187, 241, 48);
		contentPane.add(otrTeksts);
		
		Ramis = new JLabel("New label");
		Ramis.setBounds(329, 89, 445, 305);
		ImageIcon ramis = new ImageIcon(getClass().getResource("/resources/ramis.jpg"));
		Ramis.setIcon(ramis);
		contentPane.add(Ramis);
		
		trsTeksts = new JLabel("New label");
		trsTeksts.setForeground(Color.WHITE);
		trsTeksts.setBounds(78, 246, 241, 48);
		contentPane.add(trsTeksts);
		
		
		ctrTeksts = new JLabel("New label");
		ctrTeksts.setForeground(Color.WHITE);
		ctrTeksts.setBounds(78, 302, 241, 48);
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
			 test.mainitRez(true);
			 JOptionPane.showMessageDialog(this, "Pareizi");
		 }else {
			 test.mainitRez(false);
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
			
			StringBuilder nepareiziJaut = new StringBuilder("<html>");
			List<Jautajums> nepareizasAtb = test.getNepareizasAtb();
			for(Jautajums jaut : nepareizasAtb) {
				nepareiziJaut.append(jaut.getJaut()).append("<br> Jautājuma pareizā atbilde: ").append(jaut.getIzveles()[jaut.getpareizaAtb()-1]).append("<br><br>");
			}
			JOptionPane.showMessageDialog(this,  "<html>Paldies par testu, jūsu rezūltāts ir "+pareizi+
					" no "+test.getJautDaudzums()+
					"<br><br>Jautājumi uz kuriem jūs atbildējāt nepareizi: <br><br>"+nepareiziJaut.toString()+"</html>");

			Tests.this.dispose();
			return;
		}
		Jautajums pasreizejaisJautajums = test.getjautIzv();
		String jaut = pasreizejaisJautajums.getJaut();
		String[] opcijas = pasreizejaisJautajums.getIzveles();
		Jautaj.setText(jaut);
		pirmTeksts.setText(opcijas[0]);
		otrTeksts.setText(opcijas[1]);
		trsTeksts.setText(opcijas[2]);
		ctrTeksts.setText(opcijas[3]);
	}
}
