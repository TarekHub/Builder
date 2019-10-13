package Builder;

public class Vendeur {
	protected ConstructeurLiassaVehicule constructeur;

	  public Vendeur(ConstructeurLiassaVehicule constructeur)
	  {
	    this.constructeur = constructeur;
	  }

	  public Liasse construit(String nomClient)
	  {
	    constructeur.construitBonDeCommande(nomClient);
	    constructeur.construitDemandeImmatriculation
	      (nomClient);
	    Liasse liasse = constructeur.resultat();
	    return liasse;
	  }
}
