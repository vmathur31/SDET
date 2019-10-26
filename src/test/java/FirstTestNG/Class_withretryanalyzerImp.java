package FirstTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(retryAnalyzer = FirstTestNG.CustomRetryAnalyzer.class)

public class Class_withretryanalyzerImp {
	static int i =0;
    
    public void TestOne()
    {      
       System.out.println("**Value of int retry attempt**"+i);
       i++;
       Assert.assertEquals(false, true);
    }
    
    @Test
    public void TestTwo()
    {
      // Assert.assertEquals(false, true);
    }


}
