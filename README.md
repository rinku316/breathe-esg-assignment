# Breathe ESG Backend

Backend service for ESG data ingestion and approval workflow built using Spring Boot and MySQL.

---

## Features

- Upload ESG CSV files
- Parse CSV records
- Store records in MySQL database
- Fetch all ESG records
- Approve / Reject records
- Detect suspicious records automatically

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## Project Structure

src/main/java

- controller
- service
- repository
- entity

---

## API Endpoints

### Upload CSV

POST /upload/sap

### Get All Records

GET /upload/records

### Approve Record

PUT /upload/approve/{id}

### Reject Record

PUT /upload/reject/{id}

---

## Database

MySQL database used:

breathe_esg

Table:

emission_record

---

## Workflow

CSV Upload
→ Spring Boot API
→ MySQL Storage
→ ESG Review Dashboard

---

## How To Run

1. Open project in STS / Eclipse
2. Configure MySQL in application.properties
3. Run Spring Boot application

---

## Author

Tulachand Meher
