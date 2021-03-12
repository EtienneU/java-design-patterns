/**
 * 
 */
package fr.diginamic.factory;

/**
 * @author EtienneUrbano
 *
 */
public class appFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjetConnecte tablette = ObjetConnecteFactory.getInstance(TypeObjetConnecte.TABLETTE, 12);
		ObjetConnecte telephone = ObjetConnecteFactory.getInstance(TypeObjetConnecte.TELEPHONE_PORTABLE, 12);
		ObjetConnecte enceinteCo = ObjetConnecteFactory.getInstance(TypeObjetConnecte.ENCEINTE_CONNECTEE, 24);

		System.out.println(tablette.toString() + "\n" + telephone.toString() + "\n" + enceinteCo.toString());
		
		
	}

}
