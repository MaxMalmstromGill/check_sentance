import java.util.Scanner;
public class Laboration2 {
	public static void main(String[] args) {
	    // Skapa ett Scanner-objekt för att läsa inmatning från användaren
	    Scanner scan = new Scanner(System.in);
	    

	    System.out.println("Skriv en mening:");
	    String sentence = scan.nextLine();
	    

	    System.out.println("Skriv in ett tecken:");
	    String charInput = scan.nextLine();
	    
	    // Se till att endast ett tecken matas in
	    while (charInput.length() != 1) {
	        System.out.println("Skriv in ett tecken:");
	        charInput = scan.nextLine();
	        }

	    // Antalet tecken i meningen
	    int countChar = sentence.length();

	    // Hämta det tecken som matats in av användaren
	    char character = charInput.charAt(0);

	    // Räkna antalet gånger tecknet förekommer i meningen
	    int count = 0;
	    for (int i = 0; i < sentence.length(); i++) {
	        if (sentence.charAt(i) == character) {
	            count += 1;
	        }
	    }

	    // Hitta index för det första förekomsten av tecknet i meningen
	    int first = sentence.indexOf(character);

	    // Hitta index för det sista förekomsten av tecknet i meningen
	    int last = sentence.lastIndexOf(character);

	    // Skriv ut resultatet
	    System.out.println("Meningen har totalt " + countChar + " tecken");
	    System.out.println("Tecknet " + character + " förekommer " + count + " gånger");
	    System.out.println("Första gången på indexplats " + first + " och sista gången på indexplats " + last);
	    
	    // stäng scanner-objektet
	    scan.close(); 
	}
}
