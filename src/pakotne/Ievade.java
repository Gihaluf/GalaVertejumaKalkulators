package pakotne;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ievade {
	static Scanner scan = new Scanner(System.in);
	static int studSk, kritSk;
	static String[] studenti;
	static String[] kriteriji;
	static int[] kriterijaSvars;
	static int[][] kriterijaVertejums;
	static double[] semestraVertejums;
	
	// Audzēkņu skaita ievade
	static void Audzekni() {
		do {
			JOptionPane.showInputDialog(null, 
				"Cik studentiem aprēķināsi gala vērtējumu?","Ievade",
				JOptionPane.QUESTION_MESSAGE);
			while(!scan.hasNextInt()) {
				JOptionPane.showInputDialog(null, 
						"Cik studentiem aprēķināsi gala vērtējumu?","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				scan.next();
			}
			studSk = scan.nextInt();
		}while(studSk<1);
		studenti = new String[studSk];
	}
	
	// Vērtēšanas kritēriju skaita ievade
	static void Vertesana() {
		do {
			JOptionPane.showInputDialog(null, 
					"Kāds būs kritēriju skaits?","Ievade",
					JOptionPane.QUESTION_MESSAGE);
			while(!scan.hasNextInt()) {
				JOptionPane.showInputDialog(null, 
						"Kāds būs kritēriju skaits?","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				scan.next();
			}
			kritSk = scan.nextInt();
		}while(kritSk<1);
		String[] kriteriji = new String[kritSk];
		int[] kriterijaSvars = new int[kritSk];
		int[][] kriterijaVertejums = new int[studSk][kritSk];
		double[] semestraVertejums = new double[studSk];
		
		scan.nextLine();
		
	}
	
	// Ievada audzēkņu vārdus, uzvārdus
	static void Vardi() {
		for(int i=0; i<studenti.length; i++) {
			do {
				JOptionPane.showInputDialog(null, 
						"Ievadi "+(i+1)+". studentu","Ievade",
						JOptionPane.QUESTION_MESSAGE);
				studenti[i] = scan.nextLine().trim();
			} while(!studenti[i].matches("^[\\p{L} ]+$"));
		}
	}

}
