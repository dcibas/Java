import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		Long emptyElements = strList
				.stream()
				.filter(empt -> empt.equals(""))
				.count();
		
		System.out.println("All empty elements: " + emptyElements);
		
		Long wordLengthIsLongerThan3 = strList
				.stream()
				.filter(word -> word.length() > 3)
				.count();
		
		System.out.println("All words whose length is loger than 3: " + wordLengthIsLongerThan3);
		
		Long wordsStartingWithA = strList
				.stream()
				.filter(word -> word.startsWith("a"))
				.count();
		
		System.out.println("All elements which start with letter a: " + wordsStartingWithA);
		
		List<String> nonEmptyWords = strList
				.stream()
				.filter(word -> ! word.isBlank())
				.collect(Collectors.toList());
		
		System.out.println("Elements that are not blank: " + nonEmptyWords);
		
		Long wordLengthIsLongerThan2 = strList
				.stream()
				.filter(word -> word.length() > 2)
				.count();
		
		System.out.println("All elements which start with letter a: " + wordLengthIsLongerThan2);
		
		List<String> CapitalLetters = strList
				 .stream()
				 .map(word -> word.toUpperCase())
                 .collect(Collectors.toList());
				
		System.out.println("Elements capitalized: " + CapitalLetters);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		List<Integer> distinct = numbers
				.stream() 
				.map(i -> i*i) 
				.distinct() 
				.collect(Collectors.toList());
		
		System.out.println("Distinct numbers: " + distinct);

		boolean ExistsElementWithLength4 = strList
				.stream()
				.anyMatch(word -> word.length() == 4);
		
		System.out.println(ExistsElementWithLength4);
		
		Long distinctElementsCount = strList
				.stream()
				.distinct()
				.count();
		System.out.println(distinctElementsCount);
		
		List<String> orderedList = strList
				.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(orderedList);

		List<String> orderedListReversed = strList
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(orderedListReversed);
		
		List<Integer> numbersSquares = numbers
				.stream()
				.map(number -> number = number*number)
				.collect(Collectors.toList());
		
		System.out.println(numbersSquares);
		
		boolean allNumbersHigherThan5 = numbers
				.stream()
				.allMatch(number -> number > 5);
		
		System.out.println(allNumbersHigherThan5);
		
		List<Integer> evenAndLargerThan5Numbers = numbers
				.stream()
				.filter(number -> number > 5 && number % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(evenAndLargerThan5Numbers);
		
		Optional<Integer> largestNumber = numbers
				.stream()
				.sorted(Comparator.reverseOrder())
				.findFirst();
		
		System.out.println(largestNumber);
		
		Optional<Integer> lowestNumber = numbers
				.stream()
				.sorted()
				.findFirst();
		
		System.out.println(lowestNumber);
		
		List<String> numberString = numbers
				.stream()
				.map(number -> "Number " + number.toString())
				.collect(Collectors.toList());
		
		System.out.println(numberString);

	}

}
