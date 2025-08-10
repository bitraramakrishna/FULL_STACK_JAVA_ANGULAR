package com.wipro.exception;

class InvalidMonthException extends Exception 
{
    public InvalidMonthException(String message) {
        super(message);
    }
}

class MonthChecker 
{
    public static void checkMonth(int month) throws InvalidMonthException 
    {
        if (month < 1 || month > 12) 
        {
            throw new InvalidMonthException("Invalid month: " + month);
        }
        System.out.println("Month " + month + " is valid.");
    }
}

public class Test 
{
	
	 public static void main(String[] args) {
	        try {
	            MonthChecker.checkMonth(15);
	        } 
	        catch (InvalidMonthException e) 
	        {
	            System.err.println("Caught the exception: " + e.getMessage());
	        }

	        try 
	        {
	            MonthChecker.checkMonth(5);
	        } 
	        catch (InvalidMonthException e) 
	        {
	            System.err.println("Caught the exception: " + e.getMessage());
	        }
	    }

}
