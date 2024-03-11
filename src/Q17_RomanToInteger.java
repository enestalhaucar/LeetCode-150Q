
public class Q17_RomanToInteger {

	public static void main(String[] args) {
		String s1 = "III";
		String s2 = "XV";
		String s3 = "MCMXCIV";
		String s4 = "LVIII";
		
		System.out.println(romanToInt(s1));
		System.out.println(romanToInt(s2));
		System.out.println(romanToInt(s3));
		System.out.println(romanToInt(s4));

	}
	public static int romanToInt(String s) {
        int result = 0;
        int now = translate(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            if ( now < next) {
                result -= now;
            }
            else {
                result += now;
            }
            now = next;
        }
        result += now;
        return result;
    }
	
	public static int translate(char s) {
        switch (s) {
            case 'I': 
                return 1;
            case 'V': 
                return 5;
            case 'X': 
                return 10;
            case 'L':
                return 50;
            case 'C': 
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: 
                return 0;

        }

    }

}
