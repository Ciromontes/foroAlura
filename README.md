# foroAlura
CRUD en base de datos
API creada con Spring Boot y que se utiliza MySQL como base de datos.

![imagenForo](https://github.com/Ciromontes/foroAlura/assets/93849067/b13c4147-6788-4e88-9912-6af1dc9e643a)

REQUISITOS:

Java 17 o superior
MySQL 5.7 o superior
Postman u otro cliente REST para probar la API como insomnia

CONFIGURACIÓN:
git clone https://github.com/Ciromontes/foroAlura.git

Descarga y configuración de la base de datos MySQL
Configuración de la conexión a la base de datos en el proyecto de Spring Boot
Ejecución del proyecto en local

USO:
## Iniciar sesión en la tabla usuarios

Para acceder a la API protegida por Spring Security, debes autenticarte utilizando las credenciales de un usuario registrado en la tabla usuarios de la base de datos (recuerda crear tu tabla de datos llamada usuarios).

A continuación, se muestra un ejemplo de cómo puedes logearte utilizando el formato JSON:

```json
{
	"login": "Mi.Nombre",
	"clave": 123456
}
Reemplaza "Mi.Nombre" con el nombre de usuario deseado y "123456" con la contraseña correspondiente que desees.

Una vez que hayas proporcionado las credenciales correctas, recibirás un token de autenticación válido para acceder a los recursos protegidos de la API.

Recuerda que las contraseñas almacenadas en la base de datos están encriptadas con el algoritmo bcrypt para garantizar la seguridad de las cuentas de usuario.

la app crea una tabla en mysql con el nombre: topicos2

/topicos (POST): Permite registrar un nuevo tópico con los campos requeridos (id, título, mensaje, fecha de creación, estatus, autor y curso).
/topicos (GET): Devuelve la lista de todos los tópicos registrados en formato JSON.
/topicos/{id} (PUT): Permite actualizar los campos de un tópico específico identificado por su ID.
/topicos/{id} (DELETE): Permite eliminar un tópico específico identificado por su ID.
También es recomendable incluir ejemplos de solicitudes y respuestas para cada uno de los endpoints.

ejemplo:

Endpoints
A continuación, se detallan los endpoints disponibles:

POST /topicos
Crea un nuevo tópico.

Ejemplo de cuerpo de solicitud en formato JSON:


{
  "titulo": "Principios SOLID en programación orientada a objetos",
  "mensaje": "¿Cómo se aplican los principios SOLID en la programación orientada a objetos?",
  "autor": "Alice",
  "curso": "CIENCIAS_COMPUTACION"
}
La API no permite registros duplicados (que contengan el mismo título y mensaje).

GET /topicos
Obtiene la lista de todos los tópicos.

PUT /topicos/{id}
Actualiza un tópico existente.

Ejemplo de cuerpo de solicitud en formato JSON:

{
  "titulo": "Principios SOLID en programación orientada a objetos",
  "mensaje": "¿Cómo se aplican los principios SOLID en la programación orientada a objetos?",
  "autor": "Alice",
  "curso": "CIENCIAS_COMPUTACION"
}
La API no permite registros duplicados (que contengan el mismo título y mensaje).

DELETE /topicos/{id}
Elimina un tópico existente.

REGLAS DEL NEGOCIO

Todos los campos son obligatorios al registrar un nuevo tópico.
La API no permite registros duplicados (títulos y mensajes iguales).
Las mismas reglas de negocio se aplican en la actualización y eliminación de un tópico.

CONTRIBUCIÓN
Si deseas comentar para reportar problemas o sugerir mejoras.

Autores
desafio de challenger Alura aceptado por Ciro Montes el creador de este repositorio

Licencia
software libre 

![imagenForo2](https://github.com/Ciromontes/foroAlura/assets/93849067/c052183f-5200-4219-873c-b0ab2c4f3231)
