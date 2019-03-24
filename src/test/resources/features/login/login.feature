#Author: Muzzamil


Feature: Login in Ebay
  I want to login with given credentials

 
 Scenario Outline:: Dean should login with correct credentials
    Given that dean open the ebay login page
    When he login with "<UserName>" and "<Password>" in ebay 
    Then he should see loggedin User as 'Muzzamil' on homepage
    
    
    Examples: 
      |UserName  |Password   |
      |muzzans-55|Te5t@cc0unt| 