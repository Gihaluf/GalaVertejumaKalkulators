package pakotne;

import javax.swing.JOptionPane;

public class Kriteriji {
	static int maxSvars, sk;
	double atlSvars;
	// Definē kritērijus
	static void Define() {
		maxSvars = 100;
		sk = 1;
			for(int i=0; i<Ievade.kriteriji.length; i++) {
				do {
					JOptionPane.showInputDialog(null, 
							"Ievadi "+(i+1)+". kritēriju","Ievade",
							JOptionPane.QUESTION_MESSAGE);
					Ievade.kriteriji[i] = GalvenaKlase.scan.nextLine().trim();
				} while(!Ievade.kriteriji[i].matches("^[\\p{L} ]+$"));
				
			}
	}
}
