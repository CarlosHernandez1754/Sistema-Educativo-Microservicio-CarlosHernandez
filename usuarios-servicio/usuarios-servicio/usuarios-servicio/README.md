# Parcial 2 (Microservicios)

Este proyecto implementa un sistema educativo distribuido usando Spring Boot y Spring Cloud, que incluye los siguientes microservicios:

- `usuarios-servicio`
- `asignaturas-servicio`
- `matriculas-servicio`
- `eureka-server`
- `config-server`

## Tecnologías usadas

- Spring Boot
- Spring Cloud Netflix Eureka
- Spring Security con JWT
- Spring Data JPA (H2)
- Feign Client
- Docker

## Servicios

### Usuarios Servicio

Encargado del registro y autenticación de usuarios (estudiantes o docentes).

- Endpoint: `/auth/registro`
- Endpoint: `/auth/login`
- Endpoint: `/usuarios/perfil`

### Eureka Server

Registro central de microservicios Accesible en 
`http://localhost:8761`

## Requisitos

- Java 17
- Maven
- Docker (opcional para el despliegue con `docker-compose`)

## Cómo ejecutar


1. Ejecuta primero `eureka-server`.
2. Luego ejecuta `config-server`.
3. Finalmente ejecuta los microservicios.
4. Accede a los servicios vía Postman 

## Autenticación

Este sistema usa JWT. Al hacer login, se obtiene un token que debe enviarse en la cabecera `Authorization: Bearer <token>` para acceder a rutas protegidas.
