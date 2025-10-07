package pakotne;

import javax.swing.JOptionPane;

public class Kriteriji {
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
					Ievade.kriteriji[i] = GalvenaKlase.scan.nextLine().trim();
				} while(!Ievade.kriteriji[i].matches("^[\\p{L} ]+$"));
				
				// Norāda katra kritērija svaru
				do {
					JOptionPane.showInputDialog(null, 
							"Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")","Ievade",
							JOptionPane.QUESTION_MESSAGE);
					while(!GalvenaKlase.scan.hasNextInt()) {
						JOptionPane.showInputDialog(null, 
								"Ievadi "+(i+1)+". kritērija svaru","Ievade",
								JOptionPane.QUESTION_MESSAGE);
						GalvenaKlase.scan.next();
					}
					Ievade.kriterijaSvars[i] = GalvenaKlase.scan.nextInt();
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
				GalvenaKlase.scan.nextLine();
		}
	}
}