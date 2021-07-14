package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static void main(String[] args) {
		IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
		System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));
	}
	
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (map.containsKey(c1) && map.get(c1) != c2 || !map.containsKey(c1) && map.containsValue(c2)) {
				return false;
			} else {
				map.put(c1, c2);
			}
		}
		return true;
	}
}
