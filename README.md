# Prueba técnica spring boot: Ingerencia

## Consigna

Crear una api rest que se comunique con la API pública


## Tecnologías utilizadas para implementar la solución.

* Lenguaje: java versión 11
* Framework: spring boot.
* Librerias: mockito para los tests, jacoco para la cobertura, springdoc-openapi-ui para documentar los servicios rests, lombok
* Docker


## Instalación  del proyecto
1. **Descargar código fuente**

```console
git clone https://github.com/baezjm/ingerencia.git
```

2. **Compilar**

```console
mvn clean install
```

3. **Correr el proyecto localmente**

```console
mvn spring-boot:run
```

4. **Generar imagen de docker**

```console
docker build -t challenge/ingerencia .
```

5. **Levantar imagen de docker**

```console
docker run -p 8080:8080 challenge/ingerencia
```

6. **Urls**

   [Documentación de la api: Swagger](http://localhost:8080/swagger-ui.html)

![](/documentation.png)

7. **Invocación a servicios**

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/4233576-741c460a-51bf-4470-8eb2-c9e576e31a80?action=collection%2Ffork&collection-url=entityId%3D4233576-741c460a-51bf-4470-8eb2-c9e576e31a80%26entityType%3Dcollection%26workspaceId%3D3f974e89-c3e3-4797-b2fe-4819f5c1178a#?env%5BLOCAL%5D=W3sia2V5IjoiUEFUSCIsInZhbHVlIjoibG9jYWxob3N0OjgwODAiLCJlbmFibGVkIjp0cnVlfV0=)

* Get News

```console
curl --location --request GET 'localhost:8080/api/news/language/java'
```

## Tests

**Ejecución de tests: el mismo corre jacoco para medir cobertura**
```console
 mvn clean test
```

![](/jacoco.png)

El resultado queda en:

```console
 ../target/site/jacoco/index.html
```
