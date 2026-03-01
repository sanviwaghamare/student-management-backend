# Student Management Backend

A backend project built using **Spring Boot** and **MySQL** to manage student records using REST APIs.

## Features
- CRUD operations for students
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Database integration with MySQL
- API testing using Postman

## Technologies
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## Project Structure
src/main/java/com/sanviwaghamare/studentmanagementbackend  
- controller  
- service  
- repository  
- entity  
- StudentManagementBackendApplication.java  

## API Endpoints
- GET `/students` – Get all students  
- GET `/students/{id}` – Get student by ID  
- POST `/students` – Add student  
- PUT `/students/{id}` – Update student  
- DELETE `/students/{id}` – Delete student  

## How to Run
1. Clone the repo  
   `git clone https://github.com/sanviwaghamare/student-management-backend`
2. Open in IntelliJ / Eclipse  
3. Configure MySQL in `application.properties`  
4. Run the application  
5. Test APIs using Postman  

## Author
Sanvi Waghamare
