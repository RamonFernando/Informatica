/**
 * 
 */
package Condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejer8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vari= "computer";
		System.out.println("Como se dice ordenador en Ingles");
		vari = sc.nextLine();
		
		// if (vari.equals("computer")){
		// System.out.println("Has acertado!");
		// }else{
		// System.out.println("Has fallado!");
		// }
		
		vari = vari.equals("computer")? "Has acertado!": "Has fallado!";
		System.out.println(vari);
		
		
		
		sc.close();
	}

}
