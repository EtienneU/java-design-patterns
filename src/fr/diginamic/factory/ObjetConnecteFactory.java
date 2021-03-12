/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author EtienneUrbano
 *
 */
public class ObjetConnecteFactory {
	
	public static ObjetConnecte getInstance(TypeObjetConnecte type, int limitVolts) {
		ObjetConnecte objet = null;
		if (type == null) {
			// choix arbitraire
			objet = new TelephonePortable(limitVolts);
		} else if (type.equals(TypeObjetConnecte.TELEPHONE_PORTABLE)) {
			objet = new TelephonePortable(limitVolts);
		} else if (type.equals(TypeObjetConnecte.TABLETTE)) {
			objet = new Tablette(limitVolts);
		} else if (type.equals(TypeObjetConnecte.ENCEINTE_CONNECTEE)) {
			objet = new EnceinteConnectee(limitVolts);
		} else {
			objet = null;
		}
		return objet;
	}

}
