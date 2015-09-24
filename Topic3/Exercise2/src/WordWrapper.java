
public class WordWrapper {

	public static String wrapper(String text, int rows_lenght) {
		if (text.length() <= rows_lenght){
		return text;}
		else { 
			int nothing = text.lastIndexOf(" ", rows_lenght);
			
				if (nothing == -1){
				return text.substring(0 , rows_lenght) + " , " + wrapper(text.substring(rows_lenght) , rows_lenght);}
				else {
				return text.substring(0, nothing) + " , " + wrapper(text.substring(nothing + 1), rows_lenght);
				}
		}
	}
		public static void main(String[] args){
			System.out.println(wrapper("Lets make an example" , 3 ));
			
		}	
}