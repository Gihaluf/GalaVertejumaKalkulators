package pakotne;

import javax.swing.JOptionPane;

public class Ievade {
	static int studSk, kritSk;
	static String []studenti = null;
	static String[] kriteriji = null;
	static int[] kriterijaSvars = null;
	static int[][] kriterijaVertejums = null;
	static double[] semestraVertejums = null;
	
	// Audzēkņu skaita ievade
	static void Audzekni() {
		do {
			JOptionPane.showInputDialog(null, 
				"Cik studentiem aprēķināsi gala vērtējumu?","Ievade",
				JOptionPane.QUESTION_MESSAGE);
			while(!GalvenaKlase.scan.hasNextInt()) {
				JOptionPane.showInputDialog(null, 
						"Cik studentiem aprēķināsi gala vērtējumu?","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				GalvenaKlase.scan.next();
			}
			studSk = GalvenaKlase.scan.nextInt();
		}while(studSk<1);
		String[] studenti = new String[studSk];
	}
	
	// Vērtēšanas kritēriju skaita ievade
	static void Vertesana() {
		do {
			JOptionPane.showInputDialog(null, 
					"Kāds būs kritēriju skaits?","Ievade",
					JOptionPane.QUESTION_MESSAGE);
			while(!GalvenaKlase.scan.hasNextInt()) {
				JOptionPane.showInputDialog(null, 
						"Kāds būs kritēriju skaits?","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				GalvenaKlase.scan.next();
			}
			kritSk = GalvenaKlase.scan.nextInt();
		}while(kritSk<1);
		String[] kriteriji = new String[kritSk];
		int[] kriterijaSvars = new int[kritSk];
		int[][] kriterijaVertejums = new int[studSk][kritSk];
		double[] semestraVertejums = new double[studSk];
		
		GalvenaKlase.scan.nextLine();
		
	}
	
	// Ievada audzēkņu vārdus, uzvārdus
	static void Vardi() {
		for(int i=0; i<studenti.length; i++) {
			do {
				JOptionPane.showInputDialog(null, 
						"Ievadi "+(i+1)+". studentu","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				studenti[i] = GalvenaKlase.scan.nextLine().trim();
			} while(!studenti[i].matches("^[\\p{L} ]+$"));
		}
	}
}
