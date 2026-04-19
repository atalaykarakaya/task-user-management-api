# Task and User Management API

A production-style Spring Boot REST API for managing tasks and users.

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate Validator
- H2 Database
- JUnit 5 + MockMvc integration tests

## Features
- Versioned REST API (`/api/v1`)
- CRUD operations for `Task` and `User`
- Task filtering by `status` and `priority`
- DTO-based request/response contracts
- Global exception handling with consistent JSON error format
- Validation for request payloads
- Integration tests for core API flows

## Project Structure
- `src/main/java/com/example/demo/controller` REST endpoints
- `src/main/java/com/example/demo/service` business logic
- `src/main/java/com/example/demo/repository` data access
- `src/main/java/com/example/demo/entity` JPA entities
- `src/main/java/com/example/demo/dto` API contracts
- `src/main/java/com/example/demo/exception` centralized error model

## Run Locally
1. Build and run tests:
   ```bash
   ./mvnw clean test
   ```
2. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   Or use the safe startup script on Windows (stops existing process on the configured port first):
   ```powershell
   .\start-safe.ps1
   ```
   If your PowerShell execution policy blocks scripts, run:
   ```cmd
   start-safe.cmd
   ```
3. API base URL:
   - `http://localhost:8081/api/v1`
4. H2 Console:
   - `http://localhost:8081/h2-console`

## Sample Endpoints
- `POST /api/v1/tasks`
- `GET /api/v1/tasks`
- `GET /api/v1/tasks?status=TODO&priority=HIGH`
- `PUT /api/v1/tasks/{id}`
- `DELETE /api/v1/tasks/{id}`
- `POST /api/v1/users`
- `GET /api/v1/users/{id}`

## Example Task Create Payload
```json
{
  "title": "Prepare portfolio project",
  "description": "Finalize README and integration tests",
  "status": "TODO",
  "priority": "HIGH",
  "dueDate": "2026-04-30"
}
```

## Error Response Format
```json
{
  "timestamp": "2026-04-19T10:32:14.123Z",
  "status": 400,
  "error": "Bad Request",
  "message": "Validation failed",
  "path": "/api/v1/tasks",
  "validationErrors": {
    "title": "must not be blank"
  }
}
```

## CV Bullet Suggestions
- Designed and implemented a layered Spring Boot REST API using DTO mapping, validation, and global exception handling.
- Built integration tests with MockMvc for end-to-end endpoint verification.
- Applied clean architecture principles and improved API consistency with versioning and standardized responses.
