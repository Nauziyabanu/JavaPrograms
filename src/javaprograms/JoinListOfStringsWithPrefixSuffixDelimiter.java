package javaprograms;

import java.util.List;

public class JoinListOfStringsWithPrefixSuffixDelimiter {

	public static void main(String[] args) {

		List<String> strings = List.of("apple", "banana", "cherry");

		String result = joinWithPrefixSuffix(strings, ", ", "[", "]");

		System.out.println(result);
	}

	public static String joinWithPrefixSuffix
	(List<String> strings, String delimiter, String prefix, String suffix) {
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < strings.size(); i++) {
			sb.append(prefix).append(strings.get(i)).append(suffix);

			if (i < strings.size() - 1) {
				sb.append(delimiter);
			}
		}

		return sb.toString();
	}
}
