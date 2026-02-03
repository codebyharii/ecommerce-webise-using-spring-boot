Hari Om Singh
🛒 Ecommerce Website – Spring Boot
📌 Project Overview

This project is a full-stack Ecommerce Website Backend developed using Spring Boot. The application provides REST APIs for managing products, users, orders, and authentication. It is designed to support scalable and secure online shopping functionality.

🚀 Features
👤 User Features

User Registration & Login

Secure Authentication

Browse Products

Add Products to Cart

Place Orders

View Order History

🛍️ Product Management

Add New Products

Update Product Details

Delete Products

View Product Listings

Category-Based Product Filtering

📦 Order Management

Place Order

Track Orders

Order Status Management

🔐 Security

Spring Security Integration

Role-Based Authorization

Secure API Access

🧰 Tech Stack
Backend

Java

Spring Boot

Spring Data JPA

Spring Security

Hibernate

Database

MySQL / H2 Database

Build Tool

Maven

API Testing

Postman

🏗️ Project Architecture

The project follows Layered Architecture:

Controller Layer → Handles API Requests  
Service Layer → Business Logic  
Repository Layer → Database Interaction  
Entity Layer → Database Models  

📂 Project Structure
ecommerce-backend
│── controller
│── service
│── repository
│── entity
│── config
│── dto
│── exception
│── EcommerceApplication.java

⚙️ Installation & Setup
1️⃣ Clone Repository
git clone https://github.com/your-username/repository-name.git

2️⃣ Navigate to Project
cd ecommerce-backend

3️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=yourpassword

4️⃣ Run Application
mvn spring-boot:run

📡 API Endpoints (Sample)
User APIs
POST /api/auth/register
POST /api/auth/login

Product APIs
GET /api/products
POST /api/products
PUT /api/products/{id}
DELETE /api/products/{id}

Order APIs
POST /api/orders
GET /api/orders/{userId}

🧪 Testing

Use Postman to test REST APIs

Validate authentication and authorization

🔮 Future Improvements

Payment Gateway Integration

Product Reviews & Ratings

Wishlist Feature

Email Notification System

Microservices Architecture

🤝 Contribution

Contributions are welcome. Feel free to fork the repository and submit pull requests.
