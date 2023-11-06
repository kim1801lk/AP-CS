package Competition;
import java.util.*;
public class AS_INT_Sentences {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Parts of Speech that will contains the words from our input
		Map<String, ArrayList<String>> partsOfSpeech = new HashMap<String, ArrayList<String>>();
		partsOfSpeech.put("N", new ArrayList<String>());
		partsOfSpeech.put("C", new ArrayList<String>());
		partsOfSpeech.put("V", new ArrayList<String>());
		partsOfSpeech.put("J", new ArrayList<String>());
		partsOfSpeech.put("B", new ArrayList<String>());
		partsOfSpeech.put("P", new ArrayList<String>());
		
		Map<String, Integer> POS_Counter = new HashMap<String, Integer>();
		POS_Counter.put("N", 0);
		POS_Counter.put("C", 0);
		POS_Counter.put("V", 0);
		POS_Counter.put("J", 0);
		POS_Counter.put("B", 0);
		POS_Counter.put("P", 0);
		
		//storing the start and ending for each sentence type
		Map<String, ArrayList<String>> sentenceType = new HashMap<String, ArrayList<String>>();
		sentenceType.put("D", new ArrayList<String>(Arrays.asList("",".")));
		sentenceType.put("I", new ArrayList<String>(Arrays.asList("",".")));
		sentenceType.put("Q", new ArrayList<String>(Arrays.asList("What ","?")));
		sentenceType.put("E", new ArrayList<String>(Arrays.asList("","!")));
		
		
		int num = Integer.parseInt(in.nextLine());
		
		//iterating through each input line that provides the part of speech and the words that follow
		for(int i = 0; i < num; i++) {
			
			String[] input = in.nextLine().split(" ");
			//initializing the partsOfSpeech HashMap
			for(int j = 1; j < input.length; j++) {
				partsOfSpeech.get(input[0]).add(input[j]);
			}
			
		}
		
		//getting the last input line
		String[] phrases = in.nextLine().split(" ");
		
		ArrayList<String> result = new ArrayList<String>(); //stores every smaller sentence needed for the final result
		
		for(String phrase: phrases) {
			ArrayList<String> stringBlocks = new ArrayList<String>(); //list of words that will make up each sentence
			String prefix = "";
			String suffix = "";
			//going through each sentence acronym
			for(int i = 0; i < phrase.length(); i++) {
				if(i == 0) { //checking for sentence type
					prefix = sentenceType.get(phrase.substring(i,i+1)).get(0);
					suffix = sentenceType.get(phrase.substring(i,i+1)).get(1);
				}
				else {
					String letter = phrase.substring(i,i+1);
					if(partsOfSpeech.containsKey(letter)) { //checking if the letter is NOT an article: A, T
						stringBlocks.add(partsOfSpeech.get(letter).get(POS_Counter.get(letter)));
						POS_Counter.put(letter, (POS_Counter.get(letter)+1) % partsOfSpeech.get(letter).size());
					}
					else if(letter.equals("A")){
						String nextLetter = phrase.charAt(i+1)+"";
						if(isVowel(partsOfSpeech.get(nextLetter).get(POS_Counter.get(nextLetter)).charAt(0))) {
							stringBlocks.add("an");
						}
						else {
							stringBlocks.add("a");
						}
					}
					else {
						stringBlocks.add("the");
					}
				}
			}
			
			String sentence = prefix + String.join(" ", stringBlocks) + suffix;
			sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
			result.add(sentence);
			
		}
		
		System.out.println(String.join(" ", result));

	}
	
	public static boolean isVowel(char c) {
		
		//char c = str.charAt(0);
		return "aeiou".indexOf(c) != -1;
		
	}

}
