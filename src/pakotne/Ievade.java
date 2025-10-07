package pakotne;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ievade {
	public static Scanner scan = new Scanner(System.in);
	public static int studSk, kritSk;
	public static String []studenti = null;
	public static String[] kriteriji = null;
	public static int[] kriterijaSvars = null;
	public static int[][] kriterijaVertejums = null;
	public static double[] semestraVertejums = null;
	
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
		String[] studenti = new String[studSk];
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
}
