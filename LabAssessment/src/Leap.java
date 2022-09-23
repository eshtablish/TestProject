public class Leap {

public static void main(String[] args)
	    {
	        
	      int year = 1947;
	      int n = 19;
	      int count = 0;
	      while (count != n)
	   {
	    	  year = year + 1;
	        
	 
	            if ((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)) 
	            	count++;
	 
	           
	                System.out.println(year);
	            }
	        }
	    }
	
