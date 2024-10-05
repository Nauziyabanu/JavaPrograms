package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfEachElementInString {

	public static void main(String[] args) {

		String s = "123Naaz1";
		int n = s.length();

		char[] c = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			char key = c[i];
			if (map.containsKey(c[i])) {
				map.put(key, map.get(key)+1);
			}
			else
				map.put(key, 1);
		}
			
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println("Frequncy of :"+ entry.getKey()+" : "+entry.getValue());
		}
	}
}
