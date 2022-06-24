package palindroma;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
		System.out.print("Inserisci una parola:\n");
		String word = scan.next();
		String[] letter = word.split("");
		System.out.println(Arrays.toString(letter));
		
		String[] reverse = new String[letter.length];
		
		for (int i = 0; i < letter.length; i++) {
			reverse[i] = letter[letter.length - 1 - i];
		}
		
		System.out.println(Arrays.toString(reverse));
		
		String wordReversed = "";

		for (String l : reverse) {
			wordReversed += l;
		}
		System.out.println(wordReversed);
		
		if(word.equals(wordReversed)) {
			System.out.println("La parola inserita è palindroma");
		} else {
			System.out.println("La parola inserita non è palindroma");
		}
		
		}while(true);
		
	}
}
