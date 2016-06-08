package fr.sg.katasgcib;

/**
 * Class for Kata SGCIB
 * 
 * @author Fabien Davaut
 * 
 * Ennoncé:
 * 
 * Écrivez un programme qui affiche les nombres de 1 à 100. Un nombre par ligne. Respectez les règles suivantes :
 *   . Si le nombre est divisible par 3 ou contient 3, écrire “Foo” à la place de 3.
 *   . Si le nombre est divisible par 5 ou contient 5, écrire “Bar” à la place de 5.
 *   . Si le nombre est divisible par 7 ou contient 7, écrire “Qix” à la place de 7.
 *   
 * Voici un exemple de rendu 1 2 FooFoo 4 BarBar Foo QixQix 8 Foo Bar ...
 * 
 * Mise à jour : clarifications sur les règles
 *   . On regarde les diviseurs avant le contenu (ex: 51 -> FooBar)
 *   . On regarde le contenu dans l'ordre où il apparait (ex: 53 -> BarFoo)
 *   . On regarde les multiples dans l'ordre Foo, Bar puis Qix (ex: 21 -> FooQix)
 *   . 13 contient, 3 donc s'écrit, “Foo”
 *   . 15 est divisible par 3 et 5 et contient un 5 donc s'écrit “FooBarBar”
 *   . 33 contient deux fois 3 et est divisible par 3 donc s'écrit “FooFooFoo”
 * 
 */
public class KataSGCIB {

	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";

	private static final String[] SUBSTITUTION_PATTERNS = { "", "", "", FOO, "", BAR, "", QIX, "", "" };

	private static final int[] CONTROL_NUMBERS = { 3, 5, 7 };

	public static void main(String[] args) {

		KataSGCIB myKataSGCIB = new KataSGCIB();

		for (int i = 1; i <= 100; i++) {
			System.out.println(myKataSGCIB.execute(i));
		}

	}

	/**
	 * Apply the defined rules on an integer
	 * 
	 * @param value
	 *            An integer on which apply the roles
	 * @return A string result
	 */
	public String execute(int value) {

		String result = new String("");
		String strValue = Integer.toString(value);

		/* Substitute by divider */
		result += this.substituteByDivider(value);

		/* Substitute by content */
		result += this.substituteByContent(strValue);

		if (result.isEmpty())
			/* it's empty, so put the value */ 
			return strValue;

		return result;
	}

	/**
	 * Substitute by Divider rules
	 * 
	 * @param value
	 *            - A string on which apply the Divider rules
	 * @return
	 */
	private String substituteByDivider(int value) {

		String result = new String();

		for (int i = 0; i < CONTROL_NUMBERS.length; i++) {

			int number = CONTROL_NUMBERS[i];

			if (value % number == 0) {

				result += SUBSTITUTION_PATTERNS[number];
			}
		}

		return result;
	}

	/**
	 * Substitute by Content rules
	 * 
	 * @param value
	 *            - A string on which apply the Content rules
	 * @return A string
	 */
	private String substituteByContent(String value) {

		String result = new String();

		for (char c : value.toCharArray()) {

			int index = Character.getNumericValue(c);
			result += SUBSTITUTION_PATTERNS[index];
		}

		return result;
	}
}
