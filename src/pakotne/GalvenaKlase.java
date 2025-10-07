package pakotne;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class GalvenaKlase {
	public static DecimalFormat df = new DecimalFormat("0.#");
	
	public static void main(String[] args) {
		String izvele;
		do{
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
			case "1":
				Ievade.Audzekni();
				Ievade.Vardi();
				break;
			case "2":
				Ievade.Vertesana();
				Kriteriji.Svars();
				break;
			case "3":
				Kriteriji.vert();
				break;
			case "4":
				//nav
				//Labot(1);
				break;
			case "5":
				//nav
				//Labot(2);
				break;
			case "6":
				//nav
				//Labot(3);
				break;
			case "7":
				Kriteriji.Aprekins();
				break;
			case "8":
				Izvade.Izvada();
				break;
			case "9":
				Izvade.nolasit();
				break;
			}
		}while(!izvele.equalsIgnoreCase("x"));
	}
	
	/*
	static void Labot(int sk) {
		switch (sk) {
		case 1:
		JOptionPane.showInputDialog(null,
				"Kuru kritēriju vēlaties izlabot?"
				+Ievade.kriteriji, "Izvēle",
				JOptionPane.QUESTION_MESSAGE);
		break;
		case 2:
			JOptionPane.showInputDialog(null,
					"Kuru kritērija svaru vēlaties izlabot?\n"
					+Ievade.kriterijaSvars, "Izvēle",
					JOptionPane.QUESTION_MESSAGE);
			break;
		case 3:
			JOptionPane.showInputDialog(null,
					"Kuru vērtējumu vēlaties izlabot?"
					+Ievade.kriterijaVertejums, "Izvēle",
					JOptionPane.QUESTION_MESSAGE);
			break;
	}
}*/
}