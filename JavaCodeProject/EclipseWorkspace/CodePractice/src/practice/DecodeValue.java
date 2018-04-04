package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecodeValue {
	
	public static int decode(String key, String code) {
		if(key.length()!=10)
			return -1;
		
		Map<Character,Integer> keyMap = new HashMap<>();
		
		for(int i =0;i<key.length();i++) {
			keyMap.put(key.charAt(i), (i+1)%10);
		}
		
		String value="";
		for(int i=0;i<code.length();i++) {
			if(keyMap.containsKey(code.charAt(i))) {
				value += keyMap.get(code.charAt(i));
			}
		}
		
		
		return Integer.parseInt(value);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String key = in.next();
		String code = in.next();
		
		System.out.println(decode(key,code));
	}

}
