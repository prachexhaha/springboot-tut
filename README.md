# springboot-tut
Introductory project to springboot

## project statement
Building the backend for a CRUD based application - EM Service Incharge.
this project was built in VSCode.

## Introductiory points 
3 layer architecture 
1) controller/presentation layer
2) business layer - service
3) DAO layer (data access object layer) - responsible to establish a connection between database and program.

lowest java version is kept so that, there are no comptability issues.

jar is a java archieve file.

apache tomcat web server gets automatically setup. the web application works on port 8080.

dispatcher servelet is there here
servelet is the special class that runs on the server. we do not need to create the servelet

we do not need to type cast

all your static files/web pages will be there under the resources->static folder

you can create 3 different types of applications using springboot -
1) just the backend - stand alone applications
2) full java application where spring is also used
3) distributed applications that follow micro-services architecture.

`@SpringBootApplication` annotion-
it does 3 things
1) auto-configuration - `EnableAutoConfiguration`
2) component scanning - `Component`
3) configuration - `Configuration`
all these are annotations itself

`SpringApplication.run(DummyApplication.class, args);` - spring is the father of springboot XD
so basically you run `SpringApplication.run` and pass the current class `DummyApplication.class` and whatever arguments that have been sent as args.

## Components Scanner
The different components that this has - 
1) Controller - used only when spring MVC has to built. layer is responsible to recieve a request and give a response to a user. 
2) Rest Controller - this is used for stand alone applications, it has more powers than a servelet
3) Service - this layer works as mediator, this layer is also called as the business layer (business logic). it does not interact with the user directly.
4) Repo/DAO - data access objects

### servlet life cycle 
all the requests from the user comes to a dispatcher servelet and then that goes to a rest controller. this servelet is already created internally in springboot. 

request from user in the form of a http link -> servlet generates a http link as a response to the user.

Note - you can use `static` keyword to not create an instance of that class. so how are the methods for that class called?
you use the class name .function name
example- `MyController.myMethod()`

### Spring Boot MVC
all requests come from user in the form of a REST API to the springboot application and a response will be generated in the form of a REST API itself back to the user.

REST API request from user -> controller (rest controller, because rest apis) -> (now we dont go to servlet) -> rest api response 

internal working
first you need to create a rest controller that can handle the requests as mentioned earlier.this can be done using the annotation - `@RestController`.

URL mapping and recieving requests from the user is done using `@RequestMapping` annotation. and the string that you pass through this is your endpoint. example - `@RequestMapping("m")` here `m` is the end point.

to send back a response to the user - 
create your method, and whatever value that it has to return will be returned in either JSON/XML/text/html.
this is an example of html form - `return "<h1>prachex shrama</h1>";`

### More depth

1) bean represents objects. it contains alot of information.
2) so you can check beans under the springboot dashboard.
3) how exactly are these getting created? because we are not explicitly creating any objects. this is happening due to spring's property of IOC container (inversion of control).
4) IOC - responsible to manage objects and create objects
5) concept of DI (dependency injection) is used.


### service layer

this layer handles all the services 

### DAO layer 
hibernate layer, stores stuff
it might have mySQL connectors

Hibernate framework - springboot JPA (java persistance api) - whenever we have to make a java project based on CRUD operations, this JPA repo has all the concerned queries written for it.
class is mapped to a table, and the talking is done using an object which is called entity.

data is recieved as a model(class itself).
 
whatever information the user wants is wrapped into a model(data binding) -> recieved by the controller -> stored by the help of service -> entity class is made that will store into the table.
