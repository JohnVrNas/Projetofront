# Projeto de Cadastro de Usuários

Este é um projeto simples feito com **Spring Boot** e **Thymeleaf** para cadastro e listagem de usuários.

## 📋 Funcionalidades

- Cadastro de usuários (email, nome de usuário e senha)
- Listagem de usuários salvos no banco de dados

## 🚀 Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven
- Banco de dados H2, PostgreSQL ou outro compatível (ajustar no `application.properties`)
- IDE (IntelliJ, Eclipse, VS Code)

### Passo a passo

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

2. Compile o projeto com Maven:
   ```bash
   mvn clean install

3. Rode a aplicação:
   ```bash
   mvn spring-boot:run

### 📁 Estrutura de diretórios importante
```
src/
└── main/
    ├── java/
    │   └── com.aula.front/
    │       └── User/
    │           ├── UserController.java
    │           ├── UserModel.java
    │           └── UserRepository.java
    └── resources/
        ├── templates/
        │   ├── cadastro.html
        │   └── usuarios.html
        └── application.properties
```

### ⚙️ Configuração do banco de dados

No arquivo application.properties, configure o banco de dados. Exemplo usando H2:

```
spring.datasource.url=jdbc:h2:mem:usuariosdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```
Acesse o console do H2:
```
http://localhost:8080/h2-console
```

### ✍️ Autor
Feito por João Victor Rodrigues do Nascimneto - 11232101507 <br>
Feito por Wellington de Castro
