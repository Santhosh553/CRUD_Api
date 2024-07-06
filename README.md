# CRUD and Search Application with Spring Boot and React

## Overview
This project is a full-stack web application using Spring Boot for the backend and React for the frontend, demonstrating CRUD (Create, Retrieve, Update, Delete) and search operations with a MySQL database.

## Technologies Used
- **Backend**: Spring Boot
- **Frontend**: React
- **Database**: MySQL
- **Other Tools**: npm, Maven

## Features
1. **Create**: Add new records to the database.
2. **Retrieve**: Fetch and display records from the database.
3. **Update**: Modify existing records in the database.
4. **Delete**: Remove records from the database.
5. **Search**: Search for records in the database based on specific criteria.

## RESTful Endpoints and Annotations
- **@PostMapping**: Used to create new records.
- **@GetMapping**: Used to retrieve records.
- **@RequestMapping**: Used to search for records.
- **@PutMapping**: Used to update existing records.
- **@DeleteMapping**: Used to delete records.

## Getting Started

### Prerequisites
- Java 11 or higher
- Node.js and npm
- MySQL

### Backend Setup - Recommended IDEs (IntelliJ IDEA, Eclipse, or Spring Tools Suite)

1. Clone the repository:
   ```sh
   git clone https://github.com/Santhosh553/CRUD_Api.git
   cd ./Backend

2. Configure the MySQL database connection in 'application.properties':
   ```sh
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password

3. Build and run the backend application:
   ```sh
   ./mvnw spring-boot:run


### Frontend Setup

1. Navigate to the frontend directory:
   ```sh
   cd ./Frontend

2. Install the dependencies:
   ```sh
   npm install

3. Start the React application:
   ```sh
   npm run start
