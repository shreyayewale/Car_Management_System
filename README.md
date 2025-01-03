# Car Management System

## Project Overview

The Car Management System is a Spring Boot application designed to perform CRUD (Create, Read, Update, Delete) operations on a car database. The application interacts with a MySQL database and provides RESTful APIs for managing car records.

### Prerequisites

Before running this project, ensure you have the following installed:

* Java Development Kit (JDK) 23  
* MySQL Server  
* Maven  
* An IDE like IntelliJ IDEA or Eclipse

### Dependencies 

1. Spring Boot Starter Web – For building RESTful APIs and web applications.  
2. Spring Boot Starter Data JPA – For interacting with relational databases using JPA (Java Persistence API).  
3. MySQL Connector – To connect your application to the MySQL database.  
4. Spring Boot DevTools – For enabling live reload and quick development iterations.  
5. Spring Boot Starter Test – For unit testing and integration testing.  

### Database Configuration

1. Create a MySQL database named car_management.  
2. Update the application.properties file with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/car_management  
spring.datasource.username=root  
spring.datasource.password=YOUR_PASSWORD  
//First run with ddl-auto set to create to generate the table structure  
spring.jpa.hibernate.ddl-auto=create  
//After the table is created, change ddl-auto to update for further runs  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
logging.level.org.hibernate.SQL=DEBUG  

### How to Run the Project

1. Clone the repository or download the project files.  
2. Open the project in your preferred IDE.  
3. Update the application.properties file with your MySQL credentials.  
4. Run the MySQL server and ensure the car_management database is created.  
5. Run the Spring Boot application using your IDE or the command:  
    mvn spring-boot:run  
6. The application will start on **http://localhost:8095.**  

### API Endpoints

1. Get All Cars  
URL: GET -- http://localhost:8095/cars  
Description: Retrieve a list of all cars.  

2. Get Car by ID  
URL: GET --  http://localhost:8095/cars/{id}  
Description: Retrieve a specific car by its ID.  
Example: /cars/1  

3. Add a New Car  
URL: POST -- http://localhost:8095/car/add  
Description: Add a new car to the database.  

4. Update Car Details  
URL: PUT -- http://localhost:8095/car/update/{id}  
Description: Update the details of an existing car by its ID.  
Example: /car/update/1  

5. Delete a Car  
URL: DELETE -- http://localhost:8095/car/delete/{id}  
Description: Delete a car from the database by its ID.  
Example: /car/delete/1  

**Tools and Technologies Used**

* Java  
* Spring Boot  
* MySQL  
* Maven  
* Hibernate  

# Author
Shreya Laxman Yewale




