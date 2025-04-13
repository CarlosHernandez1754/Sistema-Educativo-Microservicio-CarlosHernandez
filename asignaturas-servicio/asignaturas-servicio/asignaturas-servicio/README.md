# Sistema Educativo Distribuido - Microservicios

Este proyecto implementa un sistema educativo distribuido utilizando microservicios con Spring Boot y Spring Cloud.

## Microservicios incluidos

**usuarios-servicio**: gestión de usuarios, autenticación con JWT, perfiles de usuario.

**asignaturas-servicio**: CRUD de asignaturas, consulta de datos del docente con Feign Client.

**eureka-server**: servidor Eureka para registro y descubrimiento de servicios.

**config-server**: servidor de configuración centralizada conectado a GitHub.

## Tecnologías utilizadas

Java 17

Spring Boot 3

Spring Cloud

Spring Security + JWT

Spring Data JPA + H2

Feign Client

Eureka

Config Server

Docker y Docker Compose

Actuator

Requisitos previos

Java 17

Maven

Docker y Docker Compose

Clonar el repositorio

git clone https://github.com/CarlosHernandez1754/Sistema-Educativo-Microservicio-CarlosHernandez.git
cd Sistema-Educativo-Microservicio-CarlosHernandez 

Ejecutar con Docker Compose

docker-compose up --build

Esto levantará los 4 servicios en sus respectivos puertos:

## Eureka Server: http://localhost:8761

## Config Server: http://localhost:8888

## Usuarios Servicio: http://localhost:8080

## Asignaturas Servicio: http://localhost:8082

Endpoints principales

Usuarios-servicio

POST /auth/registro: registro de usuario

POST /auth/login: login y obtención de token JWT

GET /usuarios/perfil: perfil del usuario autenticado (requiere JWT)

## Asignaturas-servicio

POST /asignaturas: crear asignatura (requiere token JWT de un usuario con rol DOCENTE)

GET /asignaturas: consultar todas las asignaturas

Seguridad

Los endpoints de creación/modificación requieren token JWT.

Los tokens deben incluirse en el header:

Authorization: Bearer <tu_token_AQUI>

Configuración externa

Todas las configuraciones están en un repositorio remoto de GitHub:

https://github.com/CarlosHernandez1754/Sistema-Educativo-Microservicio-CarlosHernandez.git

Actuator

GET /actuator: información del estado de cada microservicio.

## Autor

## Carlos Hernández
## correo carlosmontalvo1754@gmail.com
