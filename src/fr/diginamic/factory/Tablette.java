/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author EtienneUrbano
 *
 */
public class Tablette extends ObjetConnecte {

	public Tablette(int limiteVolts) {
		super(TypeObjetConnecte.TABLETTE, limiteVolts);
	}
}
