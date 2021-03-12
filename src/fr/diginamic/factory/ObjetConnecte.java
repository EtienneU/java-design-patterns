/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author EtienneUrbano
 *
 */
public abstract class ObjetConnecte {
	
	TypeObjetConnecte type;
	protected int limiteVolts;

	public ObjetConnecte(TypeObjetConnecte type, int limiteVolts) {
		this.type = type;
		this.limiteVolts = limiteVolts;
	}

	@Override
	public String toString() {
		return type.toString().replaceAll("_", " ").toLowerCase() + " - "+ limiteVolts + "V max";
	}
	
}
