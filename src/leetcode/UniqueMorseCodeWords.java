package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {

		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
				"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };
		List<String> list = new ArrayList<String>(); 
		for(String word:words){
			StringBuffer s = new StringBuffer();
			for(int i=0;i<word.length();i++){
				int index = word.charAt(i)-97;
				s.append(Morse[index]); 
			}
			if(!list.contains(s.toString())){
				list.add(s.toString());
			}
		}
		return list.size();
	}
}
