# LiskovSubstitutionPrinciple

        Liskov Substition Principle represent the "L" of the five SOLID Principle of OOPs.They are 
best known as SOLID principles.The object of superclass shall be replaceable with the object of its
subclass without breaking the application.
         In this project, "TransportationDevice" class is the concrete class which has the attributes of 
name and speed.There is two class "TransportationDeviceWithEngine" and "TransportationDeviceWithOutEngine"
class extends the transportationDevice class and both has setEngine method.Now "Car" class extend 
transportationDeviceWithEngine class which overrides the setEngine method and "Cycle" class extends
TransportationDeviceWithoutEngine class which overrides the setEngine method.This is the method of Liskov
Substitution Principle.

JunitTest:
        There is JUnit Test also present for all Liskov Substitution Principle and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradlew sonarqube 
  -Dsonar.projectKey=LiskovSubstitutionPrinciple 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=1cdef49ef93a1163a478af56dbd0e4712b6aadc0