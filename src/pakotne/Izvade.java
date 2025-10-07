package pakotne;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Izvade {
	// Gala vērtējumu izvadīšana
	static void Izvada() {
			for(int i=0; i<Ievade.studenti.length; i++) {	
				for(int j=0; j<Ievade.kriteriji.length; j++) {
					JOptionPane.showInputDialog(null, 
							"Studenta "+Ievade.studenti[i]+" vērtējums par kritēriju "+Ievade.kriteriji[j]+" ir "+Ievade.kriterijaVertejums[i][j]+", kura svars ir "+Ievade.kriterijaSvars[j],
							"Izvade",
							JOptionPane.QUESTION_MESSAGE);
					System.out.println();
				}
				JOptionPane.showInputDialog(null, 
						"Semestra vērtējums ir "+GalvenaKlase.df.format(Ievade.semestraVertejums[i])+" balles",
						"Izvade",
						JOptionPane.QUESTION_MESSAGE);
			}
			GalvenaKlase.scan.close();
	}
	static void Ieraksta() {
		try {
			FileWriter fw = new FileWriter("nosaukums", false);
			PrintWriter pw = new PrintWriter(fw);
			
			
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Nesaglabā failā", "Kļūda",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
