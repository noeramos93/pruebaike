# pruebaike
prueba de microservicios

Se configuro para que el puerto donde se levante sea el 8081
se configuro para que el gestor de base de datos fuera Mysql

*para consumir el servicios de insercion de estudiante en un manejador de peticiones como postman 
se utiliza la siguiente ruta con el metodo post

localhost:8081//school/api/students/

y en el body se usa la siguiente estructura

{
    "nameStudent":"Arturo",
    "lastNameStudent":"Nicolas",
    "motherLastNameStudent":"Pacheco"
}

*para consumir el servicios de consulta de todos los estudiantes en un manejador de peticiones como postman 
se utiliza la siguiente ruta con el metodo get

localhost:8081//school/api/students/


