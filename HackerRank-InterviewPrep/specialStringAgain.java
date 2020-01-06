
public class specialStringAgain {

	static long substrCount(String s, int n) {
		long count = 0;
		for (int i = 0; i < n; i++) {
			//System.out.println("in for");
			// Find repetitive substring count
			int nextIndex = i + 1;
			while (nextIndex < n) {
				if (s.charAt(i) == s.charAt(nextIndex)) {
					count++;
					//System.out.println("in while 1");
					nextIndex++;
				} else {
					break;
				}
				
			}
			// Find palindrome substrings
			int firstCharIndex = i;
			int secondCharIndex = i + 1;
			if (secondCharIndex < n) {
				if (s.charAt(firstCharIndex) != s.charAt(secondCharIndex)) {
					int pivot = secondCharIndex;
					secondCharIndex++;
					while ((secondCharIndex < n) && (firstCharIndex >= 0)) {
						if (s.charAt(firstCharIndex) == s.charAt(secondCharIndex)&&s.charAt(pivot-1) == s.charAt(secondCharIndex)) {
							count++;
							firstCharIndex--;
							secondCharIndex++;
							//System.out.println("in while 2");
						}
						else {
							break;
						}
						//System.out.println("in while 2");
					}
				}
			}
			

		}

		return count + n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mnonopoo";
		int n = s.length();

		System.out.println(substrCount(s, n));
	}

}
