
public class Q19_LengthOfTheLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "2010-2011 sezonu şampiyonu Trabzonspor";
		System.out.print(lengthOfLastWord(sentence));
	}
	
	public static int lengthOfLastWord(String sentence) {
        sentence = sentence.trim();
        int result = 0;

        for(int i = sentence.length() - 1; i >= 0; i--) {
            if(sentence.charAt(i) != ' ') {
                result++;
            }
            if( sentence.charAt(i) == ' ') {
                break;
            }

        }
        return result;
    }

}
