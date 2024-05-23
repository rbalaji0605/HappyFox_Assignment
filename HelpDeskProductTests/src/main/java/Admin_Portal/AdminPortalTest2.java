package Admin_Portal;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonTests.CommonTests1;
import CustomerPortal.SupportPortalPage;

public class AdminPortalTest2 extends CommonTests1 {
  
  @Test
  public void Scenario2() {
	  
	  String Methodname = new Object(){}.getClass().getEnclosingMethod().getName(); 
		
		try {
			
			String Classname = getClass().getSimpleName();
            System.out.println("start of method : " + Classname);
            
            /*
             * Scenario 1, 2 & 3 can be defined in a single class file, and proper testng setup and teardown actions should be called
             * here loginasAdmin is called separately in two different test cases class
             * 
             * 
             */
            /*
             * 
             * Call to loginasAdmin will fail since methods which are called inside the method are missing
             * 
             * 
             */
            
            loginasAdmin();
            
            /*
             *  As per the requirement, in scenario 2. The code should cover only the creation of ticket with default status and priority and 
             *  replying to it using canned action
             *  But here after all the scenarios has been called. 
             *  Remove AdminPortalTest1.java file and modify this class with test methods name with the scenario description and define setup and teardown methods here
             * 
             * 
             */
            
            TestCase1();
            TestCase2();
            TestCase3();
              
		}
		
		catch(Throwable t) {
			 t.printStackTrace();
			 Assert.fail("Error in "+ Methodname +" : "+ t.getMessage());
		}
  }
}
