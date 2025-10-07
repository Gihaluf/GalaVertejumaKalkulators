package pakotne;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Kriteriji {
	static Scanner scan = new Scanner(System.in);
	static int maxSvars, sk;
	static double atlSvars;
	
	static void Svars() {
		// Definē kritērijus
		maxSvars = 100;
		sk = 1;
			for(int i=0; i<Ievade.kriteriji.length; i++) {
				do {
					JOptionPane.showInputDialog(null, 
							"Ievadi "+(i+1)+". kritēriju","Ievade",
							JOptionPane.QUESTION_MESSAGE);
					Ievade.kriteriji[i] = scan.nextLine().trim();
				} while(!Ievade.kriteriji[i].matches("^[\\p{L} ]+$"));
				
				// Norāda katra kritērija svaru
				do {
					JOptionPane.showInputDialog(null, 
							"Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")","Ievade",
							JOptionPane.QUESTION_MESSAGE);
					while(!scan.hasNextInt()) {
						JOptionPane.showInputDialog(null, 
								"Ievadi "+(i+1)+". kritērija svaru","Ievade",
								JOptionPane.QUESTION_MESSAGE);
						scan.next();
					}
					Ievade.kriterijaSvars[i] = scan.nextInt();
					/* Minimālā KATRA ATLIKUŠĀ kritērija svars ir 5
					 * kopējai svaru vērtībai ir jābūt 100 (ne mazāk, ne vairāk)
					*/
					atlSvars = (maxSvars - Ievade.kriterijaSvars[i]) / (double)(Ievade.kriteriji.length - sk);
				} while(Ievade.kriterijaSvars[i]>maxSvars || Ievade.kriterijaSvars[i]<5 || 
					  (i != Ievade.kriteriji.length-1 && Ievade.kriterijaSvars[i] == maxSvars) ||
					  (i == Ievade.kriteriji.length-1 && (maxSvars - Ievade.kriterijaSvars[i])  > 0) 
					  || atlSvars < 5);
				maxSvars -= Ievade.kriterijaSvars[i];
				sk++;
				scan.nextLine();
			}
	}
	static void vert() {
		// Norāda vērtējumu kādu ieguvis katrs audzēknis par katru kritēriju
		for(int i=0; i<Ievade.kriterijaVertejums.length; i++) {
			for(int j=0; j<Ievade.kriterijaVertejums[i].length; j++) {
				do {
					JOptionPane.showInputDialog(null, 
							"Ievadi "+Ievade.studenti[i]+" vērtējumu par kritēriju "+Ievade.kriteriji[j],"Ievade",
							JOptionPane.QUESTION_MESSAGE);
					while(!scan.hasNextInt()) {
						JOptionPane.showInputDialog(null, 
								"Ievadi "+Ievade.studenti[i]+" vērtējumu par kritēriju "+Ievade.kriteriji[j],"Ievade",
								JOptionPane.QUESTION_MESSAGE);
						scan.next();
					}
					Ievade.kriterijaVertejums[i][j] = GalvenaKlase.scan.nextInt();
				}while(Ievade.kriterijaVertejums[i][j]<0 || Ievade.kriterijaVertejums[i][j]>10);
			}
		}
	}
	// Gala vērtējuma aprēķināšana
	static void Aprekins() {

				double rezultats;
				for(int i=0; i<Ievade.studenti.length; i++) {
					rezultats=0;
					for(int j=0; j<Ievade.kriteriji.length; j++) {
						rezultats += ((double) Ievade.kriterijaSvars[j]/100)*Ievade.kriterijaVertejums[i][j];
					}
					Ievade.semestraVertejums[i] = rezultats;
				}
	}
}