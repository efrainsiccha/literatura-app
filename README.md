<img src="https://github.com/efrainsiccha/literatura-app/assets/163354946/b49173fb-1b5e-438e-a8a8-b03d4692ae35" alt="owl-8185589_1280" width="200px" height="200px" align="right" />

## LITERATURA APP

Proyecto para el programa ONE-Backend. La aplicación está creada con Java 17 utilizando el framework Spring y JPA para gestionar las consultas y el almacenamiento de datos en una base de datos MySQL. Se integra con la API de [Gutendex](https://gutendex.com/), permitiendo consultar libros de dicha API y almacenarlos en la base de datos para su uso posterior en los distintos menús de la aplicación.

### Funcionalidades de la app

En esta app te encuentras nueve opciones:

        1- Buscar libro por título.
        2- Listar libros registrados.
        3- Listar autores registrados.
        4- Listar autores vivos en un determinado año.
        5- Listar libros por idioma.
        6- Estadisticas de los libros descargados.
        7- Listar libros más descargados de la API gutendex.
        8- Listar libros más descargados en nuestro registro.
        9- Buscar autor por nombre.
        0- Salir.
    
Te dejo aquí los atajos para que puedas verlas de forma más rápida:

- [1. Buscar libro por titulo](#buscar-libro-por-titulo)
- [2. Listar libros registrados](#ver-listado-de-libros-registrados)
- [3. Listar autores registrados](#ver-listado-de-autores-registrados)
- [4. Listar autores vivos en un determinado año](#ver-listado-de-autores-vivos-en-un-determinado-año)
- [5. Listar libros por idioma](#listar-libros-por-idioma)
- [6. Estadisticas de los libros registrados](#mostrar-estadisticas-de-los-libros-registrados)
- [7. Listar libros más descargados de la API gutendex](#listar-libros-más-descargados-de-la-API-gutendex)
- [8. Listar libros más descargados de nuestro registro](#listar-libros-más-descargados-de-la-base-de-datos)
- [9. Buscar autor por nombre](#buscar-autor-por-nombre)

A continuación exploramos cada opción del menú:

### Buscar libro por titulo

Primero se realiza una consulta a la API Gutendex para buscar su libro. La app de fondo valida si el libro ya se encuentra registrado en la db, en tal caso solo mostrará el libro que ya esta registrado para evitar duplicados. 
De misma forma, se toma la lista de autores y se realiza una busqueda en la db, asi, si el autor ya existe lo traemos para hacer la relación con el nuevo libro (si no esta registrado el libro) o se crea el nuevo autor en caso de no encontrar ninguno en la db.
Una vez completadas todas las acciones, imprime en consola la nueva instancia creada.

Es importante notar que no es necesario anotar el titulo completo del libro.
Ejemplo de uso:

![Captura de pantalla 2024-07-06 150626](https://github.com/efrainsiccha/literatura-app/assets/163354946/1e963f9a-a96d-4e25-a28e-6127802abfb0)

### Ver listado de libros registrados

Se realiza una consulta a la base de datos trayendo todos los libros registrados, posterior a ello se imprimen en consola todos. Finalmente, muestra cuantos libros hay registrados en total.
Se muestran en orden de registro.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/a1cd2f7b-350b-4bde-80fc-c7ba553df655)

### Ver listado de autores registrados

Esta función actua igual que la de listar libros, se realiza una consulta a la db para traer a todos los autores e imprimirlos.
Adicionalmente muestra todos los libros relacionados a cada autor.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/3919af71-a296-4118-a830-4e99ea65518c)

### Ver listado de autores vivos en un determinado año

Se realiza una consulta a los autores de la base de datos filtrandolos por dos condiciones: 1) que su año de nacimiento sea menor o igual al parametro dado. 2) que su año de fallecimiento sea mayor o igual al parametro dado.
Así, se garantiza que el listado resultante de autores sean aquellos que estuvieron vivos al rededor del año dado.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/5a98a3c7-b9fc-4e11-afc8-0e9fd1768559)

### Listar libros por idioma

En primer lugar, se muestra un pequeño menú con los idiomas disponibles. Después de ingresar la abreviatura del idioma deseado, se obtendrá de la base de datos el listado de libros que tengan ese idioma en su columna "language".
Ejemplo:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/a477a37f-480c-495a-b2ea-b7e301e0e677)

### Mostrar estadisticas de los libros registrados

En esta opcion se toma todo el listado de libros registrados en la base de datos, se toma la propiedad de "downloads" de cada uno para poder generar las estadisticas pertinentes a partir de la clase DoubleSummaryStatistics de Java.

Finalmente, se presenta un resumen de las estadisticas más importantes en cuestion de descargas de todos los libros registrados, como la media, el dato maximo, etc.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/55e13e00-d4d0-4bc1-9d86-fb3d7eee2f6a)

### Listar libros más descargados de la API gutendex

Aquí traemos el listado general de libros de la API gutendex y filtramos los 10 más descargados. Por defecto la API misma trae en su primera página los trae por los más descargados en orden descendente, asi que solo traemos los primeros 10.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/a7291c6f-b566-4962-a880-3beee01dcb5d)

### Listar libros más descargados de la base de datos

Se hace una consulta a la base de datos para que traiga de forma descendente 10 libros segun la cantidad de descargas, asi, obtenemos los 10 más descargados que hay registrados.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/7d75d012-3b0b-459c-93f0-cce87425da7d)

### Buscar autor por nombre

Aquí damos uso de las JPA Derived queries para consultar un autor por nombre en la db a partir de si el nombre esta contenido, ignorando el case sensitive.
Esta funcionalidad de usó en la primera opcion para poder buscar autores registrados y decidir si crearlos o no.
Ejemplo de uso:

![image](https://github.com/efrainsiccha/literatura-app/assets/163354946/472a1883-a3ce-4c64-b273-42f40a6c8ceb)
