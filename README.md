# Biblioteca_Java
Indice: <br>
* Explicación del proyecto <br>
* Explicación de metodos <br>
* Explicación de librerias <br>
* Conclusión y opinon del proyecto <br>

# Explicación del proyecto
<p>
El proyecto fue creado en base a un documento en el que nos indicaban las pautas a seguir, en este documento nos decribian que debiamos hacer un programa de java basado en una biblioteca en la cual habia varias clases : <br>

La clase Biblioteca que posee los atributos nombre una lista de libros y una lista de personal. En la clase Biblioteca podemos encontrar los metodos de "mostrarLibros()" y "mostrarLibrosDisponibles()" los cuales explicaremos en el siguiente punto con más exactitud, más allá de eso encontramos los contructores, getters y lo setters de los atributos de la clase y por ultimo un toString para poder imprimirlos por pantalla. <br>

La clase Libro la cual posee los atributos de ISBN, título, autor, editorial, copias, copiasDisponibles y un contador para poder conocer la cantidad de titulos diferenetes que hay, este contador se podria decir que actua como un id para cada titulo. Posteriormente podemos encontrar varios metodos los cuales son "AñadirLibro()", "EliminarLibro()", "BuscarISBN()" y "BuscarTitulo()", Una vez dicho esto al igual que la clase anterior cuenta con constructores, getters, setters y un toString. <br>

La clase Persona esta clase actuara como clase padre de Usuario y Bibliotecario es decir que las clases hijas heredaran los atributos de la clase Persona, la clase Persona se compone por los atributos de nombre, apellidos, nif y contraseña. Esta clase carece de metodos ya que las clases hijas se encargaran de tener sus propios metodos haciendo referencia a la clase Persona.Y por ultimo al igual que las anteriores esta clase posee contructores, getters, setters y toString.<br>

La clase Usuario al ser clase hija de Persona como hemos indicado anteriormente tendra sus propios atributos y a parte los de su clase padre, en este caso Persona, la clase Usuario tiene como atributos la cantidad de reservas que tiene, el nombre del titulo reservado y el isbn reservado y como metodos hay "CrearUsuario()", "EliminarUsuario()", "Reserva()" y "Devolver()". <br>

La clase Bibliotecario al igual que Usuario es clase hija de Persona y a parte de tener los atributos de la clase persona tiene una lista de bibliotecarios y como metodos unicamente tiene "AñadirBibliotecario()" y "EliminarBibliotecario()".<br>

Por ultimo tenemos la clase principal que consta de un menu para poder ejecutar cada uno de los metodos.

</p>

# Explicación de los metodos
