# Bilabonnement – Car Subscription Management

A web application for a car subscription company, built as a **3rd semester exam project** at KEA by a team of three. Employees log in and get a role-specific workspace for handling cars, customers, rental contracts and damage reports.

## Features
- **Login with roles**: each user role gets its own menu and pages
- **Data registration**: manage cars and customers, and create, view and close rental contracts
- **Damage handling**: create and view damage reports for returned cars
- **Business development**: fleet overview and statistics
- Shared header and footer with Thymeleaf fragments

## Tech stack
Java 17 · Spring Boot · Spring MVC · Thymeleaf · JDBC · MySQL · JUnit · Maven · GitHub Actions → Azure Web App

## Architecture
A layered MVC structure:

```
controller/   HTTP endpoints per role (login, data registration, damage, business)
service/      business logic
repository/   SQL via JDBC
model/        domain classes (Car, Customer, RentalContract, DamageReport, User)
templates/    Thymeleaf views
```

A CI/CD pipeline builds the project with Maven and deploys it to Azure on every push to `master`.

## My contributions
- The data registration part: cars, customers and rental contracts (controller, views and CSS)
- Login and the role-based home flow
- Database schema and dummy data
- Shared Thymeleaf header and footer fragments

## Run locally
1. Create the database with the SQL script in [`database.java`](database.java).
2. Set the connection in `src/main/resources/application.properties`.
3. Start the app:

```bash
./mvnw spring-boot:run
```

Then open http://localhost:9090.
