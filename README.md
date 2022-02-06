# ApiUniversity
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/abnerjosefelixbarbosa/ApiUniversity/blob/main/LICENSE)

# Sobre o projeto

ApiUniversity é uma API construida com spring boot conectada a um banco de dados para registra e alterar informações da inscrição dos estudantes para curso de graduação ou pós-graduação.

## Modelo conceitual

![Modelo](https://github.com/abnerjosefelixbarbosa/assents/blob/main/modelo.png)

# Features

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Lombok
- MySQL
- PostgreSQL
- Listar todos os estudantes.
- Listar todos as inscrições.
- Editar dados dos estudantes.
- Savar dados dos estidantes.
- Savar dados das inscrições.

## Implatação

Heroku

https://sprigboot-postgre-heroku.herokuapp.com/university

# Modo de comsumo

## Estudante

{
	"name": "Carlos",
	"nameMother": "Marcia",
	"nameFather": "Pereira",
	"matriculation": "000000000",
	"rg": "1121212",
	"cpf": "760.654.560-04",
	"email": "abner@gmail.com",
	"graduation": "Sistema de informação",
	"posGraduation": "",
	"institution": ""
}

## Inscrição

{
	"student": {
		"id": 1
  }
}

# Execução do projeto

Java 8

```java
# clonar repositório
git clone https://github.com/abnerjosefelixbarbosa/ApiUniversity.git

# exercutar o projeto
src/main/java/com/edu/university/UniversityApplication.java
```
# Autor

Abner José Felix Barbosa

https://www.linkedin.com/in/abner-jose-feliz-barbosa-552a17166/

