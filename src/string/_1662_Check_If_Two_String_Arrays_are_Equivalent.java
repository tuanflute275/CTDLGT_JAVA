package string;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1 = "";
        String r2 = "";
        
        for (String s : word1) {
			r1 += s;
		}
        for (String s : word2) {
			r2 += s;
		}
    	return r1.equals(r2);
    }
    
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
    	StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (String s : word1) {
			sb1.append(s);
		}
        for (String s : word2) {
			sb2.append(s);
		}
    	return sb1.toString().equals(sb2.toString());
    }
    
    public static boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
    	return String.join("", word1).equals(String.join("", word2));
    }
	
	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		boolean result = arrayStringsAreEqual2(word1, word2);
		System.out.println("Result => "+result);
	}
}
