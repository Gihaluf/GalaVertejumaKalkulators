package pakotne;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ievade {
	public static Scanner scan = new Scanner(System.in);
	// Audzēkņu skaita ievade
	static void Audzekni(int studSk) {
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
}
