# proxy-sevice
Server to redirect websites to simulate a proxy process
Made in spring boot and java technologies

# Run service
Download project in .zip or clone with git commands -> git clone {project-url}

There are 2 ways to run the project:
* Using the goals of maven -> maven build, maven install and finally run java - jar (indicating the packaging jar that was generated in the target folder)
* Importing the project as "maven project inside some IDE (ECLIPSE, STS, Intellij)"
    1 . If you have the spring plugin, run the spring application as
    2. If not, select the main java class (Service application) and
       run as Java Aplication

The application is configured to run on a tomcat and expose itself on port 8080.
Once the application is running, access localhost: 8080, a dashboard will be shown with the specifications of 2 endpoints that have the same operation: function as a proxy to redirect websites based on the url that you pass as request param or body in the case of GET and POST respectively.

POSTMAN can be used to manage the results.
