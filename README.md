# REST Square root Application
## Design / Architecture
1. Project structure is generated using Spring Initializer. 
2. Apart form that Spring Boot has been used.

## Tech-Stack Used to build application:
1. Spring boot embedded Tomcat Server
2. Spring Rest
3. Jackson : Java to Json mapping
4. JUnit : Unit Test Framework
5. Maven : Build integration
6. Postman : Testing Rest Services.

##  Assumptions
Rest service security is out of scope for this project. If required, it can be implemented using spring security.

## Application Assumptions: 
1. The Input Json will be Integer Array List


## How to run this application
* Clone the git repo using following command

  ```git clone https://github.com/mistrysanket/getsqrt.git```

* This will create a folder getsqrt in your current working directory.

* Execute command:

  ```cd getsqrt```

* Compile code using following command

```mvn clean install```

* Run the application using following command

```java -jar ./target/getsqrt-0.0.1-SNAPSHOT.jar```

Now application is started.

* Run the following endpoint to get square root of three highest integers using Postman
* endpoint URL: 
```localhost:8080/sqrt/getSqrtOfHighestNumbers```
* http method=GET
* Add following http header:
 ```"key":"Content-Type","value":"application/json"```
* Copy below Json in the Body
Body
```{```
  ```"data": [5,4,6,1]```
```}```
* Click Send and you will get following output
Result
```{```
   ``` "output": 8.77```
```}```

## Testing
JUnit coverage is provided for controller class(SqrtController.java)

## Author: Sanket Mistry
