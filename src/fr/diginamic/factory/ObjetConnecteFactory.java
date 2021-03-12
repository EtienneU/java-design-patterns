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
		if (type.equals(TypeObjetConnecte.TELEPHONE_PORTABLE)) {
			return new TelephonePortable(limitVolts);
		} else if (type.equals(TypeObjetConnecte.TABLETTE)) {
			return new Tablette(limitVolts);
		} else if (type.equals(TypeObjetConnecte.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee(limitVolts);
		} else {
			return null;
		}
		
	}

}
