package prof;

public class Personne {
	private String Nom;
	private String Prenom;
	
	public Personne(String Pre, String No) {
		Prenom = Pre;
		Nom = No;
	}
	public Personne(String Pre) {
		Prenom = Pre;
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Nom;
	}

	public String toString() {
		if (Nom == null) {
			return "Prenom = " + Prenom;
		}
		else {
			return "Prenom = " + Prenom + ", Nom = " + Nom;
		}
	}

}
