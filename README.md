Here's the English translation of the provided text:

"Spring Security JWT Authentication Project

This project is an example of a Spring Boot application that uses JWT (JSON Web Token) authentication to protect endpoints.

Project Structure
* **src/main/java/com/Spring/Security**
   * **Application.java**: Main class to start the application.
   * **controller**
      * **AuthenticationController.java**: Controller for authentication and registration endpoints.
      * **DemoController.java**: Controller for demonstration endpoints (protected and unprotected).
   * **config**
      * **WebSecurityConfig.java**: Spring Security configuration.
   * **filter**
      * **JwtAuthenticationFilter.java**: Filter to process JWT tokens.
   * **dto/request**
      * **AuthenticationRequest.java**: DTO for authentication requests.
      * **RegisterRequest.java**: DTO for registration requests.
   * **dto/response**
      * **AuthenticationResponse.java**: DTO for authentication responses.
   * **service**
      * **AuthenticationService.java**: Service for authentication and registration logic.
      * **JwtService.java**: Service for JWT token manipulation.
      * **UserDetailsService.java**: Service to load user details.

Endpoints
Authentication and Registration
* **Register a new user**
   * URL: `POST /api/v1/auth/register`
   * Request Body:

```
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}
```

* **Authenticate a user (login)**
   * URL: `POST /api/v1/auth/authenticate`
   * Request Body:

```
{
  "email": "john.doe@example.com",
  "password": "password123"
}
```

Demonstration Endpoints
* **Unsecured endpoint**
   * URL: `GET /api/v1/demo/unsecured`
   * Response: `"This endpoint is not secured"`
* **Secured endpoint for users with ROLE_USER**
   * URL: `GET /api/v1/demo/secured-user`
   * Requires JWT token in the `Authorization` header
   * Response: `"This endpoint is secured and can be accessed by ROLE_USER."`
* **Secured endpoint for users with ROLE_ADMIN**
   * URL: `GET /api/v1/demo/secured-admin`
   * Requires JWT token in the `Authorization` header
   * Response: `"This endpoint is secured and can be accessed by ROLE_ADMIN."`

How to Run the Project
1. **Clone the repository**:

```
git clone <REPOSITORY_URL>
cd <DIRECTORY_NAME>
```

2. Compile and run the application:
```
./mvnw spring-boot:run
```

3. Access the application: The application will be available at http://localhost:8080.

How to Use curl to Test Endpoints
Register a New User
```
curl -X POST http://localhost:8080/api/v1/auth/register -H "Content-Type: application/json" -d '{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}'
```

Authenticate a User (Login)
```
curl -X POST http://localhost:8080/api/v1/auth/authenticate -H "Content-Type: application/json" -d '{
  "email": "john.doe@example.com",
  "password": "password123"
}'
```

Access a Protected Endpoint
```
curl -X GET http://localhost:8080/api/v1/demo/secured-user -H "Authorization: Bearer <JWT_TOKEN>"
```

Technologies Used
- Java 11
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven

Contribution
1. Fork the project.
2. Create a branch for your feature (git checkout -b feature/fooBar).
3. Commit your changes (git commit -am 'Add some fooBar').
4. Push to the branch (git push origin feature/fooBar).
5. Create a new Pull Request."
