# Desarrollo Web Integral

Spring Boot API for student management. The application lives in `demo/` and currently defines the student entity and DTO used for persistence and JSON conversion.

## Stack

- Java 21
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Lombok
- Jackson 3 (`tools.jackson`)
- Maven Wrapper

## Project layout

```
demo/
  src/main/java/
    ojeda/com/demo/   DemoApplication
    model/            StudentModel (JPA entity, table estudiante)
    dto/              StudentDto
  src/main/resources/
    application.properties
    application-dev.properties
```

`StudentModel` maps to the `estudiante` table (`nombre`, `apellido`, `telefono`, `email`). `StudentDto` and `StudentModel` convert to each other with `toModel()` and `toDto()`.

## Requirements

- JDK 21 or later
- Maven (or use the wrapper in `demo/`)
- PostgreSQL (required once a datasource is configured)

## Run

From `demo/`:

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=dev"
```

In the IDE, use the **DemoApplication** launch configuration (profile `dev`).

## Build

```bash
./mvnw compile
./mvnw test
```

Jackson 3 uses `tools.jackson.databind.json.JsonMapper`, not Jackson 2's `com.fasterxml.jackson.databind.ObjectMapper`.
