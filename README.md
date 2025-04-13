# Parcial 2 

## Sistema Educativo con Microservicios

Este proyecto implementa un **sistema educativo distribuido** usando Spring Boot y Spring Cloud. Está dividido en múltiples microservicios que se comunican entre sí usando **Feign Clients**, se registran en **Eureka**, comparten configuración a través de **Config Server** y están protegidos con **Spring Security + JWT**.

---

##  Microservicios implementados

- `usuarios-servicio`: Registro, login y perfil de estudiantes/docentes
- `asignaturas-servicio`: CRUD de materias
- `matriculas-servicio`: Gestión de inscripciones de estudiantes en asignaturas
- `eureka-server`: Descubrimiento de servicios
- `config-server`: Centraliza las configuraciones externas de los microservicios

---

## Tecnologías utilizadas

- Spring Boot 3.x
- Spring Cloud Netflix Eureka
- Spring Cloud Config
- Spring Security + JWT
- Feign Client
- JPA + H2
- Docker y Docker Compose
- Postman (para pruebas)
- Actuator (para monitoreo)

---

## Endpoints Principales

### Eureka Server

Registro central de microservicios Accesible en 
`http://localhost:8761`

### config Server

Registro secundario de microservicios Accesible en 
`http://localhost:8888

### Usuarios Servicio
- `POST /auth/registro`: Registro de usuario
- `POST /auth/login`: Login de usuario (retorna JWT)
- `GET /usuarios/perfil`: Devuelve datos del usuario autenticado (requiere token)

### Asignaturas Servicio
- `POST /asignaturas`: Crear asignatura
- `GET /asignaturas`: Listar asignaturas

### Matrículas Servicio
- `POST /matriculas`: Registrar estudiante en asignatura (requiere token)
- `GET /matriculas`: Listar matrículas

---
## Autenticación y Seguridad

Este sistema implementa seguridad JWT. Al hacer login, se devuelve un **token JWT** que debe enviarse en cada solicitud protegida:

```
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

Sin este token, el microservicio `matriculas-servicio` devolverá `401 Unauthorized`.

---

## Cómo ejecutar localmente

### Requisitos
- Java 17+
- Maven
- Docker (opcional, para despliegue)

### Pasos

1. Clona este repositorio
2. Compila cada microservicio:
   
3. Ejecuta manualmente cada microservicio en este orden:
   - `eureka-server`
   - `config-server`
   - `usuarios-servicio`
   - `asignaturas-servicio`
   - `matriculas-servicio`


## Despliegue con Docker Compose

Puedes levantar todo el entorno ejecutando:

docker-compose up --build

Asegúrate de tener los `.jar` generados y los `Dockerfile` en cada microservicio.


## Pruebas

 Se puede probar usando Postman (colección incluida si se desea)
JWT debe ser incluido en los headers para pruebas protegidas
También se incluye un `GET /actuator/health` en cada servicio para verificar el estado




