# Spring Security JWT Authentication Project

Este projeto é um exemplo de aplicação Spring Boot que utiliza autenticação JWT (JSON Web Token) para proteger endpoints.

## Estrutura do Projeto

- **src/main/java/com/Spring/Security**
  - **Application.java**: Classe principal para iniciar a aplicação.
  - **controller**
    - **AuthenticationController.java**: Controlador para endpoints de autenticação e registro.
    - **DemoController.java**: Controlador para endpoints de demonstração (protegidos e não protegidos).
  - **config**
    - **WebSecurityConfig.java**: Configuração de segurança do Spring Security.
  - **filter**
    - **JwtAuthenticationFilter.java**: Filtro para processar tokens JWT.
  - **dto/request**
    - **AuthenticationRequest.java**: DTO para requisições de autenticação.
    - **RegisterRequest.java**: DTO para requisições de registro.
  - **dto/response**
    - **AuthenticationResponse.java**: DTO para respostas de autenticação.
  - **service**
    - **AuthenticationService.java**: Serviço para lógica de autenticação e registro.
    - **JwtService.java**: Serviço para manipulação de tokens JWT.
    - **UserDetailsService.java**: Serviço para carregar detalhes do usuário.

## Endpoints

### Autenticação e Registro

- **Registrar um novo usuário**
  - URL: `POST /api/v1/auth/register`
  - Corpo da Requisição:
    ```json
    {
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com",
      "password": "password123"
    }
    ```

- **Autenticar um usuário (login)**
  - URL: `POST /api/v1/auth/authenticate`
  - Corpo da Requisição:
    ```json
    {
      "email": "john.doe@example.com",
      "password": "password123"
    }
    ```

### Endpoints de Demonstração

- **Endpoint não seguro**
  - URL: `GET /api/v1/demo/unsecured`
  - Resposta: `"This endpoint is not secured"`

- **Endpoint seguro para usuários com ROLE_USER**
  - URL: `GET /api/v1/demo/secured-user`
  - Requer token JWT no cabeçalho `Authorization`
  - Resposta: `"This endpoint is secured and can be accessed by ROLE_USER."`

- **Endpoint seguro para usuários com ROLE_ADMIN**
  - URL: `GET /api/v1/demo/secured-admin`
  - Requer token JWT no cabeçalho `Authorization`
  - Resposta: `"This endpoint is secured and can be accessed by ROLE_ADMIN."`

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_DIRETORIO>
Copy
Insert

Compile e rode a aplicação:
./mvnw spring-boot:run
Copy
Insert

Acesse a aplicação:
A aplicação estará disponível em http://localhost:8080.
Como Usar o curl para Testar Endpoints
Registrar um Novo Usuário
curl -X POST http://localhost:8080/api/v1/auth/register \
-H "Content-Type: application/json" \
-d '{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}'
Copy
Insert

Autenticar um Usuário (Login)
curl -X POST http://localhost:8080/api/v1/auth/authenticate \
-H "Content-Type: application/json" \
-d '{
  "email": "john.doe@example.com",
  "password": "password123"
}'
Copy
Insert

Acessar um Endpoint Protegido
curl -X GET http://localhost:8080/api/v1/demo/secured-user \
-H "Authorization: Bearer <TOKEN_JWT>"
Copy
Insert

Tecnologias Utilizadas
Java 11
Spring Boot
Spring Security
JWT (JSON Web Token)
Maven
Contribuição
Faça um fork do projeto.
Crie uma branch para sua feature (git checkout -b feature/fooBar).
Commit suas mudanças (git commit -am 'Add some fooBar').
Push para a branch (git push origin feature/fooBar).
Crie um novo Pull Request.
