import java.util.*;

public class ControlStructure {

	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		String input;
		Scanner in = new Scanner(System.in);
        input = in.nextLine();
        int n = Integer.parseInt(input);
        in.close();            
        
        for(int i=1; i<=n; i++){
        	String dot = dots(n-i);
        	String num = nums(i, i);
        	System.out.print(dot);
        	System.out.print(num);
        	System.out.println();
        }
        
	}
	
	private static String dots(int value){
    	if(value <= 0){
    		return "";
    	}
   		String dotString = dots(value-1);
    	dotString = dotString + ".";
    	return dotString;
 	}
	
	private static String nums(int num, int value){
		if(value <= 0){
			return "";
		}
		String numString = nums(num, value-1);
		numString = numString + num;
		return numString;
	}
	

}

