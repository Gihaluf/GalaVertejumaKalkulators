package pakotne;

public class Kriteriji {
	static int maxSvars, sk;
	static double atlSvars;
	
	static void Svars() {
		// Definē kritērijus
		maxSvars = 100;
		sk = 1;
			for(int i=0; i<Ievade.kriteriji.length; i++) {
				Ievade.kriteriji[i] = Ievade.virknesParbaude("Ievadi "+(i+1)+". kritēriju");
					 
				// Norāda katra kritērija svaru
				do {
					Ievade.kriterijaSvars[i] = Ievade.skaitlaParbaude("Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")", 5);
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
			}
	}
	static void vert() {
		// Norāda vērtējumu kādu ieguvis katrs audzēknis par katru kritēriju
		for(int i=0; i<Ievade.kriterijaVertejums.length; i++) {
			for(int j=0; j<Ievade.kriterijaVertejums[i].length; j++) {
				do {
					Ievade.kriterijaVertejums[i][j] = 
							Ievade.skaitlaParbaude("Ievadi "+Ievade.studenti[i]+" vērtējumu par kritēriju "+Ievade.kriteriji[j], 1);
						
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