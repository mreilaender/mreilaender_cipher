package src.reilaender.cipher;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

	public static String join(CharSequence[] arr, String delimit) {
		if (arr.length == 0) return null;
        StringBuilder sb = new StringBuilder();
        System.out.println("new StringBuilder successfull.\n");
        int i;
        for(i = 0; i < arr.length - 1; i++) {
        	
        	sb.append(arr[i].toString());
        	sb.append(delimit);
        }
        return sb.toString() + arr[i];
	}
	
	public static String repeat(CharSequence cseq, int count) {
		return "repeat() in Utilities";
	}
	
	public static List<Character> arrayToList(char[] a) {
		List<Character> list = new ArrayList<Character>();
	    return list;
	}
}