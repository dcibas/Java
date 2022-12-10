import java.util.ArrayList;
import java.util.Arrays;

public class Metodai {

		public Integer smallestNumber(ArrayList<Integer> numbers) {
		
		Integer smallestNumber = numbers.get(0);
		
		for(Integer number : numbers) {
			
			if(number < smallestNumber) {
				smallestNumber = number;
				
			}
		}
		
		return smallestNumber;
		
	}
	
		public Double averageNumber(ArrayList<Integer> numbers) {
		
		Double sum = 0.0;
		
		for(int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		return sum / numbers.size();
		
	}
	
		public String middleCharacter(String word) {
			 
			 String character = "";
			 
			 if(word.length() % 2 == 0) {
				 character = character.concat(String.valueOf(word.charAt(word.length() / 2 - 1)).concat(String.valueOf(word.charAt(word.length()/2))));
			 }
			 else {
				 character = String.valueOf(word.charAt(word.length() / 2));
			 }
			 
			 return character;
			 
	 }
		
		 
		public Integer numberOfVowels(String word) {
			 
			 Integer sum = 0;
			 
			 String wordLowerCase = word.toLowerCase();
			 
			 ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
			 
			 for(int i = 0; i < wordLowerCase.length(); i++) {
				 if(vowels.contains(wordLowerCase.charAt(i))) {
					 sum++;
				 }
					
			 }
			 
			return sum;	 
	}
	
}
