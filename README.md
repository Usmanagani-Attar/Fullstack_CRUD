Full Stack CRUD Application

A full stack User Management web application that performs Create, Read, Update, and Delete (CRUD) operations using React, Spring Boot, and MySQL.

This project demonstrates complete frontend–backend integration using REST APIs and persistent database storage.

Tech Stack

Frontend

React.js

Axios

Backend

Spring Boot

Spring Data JPA (Hibernate)

Maven

Database

MySQL

Tools

IntelliJ IDEA

VS Code

Postman

MySQL Workbench

Features

View all users in a table

Add a new user

View user details

Edit user information

Delete users

Exception handling for user not found

REST API communication between React and Spring Boot

Application Architecture
React (Frontend - localhost:3000)
        ↓ HTTP Requests
Spring Boot (Backend - localhost:8080)
        ↓ JPA / Hibernate
MySQL Database

Backend Configuration

Located in:
src/main/resources/application.properties

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/fullstack
spring.datasource.username=root
spring.datasource.password=mysql
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


Run the backend using FullstackBackendApplication.java

Backend starts at:

http://localhost:8080

Frontend Setup

Inside the React project folder:

npm install
npm start


Frontend runs at:

http://localhost:3000

REST API Endpoints
Method	Endpoint	Description
GET	/users	Get all users
GET	/user/{id}	Get user by ID
POST	/user	Create new user
PUT	/user/{id}	Update user
DELETE	/user/{id}	Delete user
Sample JSON (POST / PUT)
{
  "name": "Usman",
  "username": "usman123",
  "email": "usman@email.com"
}

Backend Package Structure
org.Usman.fullstack
 ├── controller
 ├── model
 ├── repository
 ├── exception
 └── FullstackBackendApplication

Author

Usman
Engineering Student | Full Stack Developer 🚀
