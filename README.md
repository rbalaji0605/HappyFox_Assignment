# HappyFox_Assignment
Highlighted the code review in each file as a comment 


### Code quality suggestions ###

# 1 - Project Hierarchy/Structure is not maintained, should be improved like the below. main/java should contain all the main code and test/java should contain testcases and relevant data dependency file like excel, etc.,

  HappyFoxTestJava
          |->src/main/java
               |->**BaseClass**
                 |-> DriverInstance.class
               |->PageObjectModel
                 |->**AdminPortal**
                   |->FirstPage.Class
                   |->SecondPage.class
                   |->LoginPage.class
                 |->**CustomerPortal**
                   |->SupportPage.class
               |->UtilityClass
                   |->ReadPropertiesFile.java
                   |->CommonNavigationMethods.java
                   |->TakeScreenShot.java
          |->src/test/java
                |->TestCases
                  |->AdminTest
                    |->Case1
                    |->Case2
                  |->CommonTest
                    |->TestCase

          pom.xml
          testng.xml

 # 2 - Naming of the file/class name needs improvement
 
 # 3 - Shared class files have been in different folders or projects, should be maintained in the same project structure with different packages so that interaction between classes will be easy
 
 # 4 - Datas hardcorded in the class can be avoided and can use properties file to store global varilables or dataproviders in testNG for testcase specific execution 

 # 5 - Browser and os level data can be provided in testng.xml and parallel execution can be leveraged

 # 6 - Multiple testng files not needed

 # 7 - Single pom.xml file is sufficient for the dependencies of all modules

 # 8 - For failure scenarios, error is caught in the catch block, but necessary screenshot attachment of the error will be helpful in debugging after the execution failure

# 9 - Log4j can be leveraged to log the execution and error steps

# 10 - Test cases should be derived in single testng.xml file and can be configured to execute at suite or testcase level as per the need

# 11 - Custom reporting can be implemented for each test case

# 12 - Proper setup() and teardown() structure is not followed, testNG annotations can be used 

# 12 - Dynamic wait statement should be used to improve the execution time



                    
