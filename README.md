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

