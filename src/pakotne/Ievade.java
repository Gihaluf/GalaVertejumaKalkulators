package pakotne;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Ievade {
	static int studSk, kritSk;
	static String[] studenti;
	static String[] kriteriji;
	static int[] kriterijaSvars;
	static int[][] kriterijaVertejums;
	static double[] semestraVertejums;
	
	static String virknesParbaude(String zinojums) {
		String virkne;
		do {
			virkne = JOptionPane.showInputDialog(zinojums);
			if(virkne == null)
				return null;
		}while(!Pattern.matches("^[\\p{L} .]+$", virkne));
		return virkne;
	}
	public static int skaitlaParbaude(String zinojums, int min) {
		String ievade;
		int skaitlis;
		while(true) {
			ievade = JOptionPane.showInputDialog(null, zinojums, 
					"Datu ievade", JOptionPane.INFORMATION_MESSAGE); 
			if(ievade == null)
				return -1;
			try {
				skaitlis = Integer.parseInt(ievade);
				if(skaitlis < min) {
					JOptionPane.showMessageDialog(null, 
					"Norādīts nederīgs intervāls", "Nekorekti dati",
					JOptionPane.WARNING_MESSAGE);
					continue;
				}
				
				return skaitlis;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
					"Netika ievadīts vesels skaitlis", "Nekorekti dati",
					JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	// Audzēkņu skaita ievade
	static void Audzekni() {
		do {
			studSk = skaitlaParbaude("Cik studentiem aprēķināsi gala vērtējumu?", 1);
		}while(studSk<1);
		studenti = new String[studSk];
	}
	
	// Vērtēšanas kritēriju skaita ievade
	static void Vertesana() {
		do {
			kritSk = skaitlaParbaude("Cik studentiem aprēķināsi gala vērtējumu?", 1);
		}while(kritSk<1);
		
		kriteriji = new String[kritSk];
		kriterijaSvars = new int[kritSk];
		kriterijaVertejums = new int[studSk][kritSk];
		semestraVertejums = new double[studSk];
	}
	
	// Ievada audzēkņu vārdus, uzvārdus
	static void Vardi() {
		for(int i=0; i<studenti.length; i++) {
			do {
				studenti [i] = virknesParbaude("Ievadi "+(i+1)+". studentu");
			} while(!studenti[i].matches("^[\\p{L} ]+$"));
		}
	}

}
