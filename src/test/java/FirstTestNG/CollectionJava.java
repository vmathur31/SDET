package FirstTestNG;

import java.util.*;

public class CollectionJava {
	
	public static ArrayList<Integer> myNumbers()    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(11);
        numbers.add(3);
        return(numbers);
     }
     

	public static void main(String[] args) {
		
		  ArrayList<Integer> arr = myNumbers();
	        for(int i=0;i<arr.size();i++)
	        {
	        	System.out.println(arr.get(i));
	            
	        }
		
		
	}

}
