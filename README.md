**Serenity Framework with ScreenPlay Design Pattern**

1) **Install Java Version 8  and Maven latest version**
  
3) **Import clone project into favourite IDE(Intellij IDEA or Eclipse).**

4) **Install Maven Plugin for IDE (Eclipse OR Intellij IDEA)**

5) **Build Project:**

mvn clean verify


 
6) **Viewing the reports:**

Run project with "mvn clean verify serenity:aggregate"

You can check generated report after execution in "/target/site"

Both of the commands provided above will produce a Serenity test report in the target/site/serenity directory.
Go take a look!


7) **Override browser:**

You can override the driver specified in the properties or configuration file from the command line. For Maven, you would use the -D option, e.g.

mvn clean verify -Dwebdriver.driver=firefox
