package Admin_Portal;

import org.seleniumhq.jetty9.util.log.LoggerLog;




import org.testng.Assert;
import org.testng.annotations.Test;

import CommonTests.CommonTests1; 




/*
 * No need of this separate class, AdminPortalTest2.java can be modified and it has all the 3 scenarios called
 * 
 */

 public class AdminPortalTest1 extends CommonTests1  {

  @Test
  public void Scenario1() {
	  
	   String Methodname = new Object(){}.getClass().getEnclosingMethod().getName(); 
	
		try {
			
			String Classname = getClass().getSimpleName();
            System.out.println("start of method : " + Classname);
            
            /*
             * 
             * Call to loginasAdmin will fail since methods which are called inside the method are missing
             * 
             * 
             */
            
            loginasAdmin();
            
            /*
             *  As per the requirement, in scenario 1. The code should cover only the creation of status and priority creation. 
             *  But here after creation, deletion method is called
             * 
             * 
             * 
             */
            
            
            TestCase1();
            TestCase3();
				
		} 
		
		catch (Throwable e) {
			e.printStackTrace();
			Assert.fail("Error in "+ Methodname +" : "+ e.getMessage());
		}
		
	
  } 
  
 }
 