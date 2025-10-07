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
					+ "Ievadīt audzēķņus\n"
					+ "Ievadīt kritētrijus\n"
					+ "Ievadīt vērtējumu\n"
					+ "Labot kritēriju\n"
					+ "Labot kritērija svaru\n"
					+ "Labot iegūto vertējumu\n"
					+ "Aprēķināt gala vērtējumu\n"
					+ "Saglabāt rezultātus failā\n"
					+ "Nolasīt no faila\n"
					+ "Apturēt",
					"Izvēle",
					JOptionPane.QUESTION_MESSAGE);
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
				break;
			case "Nolasīt no faila":
				break;
			}
			if(izvele.equalsIgnoreCase("Apturēt")) break;
		}
	}
}