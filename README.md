# Job Portal Backend

This project is a backend implementation of a job portal that provides essential functionalities for managing job listings. Users can view available jobs, add new job postings, update existing ones, delete jobs, and search for specific job listings. The backend is built using **Spring Boot** with **MySQL** as the database and **Hibernate** for ORM (Object-Relational Mapping).

## Features

- **View Jobs:** Retrieve a list of all available job listings.
- **Add Jobs:** Create and add new job postings to the portal.
- **Update Jobs:** Modify details of existing job listings.
- **Delete Jobs:** Remove job listings from the portal.
- **Search Jobs:** Search for specific job listings based on criteria like job title, company, location, etc.

## Technologies Used

- **Spring Boot:** Framework for building the backend application.
- **MySQL:** Relational database management system used for storing job listings.
- **Hibernate:** ORM tool for handling database operations in an object-oriented manner.


## Setup and Installation

To run this project locally, follow these steps:

#### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/job-portal-backend.git
cd job-portal-backend
```

#### 2. Configure the Database:

Ensure that MySQL is installed and running on your system. Create a database named job_portal.

Update the application.properties file with your database credentials:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
#### 3.Build the Project:

Use Maven to build the project:

```bash
mvn clean install
```

#### 4.Run the Application:

Start the application using:

```bash
mvn spring-boot:run
```
#### 5.Access the Application:

The backend will be running at http://localhost:8080.

### API Endpoints
Here are the main API endpoints available in the application:

- `GET /jobPosts` - Retrieve all job listings.
- `POST /jobPost` - Add a new job listing.
- `PUT /jobPost` - Update an existing job listing.
- `DELETE /jobPost/{postid}` - Delete a job listing.
- `GET /jobPosts/keyword/{keyword}` - Search for jobs based on criteria.

#### Contributing
If you want to contribute to this project, please fork the repository and create a pull request with your changes.

#### License
This project is licensed under the MIT License. See the LICENSE file for more details.
