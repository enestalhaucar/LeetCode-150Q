
public class Q18_IntegertoRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1193;
		System.out.print(intToRoman(num));

	}
	
	public static String intToRoman(int num) {
        String ones []={"" ,"I" ,"II","III","IV","V","VI","VII","VIII","IX"};
        String tens []={"" ,"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hun []={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thn []={"","M","MM","MMM"}; // We do not continue because of constraint.

        return thn[num/1000]+hun[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];

    }

}
