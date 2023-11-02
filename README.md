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

## Testing with Postman

You can use [Postman](https://www.postman.com/) to test the API endpoints easily. We've provided a Postman collection with pre-configured requests for all CRUD operations (Create, Read, Update, Delete). Follow these steps to get started:

1. Download and install Postman if you haven't already.

2. Import the provided Postman collection by clicking the button below:

   [![Run in Postman](https://run.pstmn.io/button.svg)](https://www.getpostman.com/collections/collection_id)

   - Clicking this button will open Postman, and you can import the collection into your Postman workspace.

3. Open the imported collection in Postman. You will find requests organized under each CRUD operation:

   - **Create User**: Use this request to create a new user.
   - **Get All Users**: Use this request to get a list of all users.
   - **Get User by ID**: Use this request to retrieve a user by their ID.
   - **Update User by ID**: Use this request to update an existing user by their ID.
   - **Delete User by ID**: Use this request to delete a user by their ID.

4. Modify the request parameters as needed. For example, you can update the JSON data for creating or updating a user, or change the URL parameter for getting or deleting a specific user.

5. Send the requests to test the API.

Use the Postman collection to interact with the API and verify its functionality.

Feel free to customize this project according to your requirements, and happy coding!


