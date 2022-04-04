# LiskovSubstitutionPrinciple

        Liskov Substition Principle represent the "L" of the five SOLID Principle of OOPs.They are 
best known as SOLID principles.The object of superclass shall be replaceable with the object of its
subclass without breaking the application.
         In this project, "TransportationDevice" class is the concrete class which has the attributes of 
name and speed. "TransportationDeviceWithEngine" and "TransportationDeviceWithOutEngine"
classes extends the "TransportationDevice" class and both has setEngine method. "Car" class extend 
"TransportationDeviceWithEngine" class which overrides the setEngine method and "Cycle" class extends
TransportationDeviceWithoutEngine class which overrides the setEngine method.This is the method of Liskov
Substitution Principle.

JunitTest:
  
      The  Junit Test is done of all the entities in  "Liskov Substitution Principle" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 


       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradlew sonarqube 
  -Dsonar.projectKey=LiskovSubstitutionPrinciple 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=1cdef49ef93a1163a478af56dbd0e4712b6aadc0