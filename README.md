#Serenity Framework with ScreenPlay Design Pattern

[![N|Solid](https://www.thucydides.info/img/serenity-bdd.png)](https://www.thucydides.info/)

**Farmework's feature on high Level**


1. Framework has designed with **Maven Architecture type "Serenity"** so all package has designed as per maven-serenity standard.

2. Framework is designed with latest and recommended design pattern **ScreenPlay** so Test cases and Test report will be very expressive.

3. Framework has **JIRA integration**.

4. Framework has **Data-driven support **so we write parameterized test cases.

5. Framework has support to use **Cross browser on cross OS (Mac/Windows/Linux)**.

6. Framework has support to run test cases in **Parallel Mode**.

7. Framework has **Cucumber integration**.

8. Framework has **cloud (BrowserStack) integration** so we can run test cases on cloud.

9. Framework has support to **customized webdriver** so we can add capabilties by ourself which will not provided by serenity readymade drivers.

10. Framework is enabled with multiple **Maven Profile** so it will really helpful and user-friendly if we want to execute specific test cases e.g. for cucumber we can use maven profile **mvn clean verify -Pcucumber**.

11. We are fetching all values either from **serenity.properties file** or **Constant.java** so we don't have any hard-coded value.

12. Framework has Log enabled with **Logback**.


**Environment Details**

1) **Install Java Version 8  and Maven latest version**
  
3) **Import clone project into favourite IDE(Intellij IDEA or Eclipse).**

4) **Install Maven Plugin for IDE (Eclipse OR Intellij IDEA)**

5) **Viewing the reports:**
     Run project with 

     
     mvn clean verify serenity:aggregate


You can check generated report after execution in "/target/site"

Both of the commands provided above will produce a Serenity test report in the target/site/serenity directory.
Go take a look!


6) **Override browser:**

You can override the driver specified in the properties or configuration file from the command line. For Maven, you would use the -D option, e.g.

    mvn clean verify -Dwebdriver.driver=firefox

7) **Execution:**

 a) **Sequential Execution:** 
   You can can sequentially using below maven commands 
   
    mvn clean verify
   
 b) **Parallel Execution:**
  You can execution in parallel mode using maven profile 
  
    mvn clean verify -PParallelRun
    
 c) **Cucumber based test cases Execution:**
 You can run cucumber based test cases using maven profile 
  
    mvn clean verify -Pcucumber
    
8) **Cloud Support**
  You can add your 'browserstack.user' and 'browserstack.key' in serenity.properties file to write test cases with browserstack.	     