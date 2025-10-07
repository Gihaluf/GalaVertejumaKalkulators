package pakotne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Izvade {
	static String failaN = "Atzimes.txt";
	// Gala vērtējumu izvadīšana
	static void Izvada() {
			for(int i=0; i<Ievade.studenti.length; i++) {	
				for(int j=0; j<Ievade.kriteriji.length; j++) {
					Ieraksta(i, j);
					JOptionPane.showInputDialog(null, 
							"Studenta "+Ievade.studenti[i]+" vērtējums par kritēriju "+Ievade.kriteriji[j]+" ir "+Ievade.kriterijaVertejums[i][j]+", kura svars ir "+Ievade.kriterijaSvars[j],
							"Izvade",
							JOptionPane.QUESTION_MESSAGE);
				}
				JOptionPane.showInputDialog(null, 
						"Semestra vērtējums ir "+GalvenaKlase.df.format(Ievade.semestraVertejums[i])+" balles",
						"Izvade",
						JOptionPane.QUESTION_MESSAGE);
			}
			GalvenaKlase.scan.close();
		}
	static void Ieraksta(int i, int j) {
		try {
			FileWriter fw = new FileWriter(failaN, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Studenta "+Ievade.studenti[i]+" vērtējums par kritēriju "+Ievade.kriteriji[j]+" ir "+Ievade.kriterijaVertejums[i][j]+", kura svars ir "+Ievade.kriterijaSvars[j]);
			pw.println("Semestra vērtējums ir "+GalvenaKlase.df.format(Ievade.semestraVertejums[i])+" balles");
			pw.print("+++++++++++++++++++++++++++++++++++++++++++++++++");
			pw.close();
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Nesaglabā failā", "Kļūda",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	static void nolasit() {
		String teksts, str = "";
		try {
			FileReader fr = new FileReader(failaN);
			BufferedReader br = new BufferedReader (fr);
			while((teksts = br.readLine()) != null) {
				str += teksts+"\n";
			}
			br.close();
			
			JTextArea ta = new JTextArea (str, 10, 40);
			ta.setEditable(false);
			JScrollPane sp = new JScrollPane(ta);
			sp.setVerticalScrollBarPolicy(
					ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			JOptionPane.showMessageDialog(ta, sp, "Atzīmes",
					JOptionPane.PLAIN_MESSAGE);
			
		}catch(IOException e){
			JOptionPane.showMessageDialog(null,
				"Kļūda nolasot failu!", "Kļūda",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
