
public class Numbers {

	final private  static String[] 
		units = {"Zero","One","Two","Three","Four",
		"Five","Six","Seven","Eight","Nine","Ten",
		"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
		"Sixteen","Seventeen","Eighteen","Nineteen"};
	final private static String[] 
		tens = {"","","Twenty","Thirty","Forty","Fifty",
		"Sixty","Seventy","Eighty","Ninety"};


	public static String convertNumber(int num) {
		//
		if( num < 20)  return units[num];
		if( num < 100) return tens[num/10] + ((num % 10 > 0)? " - " + convertNumber(num % 10):"");
		if( num < 1000) return units[num/100] + " Hundred" + ((num % 100 > 0)?" and " + convertNumber(num % 100):"");
		if( num < 1000000) return convertNumber(num / 1000) + " Thousand " + ((num % 1000 > 0)? " " + convertNumber(num % 1000):"") ;
		return convertNumber(num / 1000000) + " Million " + ((num % 1000000 > 0)? " " + convertNumber(num % 1000000):"") ;
	}

 public static void main(String[] args) {
	int number=2000000;
    Numbers num = new Numbers();
    System.out.println(number+": " + num.convertNumber(number));
}}