
# API Simples em Kotlin com Spring Boot

Este é um projeto de API simples desenvolvido em Kotlin usando Spring Boot. A API permite operações CRUD (Create, Read, Update, Delete) em uma entidade `User`.

## Tecnologias Utilizadas

- Kotlin
- Spring Boot
- Spring Data JPA
- H2 Database
- Gradle

## Estrutura do Projeto

```
src/
└── main/
    └── kotlin/
        └── com/
            └── seuprojeto/
                └── apisimples/
                    ├── controllers/
                    │   └── UserController.kt
                    ├── models/
                    │   └── User.kt
                    ├── repositories/
                    │   └── UserRepository.kt
                    └── services/
                        └── UserService.kt
```

## Configuração

### Pré-requisitos

- JDK 17 ou superior
- Gradle
- IntelliJ IDEA (opcional, mas recomendado)

### Clonando o Repositório

```bash
git clone https://github.com/seuusuario/api-simples.git
cd api-simples
```

### Executando a Aplicação

1. Compile e execute a aplicação:

```bash
./gradlew bootRun
```

2. Acesse o console do H2 Database:

   Abra seu navegador e vá para `http://localhost:8080/h2-console`.

   Configure a conexão com os seguintes detalhes:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User Name: `sa`
   - Password: (deixe em branco)

## Endpoints da API

### Criar um Usuário

- **URL**: `/users`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
  ```
- **Exemplo de Resposta**:
  ```json
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
  ```

### Listar Todos os Usuários

- **URL**: `/users`
- **Método**: `GET`
- **Exemplo de Resposta**:
  ```json
  [
    {
      "id": 1,
      "name": "John Doe",
      "email": "john.doe@example.com"
    }
  ]
  ```

### Buscar Usuário por ID

- **URL**: `/users/{id}`
- **Método**: `GET`
- **Parâmetros de URL**: `id` - ID do usuário a ser buscado
- **Exemplo de Resposta**:
  ```json
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
  ```

### Deletar Usuário por ID

- **URL**: `/users/{id}`
- **Método**: `DELETE`
- **Parâmetros de URL**: `id` - ID do usuário a ser deletado
- **Exemplo de Resposta**: `204 No Content`

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
