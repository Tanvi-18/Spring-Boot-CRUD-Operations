# Spring Boot CRUD Operations

## Overview
This is a sample Spring Boot project that demonstrates how to create a simple CRUD (Create, Read, Update, Delete) repository for managing data. The project uses Spring Boot, Spring Data JPA, and H2 database for simplicity. You can extend this project to work with other databases or frameworks as needed.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK)](https://adoptopenjdk.net/) installed.
- [Apache Maven](https://maven.apache.org/) installed.

## Spring Initializer

If you want to create a similar Spring Boot project from scratch, you can use the [Spring Initializer](https://start.spring.io/) web tool. Simply select the necessary dependencies such as Spring Web, Spring Data JPA, and H2 Database, and it will generate a basic project structure for you.

## User Repository

The `UserRepository` extends the Spring Data JPA `JpaRepository` interface. You can find this repository in the `src/main/java/com/example/repository` directory. It provides convenient methods for performing CRUD operations on the `User` entity.

## Usage

This project provides basic CRUD operations for a `User` entity. You can use this as a starting point and customize it for your specific needs. Here are the available endpoints:

- **Create**: `POST /api/users` - Create a new user.
- **Read**: `GET /api/users` - Get a list of all users.
- **Read**: `GET /api/users/{id}` - Get a user by ID.
- **Update**: `PUT /api/users/{id}` - Update an existing user by ID.
- **Delete**: `DELETE /api/users/{id}` - Delete a user by ID.

Make requests to these endpoints using your preferred API client or tools like cURL, Postman, or even a web browser.

Feel free to customize this project according to your requirements, and happy coding!
