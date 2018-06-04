package org.sublist.search;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		int[] inputArray = {1,2,3,4};
		int[] findArray = {2,3};
		
		boolean found = false;
		
		for (int i = 0; i < inputArray.length - 1; i++) {
		    
		    if(inputArray[i] == findArray[0]) {
		        for(int j = 0; j < findArray.length; j++) {
		            if((j+i < inputArray.length - 1) && inputArray[j + i] != findArray[j]) {
		                found = false;
		            } else {
		                found = true;
		            }
		        }
		    }
		    
		}
		
		System.out.println("found array?: " + found);
    }
}
