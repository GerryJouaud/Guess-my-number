package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws java.io.IOException {
		int nombreHasard;
		int nombreTentatives = 0;
		nombreHasard = (int) (100 * Math.random());
		int guessNombre;
		Scanner inputUtilisateur = new Scanner(System.in);
		System.out.println("J'ai choisi un nombre compris entre 0 et 100, parviendrez-vous à le trouver ?");
		System.out.print("Saisissez un nombre: ");

		do {
			guessNombre = inputUtilisateur.nextInt();
			nombreTentatives++;
			if (guessNombre != nombreHasard) {
				System.out.println("Raté, essayes encore !");
				if (guessNombre > nombreHasard) {
					System.out.println("Ton nombre est trop élevé !");
				}
				if (guessNombre < nombreHasard) {
					System.out.println("Ton nombre est trop bas !");
				}
			}
		} while (guessNombre != nombreHasard);

		if (guessNombre == nombreHasard)

		{
			System.out.println("Félicitations tu as trouvé mon nombre, c'était: " + nombreHasard);
			System.out.println("Il t'a fallu " + nombreTentatives + " tentatives !");
		}

	}

}
