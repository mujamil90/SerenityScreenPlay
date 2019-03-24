**Serenity Framework with ScreenPlay Design Pattern**

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