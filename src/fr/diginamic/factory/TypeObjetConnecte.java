/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author EtienneUrbano
 *
 */
public enum TypeObjetConnecte {

	TELEPHONE_PORTABLE	("Telephone Portable"),
	TABLETTE			("Tablette"),
	ENCEINTE_CONNECTEE	("Enceinte conectee");
	
	private String type;
	
	private TypeObjetConnecte(String type) {
		this.type = type;
	}

}
