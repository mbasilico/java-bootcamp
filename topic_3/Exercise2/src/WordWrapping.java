import java.io.*;
import java.util.ArrayList;

public class WordWrapping {
	
	public static void wordParse(int len, String word){
		
		if (word.length()<=len)
			System.out.println(word);
		else { 
			String[] tokens = word.split(" ");
			for (String s : tokens) { 
				if (s.length()<=len) System.out.println(s);
				else outOfRange(len, s);
			}	
		}
	}
	
	public static void outOfRange(int len, String name){
		
		boolean b=true;
		int i=0;
		int j=len;
		System.out.println(name.substring(i,len));
		while (b==true){
			i=len;
			if ((name.length()-i)>j){ 
				len=len+j;
				System.out.println(name.substring(i,len));}
			else{
				System.out.println(name.substring(i,name.length()));
				b=false;
			}
		}
		
	}
	
	
	public static void main(String args[]){
		
		wordParse(1,"1 2 3 4 5 6 7 8 9 10");
	}

}