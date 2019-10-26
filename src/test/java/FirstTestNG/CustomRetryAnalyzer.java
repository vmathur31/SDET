package FirstTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer {

	 
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
	    
	        
	        int counter = 0;
			int retryLimit = 3;
			if(counter < retryLimit)
	        {
	            System.out.println("*Retry count*"+counter);
	            counter++;
	            return true;
	        }
	        return false;
	    }
	    
	}


