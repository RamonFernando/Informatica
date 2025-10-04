/**
 * 
 */
package juzgados;

/**
 * @author Ramon Examen3
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Juzgado");
		System.out.println("-------");
		Juez j1 = new Juez("3782379212k", "Carlos", "Bsogort");
		System.out.println(j1.toString());
		System.out.println("----------------------");
		Sentencia s1 = new Sentencia(2, "Perpetua", "Asesinato", j1);
		Sentencia s2 = new Sentencia(3, "Condicional","Buen Comportamiento", j1);
		System.out.println(s1.toString());
		System.out.println("----------------------");
		Juzgado jz1 = new Juzgado("Navarra", 3);
		System.out.println("Lista de Sentencias");
		// jz1.listaSentencias(j1);
		System.out.println();
		// jz1.addSentencias(s3);
		// jz1.delSentencias(numSentencias);
	    System.out.println("Fin del Programa");
	}

}