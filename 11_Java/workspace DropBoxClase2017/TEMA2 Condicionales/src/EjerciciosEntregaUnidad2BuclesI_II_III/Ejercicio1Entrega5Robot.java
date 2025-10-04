/**
 * 
 */
package EjerciciosEntregaUnidad2BuclesI_II_III;

import java.util.Scanner;

/**
 * @author Ramon
 *
 */
public class Ejercicio1Entrega5Robot {

	/**
	 * PDF-Ejercicios I Estructura de Condicionales
	 * Ejercicio 5 Entrega Profesor: Carlos Sogort
	 */
	public static void main(String[] args) {
		// 5.- Diseña una aplicación donde un usuario pueda elegir el idioma
		// de una frase de saludo. En primer
		// lugar se mostrará un menú:
		// (1) Francés
		// (2) Español
		// (3) Inglés
		// (4) Alemán
		// (5) Italiano
		// El usuario escribirá un número entero entre 1 y 4 para señalar qué
		// opción quiere y, a continuación,
		// aparecerá la frase "Buenos días" en el idioma que corresponda (puedes
		// usar Google translator). Si
		// escribe otro número, el mensaje se mostrará en español.
		// Utiliza la instrucción switch.

		Scanner sc = new Scanner(System.in);
		// Carlos tiene todo lo que tu pides, pero le he dado un enfoque desde
		// un punto de vista de un robot.

		int opc = 0;

		try {

			while (opc < 1 || opc > 5) {
				System.out.println("Inicio de programa");
				System.out
						.println("Todos los derechos recervados << © copyright 2016 >>");
				System.out.println("Elija el idioma deseado: ");
				System.out.println("************************");
				System.out
						.println("(1) Francés \n(2) Español \n(3) Inglés \n(4) Alemán \n(5) Italiano");
				opc = sc.nextInt();

				switch (opc) {
				case 1:

					System.out
							.println("langue française sélectionnée \"Frances\"");
					System.out.println("Bonjour, comment votre journée?");
					System.out.println("Bien = 1 ou Mal = 2");
					opc = sc.nextInt();

					while (opc < 1 || opc > 2) {
						System.out
								.println("Je ne comprenais pas monsieur, Bien = 1 ou Mal = 2.");
						opc = sc.nextInt();
					}
					if (opc == 1) {

						System.out
								.println("Je suis heureux d'être un bon monsieur jour.");
					} else if (opc == 2) {

						System.out
								.println("Je pense que votre journée se passe mal monsieur, espérer améliorer");
						System.out
								.println("Je peux faire pour vous aider monsieur?");
						System.out.println("Options\n=======");
						System.out.println("1-Dites-moi une blague");
						System.out.println("2-Laissez-moi me reposer");
						opc = sc.nextInt();
						if (opc == 1) {
							System.out
									.println("une femme et un robot est un lit de maître et la femme raconte sa voix séduisante, \n"
											+ "que je faisais de mon robot de fuie incroyable, ce que le robot répond, \n"
											+ "scan des infections virales entières détectés 57 ha ha ha ha. ");
							System.out.println("Fin du programme.");
						} else if (opc == 2) {
							System.out
									.println("Monsieur Bon, désolé pour le désagrément");
							System.out.println("Fin du programme.");
						}

					}
					break;

				case 2:

					System.out.println("Idioma seleccionado \"Español\"");
					System.out.println("Buenos días, Como va su dia señor?");
					System.out.println("Bien = 1 o Mal = 2");
					opc = sc.nextInt();

					while (opc < 1 || opc > 2) {
						System.out
								.println("No le he entendido señor Bien = 1 o Mal = 2");
						opc = sc.nextInt();
					}
					if (opc == 1) {

						System.out
								.println("Me alegro de que sea un buen día señor.");
					} else if (opc == 2) {

						System.out
								.println("Siento que su día vaya mal señor, espero que mejore");
						System.out
								.println("Que puedo hacer para ayudarle señor?");
						System.out.println("Opciones" + "\n========");
						System.out.println("1-Cuentame un chiste");
						System.out.println("2-Dejame descansar");
						opc = sc.nextInt();
						if (opc == 1) {
							System.out
									.println("Se ve una mujer y un robot en una cama señor y la mujer le dice con voz seductora,\n "
											+ "eso que me hiciste fue increible mi robot,\n "
											+ "a lo que el robot responde, escaneo de virus completo, 57 infecciones detectadas ja ja ja ja. ");
							System.out.println("Fin del programa.");
						} else if (opc == 2) {
							System.out
									.println("Muy bien señor, disculpe las molestias");
							System.out.println("Fin del programa.");
						}

					}
					break;
				case 3:
					System.out.println("French language selected \"English\"");
					System.out.println("Good morning, how your day?");
					System.out.println("right = 1 or wrong = 2");
					opc = sc.nextInt();

					while (opc < 1 || opc > 2) {
						System.out
								.println("I did not understand sir, right = 1 or wrong = 2.");
						opc = sc.nextInt();
					}
					if (opc == 1) {

						System.out.println("I'm glad to be a good day sir.");
					} else if (opc == 2) {

						System.out
								.println("I feel that your day goes wrong sir, hope to improve");
						System.out.println("I can do to help you sir?");
						System.out.println("Options\n=======");
						System.out.println("1-Tell me a joke");
						System.out.println("2-Let me rest");
						opc = sc.nextInt();
						if (opc == 1) {
							System.out
									.println("a woman and a robot is a master bed and the woman tells her seductive voice, "
											+ "\nthat I did my robot fuie incredible, what the robot responds full virus scan, "
											+ "\n57 detected infections. ja ja ja ");
							System.out.println("End of program.");
						} else if (opc == 2) {
							System.out
									.println("Okay sir, sorry for the inconvenience");
							System.out.println("End of program.");
						}

					}
					break;

				case 4:
					System.out
							.println("Französisch Sprache ausgewählt \"Aleman\"");
					System.out.println("Guten Morgen, wie Sie Ihren Tag?");
					System.out.println("richtig = 1 oder falsch = 2");
					opc = sc.nextInt();

					while (opc < 1 || opc > 2) {
						System.out
								.println("Ich habe nicht mein Herr, richtig oder falsch zu verstehen. richtig = 1 oder falsch = 2");
						opc = sc.nextInt();
					}
					if (opc == 1) {

						System.out.println("Ich bin froh, ein guter Tag Sir.");
					} else if (opc == 2) {

						System.out
								.println("Ich glaube, dass Sie den Tag falsch Herr geht, hoffen zu verbessern");
						System.out
								.println("Das kann ich Ihnen Herr zu helfen?");
						System.out.println("Optionen");
						System.out.println("1-Sagen Sie mir einen Witz");
						System.out.println("2-Lassen Sie mich ruhen");
						opc = sc.nextInt();
						if (opc == 1) {
							System.out
									.println("eine Frau und ein Roboter ist ein Master-Bett und die Frau erzählt ihre verführerische Stimme, "
											+ "\ndass ich meinen Roboter fuie unglaublich tat, was der Roboter die vollständige Virenuntersuchung , "
											+ "\n57 erkannten Infektionen reagiert ja ja ja. ");
							System.out.println("Programmende.");
						} else if (opc == 2) {
							System.out
									.println("Okay, Sir, sorry für die Unannehmlichkeiten");
							System.out.println("Programmende.");
						}

					}
					break;
				case 5:
					System.out
							.println("lingua francese selezionata \"Italiano\"");
					System.out.println("Buon giorno, come la vostra giornata?");
					System.out.println("giusto = 1 o sbagliato = 2");
					opc = sc.nextInt();

					while (opc < 1 || opc > 2) {
						System.out
								.println("Non ho capito signore, giusto = 1 o sbagliato = 2.");
						opc = sc.nextInt();
					}
					if (opc == 1) {

						System.out
								.println("Sono contento di essere un buon giorno signore.");
					} else if (opc == 2) {

						System.out
								.println("Sento che la giornata va sir male, la speranza di migliorare la");
						System.out
								.println("Che posso fare per aiutare signore?");
						System.out.println("Opzioni \n=======");
						System.out.println("1-Dimmi una barzelletta");
						System.out.println("2-Lasciatemi riposare");
						opc = sc.nextInt();
						if (opc == 1) {
							System.out
									.println("una donna e un robot è un letto matrimoniale e la donna racconta la sua voce seducente, "
											+ "\nche ho fatto il mio robot fuie incredibile, ciò che il robot risponde scansione completa del virus, "
											+ "\n57 infezioni rilevate. ja ja ja ");
							System.out.println("Fine del programma.");

						} else if (opc == 2) {
							System.out
									.println("Sir Va bene, mi spiace per l'inconveniente");
							System.out.println("Fine del programma.");

						}

					}
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Parametro incorrecto");
			System.out.println("Fin del programa.");
			System.out
					.println("Todos los derechos recervados <<  © copyright 2016 >>");
		}

		sc.close();

	}
}
