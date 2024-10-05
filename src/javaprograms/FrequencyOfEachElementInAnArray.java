package javaprograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfEachElementInAnArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 1, 4, 3, 2 };
		int n = a.length;
		
//		List<Integer> list=List.of(1,2,3);
//		System.out.println(list);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			
			int key=a[i];
			
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else
				map.put(key, 1);
		}

//		int count;
//
//		for (int i = 0; i < n; i++) {
//			count = 0;
//			for (int j = 0; j < n; j++) {
//				if (a[i] == a[j]) {
//					count++;
//				}
//			}
//
//			map.put(a[i], count);
//		}

		System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Frequency Of "+entry.getKey() + ":" + entry.getValue());
		}
	}
}
