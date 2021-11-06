import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Enter input");
			Scanner sc = new Scanner(System.in);
			String text = sc.nextLine();
			String piglatin = Main.wordToLatin(text);
			System.out.println(piglatin);
		}else {
			for(String word : args) {
				String piglatin = Main.wordToLatin(word);
				System.out.println(piglatin);
			}
		}
		
	}
	
	private static String wordToLatin(String word) {
		
		String latin = "";
		boolean isvowel  = Main.firstCharisVowel(word.charAt(0));
		if(isvowel) {
			latin += word + "ay";
		}
		else {
			String consonantcluster = Main.getConsonantCluster(word);
			latin += word.substring(word.indexOf(consonantcluster) +  consonantcluster.length()) + consonantcluster + "ay";
		}
		return latin;
	}
	private static String getConsonantCluster(String word) {
		String consonantcluster = "";
		for(int i = 0; i < word.length(); i++) {
			char current_char = word.charAt(i);
			if(Main.firstCharisVowel(current_char)) {
				break;
			}else {
				consonantcluster += current_char;
			}
		}
		return consonantcluster;
	}
	private static boolean firstCharisVowel(char firstcharacter) {
			
			boolean isvowel = false;
			String vowels = "aeiou";
			for(int i = 0; i < vowels.length(); i++) {
				char character = vowels.charAt(i);
				if(character == firstcharacter) {
					isvowel = true;
					break;
				}
			}
					
			return isvowel;
	}
}