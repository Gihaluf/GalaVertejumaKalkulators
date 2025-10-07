package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GalvenaKlase {
	public static Scanner scan = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("0.#");
	
	public static void main(String[] args) {
		String izvele;
		while(true) {
			izvele = (String) JOptionPane.showInputDialog(null,
					"Izvēle\n"
					+ "1-Ievadīt audzēķņus\n"
					+ "2-Ievadīt kritētrijus\n"
					+ "3-Ievadīt vērtējumu\n"
					+ "4-Labot kritēriju\n"
					+ "5-Labot kritērija svaru\n"
					+ "6-Labot iegūto vertējumu\n"
					+ "7-Aprēķināt gala vērtējumu\n"
					+ "8-Saglabāt rezultātus failā\n"
					+ "9-Nolasīt no faila\n"
					+ "x-Apturēt",
					"Izvēle",
					JOptionPane.QUESTION_MESSAGE);
			if(izvele == null) break;
			switch(izvele) {
			case "Ievadīt audzēķņus":
				Ievade.Audzekni();
				Ievade.Vardi();
				break;
			case "Ievadīt kritētrijus":
				Ievade.Vertesana();
				Kriteriji.Svars();
				break;
			case "Ievadīt vērtējumu":
				Kriteriji.vert();
			case "Labot kritēriju":
				break;
			case "Labot kritērija svaru":
				break;
			case "Labot iegūto vertējumu":
				break;
			case "Aprēķināt gala vērtējumu":
				Kriteriji.Aprekins();
				break;
			case "Saglabāt rezultātus failā":
				Izvade.Izvada();
				break;
			case "Nolasīt no faila":
				Izvade.nolasit();
				break;
			}
			if(izvele.equalsIgnoreCase("x") || izvele==null) break;
		}
	}
}