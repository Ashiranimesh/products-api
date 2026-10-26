# 🛍️ Products API

A RESTful API built with **Java and Spring Boot** to manage products. This project demonstrates Object-Oriented Programming (OOP), inheritance, method overriding, and REST API development.

Developed as part of my journey learning Java backend development.

## 🚀 Features

- 📦 Retrieve all products
- 🔍 Find a product by its ID
- ➕ Add new products
- 🗑️ Delete products
- 🔎 Search products by name
- 💻 Support for physical and digital products
- 🧬 Demonstrate inheritance and polymorphism
- 🔄 Override methods to provide product-specific behaviour

## 🛠️ Technologies Used

- **Language:** Java
- **Framework:** Spring Boot
- **Build Tool:** Maven
- **API Testing:** Postman
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

## 🧠 OOP Concepts Practised

### 1. Encapsulation
Using classes and methods to organise product data and control access to fields.

### 2. Inheritance
Creating specialised product classes that extend the base `Product` class.

- `DigitalProduct` — represents digital products.
- `PhysicalProduct` — represents physical products.

### 3. Polymorphism
Allowing different product types to provide their own implementations of shared methods.

### 4. Method Overriding
Overriding methods such as `getSummary()` to return information specific to each product type.

## 📂 Project Structure

```text
products-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── uk/ac/westminster/products_api/
│       │       ├── Product.java
│       │       ├── DigitalProduct.java
│       │       ├── PhysicalProduct.java
│       │       ├── ProductService.java
│       │       └── ProductController.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

*Note: The structure above reflects the main classes used in this project. Adjust it if your actual folder structure differs.*

## 🔗 API Endpoints

The following endpoints represent the operations implemented or practised in this project.

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/products` | Retrieve all products |
| `GET` | `/products/{id}` | Retrieve a product by ID |
| `POST` | `/products` | Add a new product |
| `DELETE` | `/products/{id}` | Delete a product by ID |

Additional functionality includes searching for products by name.

## ⚙️ Getting Started

### Prerequisites

- Java JDK
- IntelliJ IDEA or another Java IDE
- Git
- Maven, or the Maven Wrapper if included in the project

### 1. Clone the repository

```bash
git clone https://github.com/Ashiranimesh/products-api.git
```

### 2. Navigate to the project directory

```bash
cd products-api
```

### 3. Open the project

Open the project in IntelliJ IDEA and allow Maven to download the required dependencies.

### 4. Run the application

Run the main Spring Boot application class from IntelliJ IDEA.

Alternatively, if Maven is installed, run:

```bash
mvn spring-boot:run
```

### 5. Test the API

Once the application has started, use Postman to send requests to:

```text
http://localhost:8080/products
```

The default port is `8080`, unless configured differently in `application.properties`.

## 🎯 Learning Goals

This project helps me develop practical experience in:

- Building RESTful APIs with Spring Boot.
- Understanding the controller-service architecture.
- Applying OOP principles in real applications.
- Working with Java inheritance and polymorphism.
- Implementing method overriding.
- Testing API endpoints using Postman.
- Managing source code using Git and GitHub.

## 👨‍💻 Author

**Ashira Nimesh**

Computer Science Undergraduate  
University of Westminster | Informatics Institute of Technology

- GitHub: [@Ashiranimesh](https://github.com/Ashiranimesh)

---

⭐ Thanks for checking out my project! Feel free to explore the repository as I continue developing my Java
