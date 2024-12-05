# Persistence Using Spring Data JDBC 3.0.0 and Spring Framework 6

This repository contains code and resources from the course "Persistence Using Spring Data JDBC 3.0.0 and Spring Framework 6." In this course, we explore how to efficiently use Spring 6 and JDBC 3.0 to manage database interactions within your application. We cover the latest features of Spring 6, how to perform CRUD operations, batch updates, and important changes and deprecations in both frameworks.

## Table of Contents
- [Overview](#overview)
- [Course Modules](#course-modules)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Overview

This course is part of the *Spring Framework 6 and Spring Boot 3 Path*. It demonstrates how to leverage the latest versions of Spring Framework (Spring 6) and JDBC (JDBC 3.0.0) for more efficient database persistence. You will learn about the revised features in Spring 6 for accessing data, how to perform CRUD operations, handle batch updates, and how to avoid deprecated features.

By the end of the course, you'll know how to configure persistence in your applications using the new techniques introduced in JDBC 3 and Spring 6 to create more maintainable and efficient code.

## Course Modules

### 1. **What is Spring Data and JDBC 3.0?**
Duration: 8m 38s  
Introduction to Spring Data and the new features in JDBC 3.0.0.

### 2. **Setting up the JDBC Project**
Duration: 21m 39s  
Steps to set up a Spring JDBC project and configure it with Spring 6 and JDBC 3.0.

### 3. **Creating Records in the Database**
Duration: 35m 22s  
Learn how to create records and insert data into the database using Spring JDBC.

### 4. **Reading Records from the Database**
Duration: 24m 57s  
How to read data from the database and utilize it effectively in your Spring application.

### 5. **Updating Records in the Database**
Duration: 31m 24s  
Performing updates to records in the database using Spring JDBC.

### 6. **Deleting Records from the Database**
Duration: 12m 12s  
Deleting records and handling database removals efficiently.

### 7. **Handling Exceptions and Transactions**
Duration: Variable  
Best practices for managing exceptions and ensuring transactional integrity within your JDBC operations.

## Installation

To set up and run the code examples from this course, follow these steps:

1. Clone this repository:
    ```bash
    git clone https://github.com/yourusername/spring-data-jdbc-3-spring-framework-6.git
    ```

2. Navigate into the project directory:
    ```bash
    cd spring-data-jdbc-3-spring-framework-6
    ```

3. Make sure you have Java 17 or higher installed. You can verify this with:
    ```bash
    java -version
    ```

4. Build the project using Maven or Gradle. For Maven, use:
    ```bash
    mvn clean install
    ```

5. Run the application:
    ```bash
    mvn spring-boot:run
    ```

6. Make sure you have a database configured (e.g., H2, MySQL, PostgreSQL) as described in the course modules.

## Usage

The project demonstrates various JDBC operations integrated with Spring 6. You can use it to understand how to implement CRUD functionality, batch updates, and transactional support with Spring Data JDBC.

Each module in the course provides specific examples related to database interactions, which are available as Java classes and resources in this repository. You can follow the implementation step-by-step, testing each CRUD operation and utilizing Spring's capabilities to manage database interactions efficiently.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
