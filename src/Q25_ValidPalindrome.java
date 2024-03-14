
public class Q25_ValidPalindrome {

	public static void main(String[] args) {
		String sentence = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(sentence));	
	}
	


	public static boolean isPalindrome(String sentence) {
        String str = sentence.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String ans = sb.toString();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ans.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
