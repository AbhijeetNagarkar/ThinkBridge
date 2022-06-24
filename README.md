# ThinkBridge
Assignment

I have created a framework which will full fill assignment requirement 
I have used POM with Cucumber 

There are 5 packages 
1) Feature file - which consist feature file
2) Runner class - which contain runner class for feature file
3) Step Definitions - which consist step definition file
4) Webpage - I have created a login class and added in webpage package. Login page class contain all the function which are available in login page
5) Utility - Its a package consist 2 classes, 1 is constant which has variable which we need throught our program or has global declaration.
             WebPageObjectRepo is a class where I have declared a instance of webpage(means Login page) so using object repo class instance I am fetching login page instance 
             and deriving functionality of login webpage.
             
 In step definition file I have created driver instance and in steps I have just called in login page functionality using (webpageobjectrepo().login()) and method name
 feature file mentioned the given workflow of assignment
 and runner file contain the configuration
 I have generated output as html along with Junit using format(cucumber options in runner class)
 
 We can Run the Project using JUnit.
 
 Just Open project in Eclipse by importing as Maven Project. 
 Once imported, Right click on Project->Run->Junit
 
 Check the Ouput or report status in html-output folder -> index.html
 or in junit-output 
 
 
