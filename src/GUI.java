import java.awt.EventQueue;
import java.awt.SystemColor;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frmPapierNoyceKamie;
	JLabel lblTytul, lblTwojWybor,label,lblWyborKomputera,lblWynikGry,lblWynikKomputera;
	ButtonGroup radioselect;
	JRadioButton rdbtnPapier,rdbtnNozyce,rdbtnKamien;
	JButton btnGraj;
		
	int gestKomp, gestGracz;
	int punktyGracz = 0, punktyKomp = 0;
	

	public GUI() {
	
		frmPapierNoyceKamie = new JFrame();
		frmPapierNoyceKamie.setResizable(false);
		frmPapierNoyceKamie.setTitle("Papier No\u017Cyce Kamie\u0144");
		frmPapierNoyceKamie.setForeground(Color.BLACK);
		frmPapierNoyceKamie.setBackground(SystemColor.controlDkShadow);
		frmPapierNoyceKamie.getContentPane().setBackground(SystemColor.controlDkShadow);
		frmPapierNoyceKamie.setBounds(100, 100, 528, 335);
		frmPapierNoyceKamie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPapierNoyceKamie.getContentPane().setLayout(null);
		
		lblTytul = new JLabel("Papier No\u017Cyce Komie\u0144");
		lblTytul.setForeground(Color.BLACK);
		lblTytul.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTytul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTytul.setBounds(113, 11, 285, 26);
		frmPapierNoyceKamie.getContentPane().add(lblTytul);
		
		lblTwojWybor = new JLabel("Twoj wybor");
		lblTwojWybor.setForeground(Color.BLACK);
		lblTwojWybor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTwojWybor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTwojWybor.setBounds(82, 59, 109, 26);
		frmPapierNoyceKamie.getContentPane().add(lblTwojWybor);
		
		radioselect = new ButtonGroup();
		
		rdbtnPapier = new JRadioButton("PAPIER", false);
		radioselect.add(rdbtnPapier);
		rdbtnPapier.setForeground(Color.BLACK);
		rdbtnPapier.setBackground(SystemColor.controlDkShadow);
		rdbtnPapier.setBounds(23, 103, 88, 23);
		frmPapierNoyceKamie.getContentPane().add(rdbtnPapier);
		
		rdbtnNozyce = new JRadioButton("NO\u017BYCE", false);
		radioselect.add(rdbtnNozyce);
		rdbtnNozyce.setForeground(Color.BLACK);
		rdbtnNozyce.setBackground(SystemColor.controlDkShadow);
		rdbtnNozyce.setBounds(23, 149, 88, 23);
		frmPapierNoyceKamie.getContentPane().add(rdbtnNozyce);
		
		rdbtnKamien = new JRadioButton("KAMIE\u0143", false);
		radioselect.add(rdbtnKamien);
		rdbtnKamien.setForeground(Color.BLACK);
		rdbtnKamien.setBackground(SystemColor.controlDkShadow);
		rdbtnKamien.setBounds(23, 195, 88, 23);
		frmPapierNoyceKamie.getContentPane().add(rdbtnKamien);
		
		label = new JLabel("New label");
		label.setBounds(286, 106, 26, -33);
		frmPapierNoyceKamie.getContentPane().add(label);
		
		lblWyborKomputera = new JLabel("Wyb\u00F3r Komputera");
		lblWyborKomputera.setForeground(Color.BLACK);
		lblWyborKomputera.setHorizontalAlignment(SwingConstants.CENTER);
		lblWyborKomputera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWyborKomputera.setBounds(273, 61, 157, 24);
		frmPapierNoyceKamie.getContentPane().add(lblWyborKomputera);
		
		btnGraj = new JButton("GRAJ");
		btnGraj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Akcja1();
			}
		});
		btnGraj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGraj.setBackground(SystemColor.scrollbar);
		btnGraj.setBounds(211, 149, 89, 69);
		frmPapierNoyceKamie.getContentPane().add(btnGraj);
		
		lblWynikGry = new JLabel("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
		lblWynikGry.setForeground(Color.BLACK);
		lblWynikGry.setHorizontalAlignment(SwingConstants.CENTER);
		lblWynikGry.setBounds(211, 262, 233, 23);
		frmPapierNoyceKamie.getContentPane().add(lblWynikGry);
		
		lblWynikKomputera = new JLabel("KAMIE\u0143");
		lblWynikKomputera.setForeground(Color.BLACK);
		lblWynikKomputera.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWynikKomputera.setHorizontalAlignment(SwingConstants.CENTER);
		lblWynikKomputera.setBounds(349, 103, 81, 115);
		frmPapierNoyceKamie.getContentPane().add(lblWynikKomputera);
		frmPapierNoyceKamie.setVisible(true);
	
		
	}
	public void Akcja1(){

		if(rdbtnPapier.isSelected())
			gestGracz = 1;
		if(rdbtnNozyce.isSelected())
			gestGracz = 2;
		if(rdbtnKamien.isSelected())
			gestGracz = 3;
			
		
	    gestKomp = new Random().ints(1, 4).findFirst().getAsInt();
	    switch(gestGracz) {
	        case 1:
	            if (gestKomp == 1) {
	                System.out.println("Remis... Wybra³eœ Papier i koputer wybra³ Papier");
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Papier");
	            } else if (gestKomp == 2) {
	                System.out.println("Przegra³eœ... Wybra³eœ Papier a komputer wybra³ No¿yce");
	                punktyKomp++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("No¿yce");
	            } else if (gestKomp == 3) {
	                System.out.println("Wygra³eœ... Wybra³eœ Papier a komputer wybra³ Kamieñ");
	                punktyGracz++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Kamieñ");
	            }
	            break;
	            //gracz wybra³ gest przypisany do liczby 2. Nastêpnie przyrównaie tego wyboru do ro¿nych wariantów gestu komputera
	        case 2:
	            if (gestKomp == 1) {
	                System.out.println("Wygra³eœ... Wybra³eœ No¿yce a komputer wybra³ Papier");
	                punktyGracz++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Papier");
	            } else if (gestKomp == 2) {
	                System.out.println("Remis... Wybra³eœ No¿yce i komputer wybra³ No¿yce");
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("No¿yce");
	            } else if (gestKomp == 3) {
	                System.out.println("Przegra³eœ... Wybra³eœ No¿yce a komputer wybra³ Kamieñ");
	                punktyKomp++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Kamieñ");
	            }
	            break;
	            //gracz wybra³ gest przypisany do liczby 3. Nastêpnie przyrównaie tego wyboru do ro¿nych wariantów gestu komputera
	        case 3:
	            if (gestKomp == 1) {
	                System.out.println("Przegra³eœ... Wybra³eœ Kamieñ a komputer wybra³ Papier");
	                punktyKomp++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Papier");
	            } else if (gestKomp == 2) {
	                System.out.println("Wygra³eœ... Wybra³eœ Kamieñ a komputer wybra³ No¿yce");
	                punktyGracz++;
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("No¿yce");
	            } else if (gestKomp == 3) {
	                System.out.println("Remis... Wybra³eœ Kamieñ i komputer wybra³ Kamieñ");
	                lblWynikGry.setText("WYNIK: Gracz: " + punktyGracz + " Komputer: " + punktyKomp);
	                lblWynikKomputera.setText("Kamieñ");
	            }
	            break;


	    }
	}
}


