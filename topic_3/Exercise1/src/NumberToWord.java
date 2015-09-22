
public class NumberToWord  

{
    private String[] firstNames = {
        "",
        " thousand",
        " million",
        " billion",
    };
    
    private String[] secondNames = {
        "",
        " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };
    
    private String[] numbers = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    
    private String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numbers[number % 100];
            number = number/100;
        }
        else {
            current = numbers[number % 10];
            number = number/10;
            
            current = secondNames[number % 10] + current;
            number = number/10;
        }
        if (number == 0) return current;
        return numbers[number] + " hundred" + current;
    }
    
    public String convert(int number) {

        if (number == 0) { 
        	return "zero"; }
        else {
        
        String prefix = "";
        String current = "";
        
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + firstNames[place] + current;
            }
            place++;
            number = number/1000;
        } while (number > 0);
        
        return current;     
        }
    }
    public static void main(String[] args) {
    	int number=2523;
        NumberToWord num = new NumberToWord();
        System.out.println(number+": " + num.convert(number));
    }
}

