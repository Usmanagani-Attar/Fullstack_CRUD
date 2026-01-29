# 🚀 Full Stack CRUD Application

This repository contains a Full Stack User Management Web Application that performs Create, Read, Update, and Delete (CRUD) operations using React, Spring Boot, and MySQL.

It demonstrates complete frontend–backend integration using REST APIs with persistent database storage.


## 📌 About This Project

This project is built to understand how a full stack application works end-to-end:

Frontend built with React

Backend REST API built with Spring Boot

Database operations handled using JPA (Hibernate)

Data stored in MySQL

---

## Tech Stack

### 🎨 Frontend

- React.js

- Axios

### ⚙️ Backend

- Spring Boot

- Spring Data JPA (Hibernate)

- Maven

### 🗄️ Database

- MySQL

---

## 🛠️ Tools Used

* IntelliJ IDEA

* VS Code

* Postman

* MySQL Workbench

---

## ✨ Features

- ✔️ View all users in a table
- ✔️ Add a new user
- ✔️ View individual user details
- ✔️ Edit user information
- ✔️ Delete users
- ✔️ Exception handling for user not found
- ✔️ REST API communication between frontend and backend


---


## 🏗️ Application Architecture


1. **React** (Frontend - localhost:3000)
            ↓ HTTP Requests
2. **Spring Boot** (Backend - localhost:8080)
            ↓ JPA / Hibernate
3.        MySQL Database

---

## ⚙️ Backend Configuration

**📍 File location:**
src/main/resources/application.properties

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/fullstack
spring.datasource.username=root
spring.datasource.password=mysql
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


**▶ Run the backend using FullstackBackendApplication.java**

Backend starts at:
👉 http://localhost:8080

---

## 💻 Frontend Setup

Inside the React project folder:

- npm install
- npm start


Frontend runs at:
👉 http://localhost:3000


---

## 🔌 REST API Endpoints


Method	   Endpoint	Description

GET	   /users	Get all users
GET	   /user/{id}	Get user by ID
POST	   /user	Create new user
PUT	   /user/{id}	Update user
DELETE	   /user/{id}	Delete user



### 🧪 Sample JSON (POST / PUT)

{
  "name": "Usman",
  "username": "usman123",
  "email": "usman@email.com"
}
--- 

## 🗂️ Backend Package Structure

org.Usman.fullstack
 - ├── controller
 - ├── model
 - ├── repository
 - ├── exception
 - └── FullstackBackendApplication


## 👨‍💻 Author

 **Usman**
Engineering Student | Full Stack Developer 🚀

