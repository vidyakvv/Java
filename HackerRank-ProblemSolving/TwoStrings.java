import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {
	public static void main(String[] args) {
		String s1 = "none";
		String s2 = "vbm";

		Set<Character> s1set = new HashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			s1set.add(s1.charAt(i));
		}
		String returnMsg = "No";
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (s1set.contains(ch)) {
				returnMsg = "Yes";
				break;
			}
		}

		System.out.println(returnMsg);

	}
}
