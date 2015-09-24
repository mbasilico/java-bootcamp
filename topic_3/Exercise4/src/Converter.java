import java.util.*;

public class Converter {
	
	public static int romanToInt(String num)
		{   
			Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		    ht.put('I',1);
		    ht.put('X',10);
		    ht.put('C',100);
		    ht.put('M',1000);
		    ht.put('V',5);
		    ht.put('L',50);
		    ht.put('D',500);
		    
		    int intNum=0;
		    int prev = 0;
		    for(int i = num.length()-1; i>=0 ; i--)
		    {
		            int temp = ht.get(num.charAt(i));
		            if(temp < prev)
		                intNum-=temp;
		            else
		                intNum+=temp;
		            prev = temp;
		    }
		    return intNum;
		}   
	
	public static String toRoman(int number){

	     TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	        map.put(1000, "M");
	        map.put(900, "CM");
	        map.put(500, "D");
	        map.put(400, "CD");
	        map.put(100, "C");
	        map.put(90, "XC");
	        map.put(50, "L");
	        map.put(40, "XL");
	        map.put(10, "X");
	        map.put(9, "IX");
	        map.put(5, "V");
	        map.put(4, "IV");
	        map.put(1, "I");

	        int l =  map.floorKey(number);
	        if ( number == l ) {
	            return map.get(number);
	        }
	        return map.get(l) + toRoman(number-l);
	    }

	
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("MXM"));
		System.out.println(toRoman(2015));
		
	}
}