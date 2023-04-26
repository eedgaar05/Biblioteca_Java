# Biblioteca_Java
Indice: <br>
* Explicación del proyecto <br>
* Explicación de metodos <br>

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
<p>
 <h2>Biblioteca</h2>
MostrarLibros(): Mediante un bucle for recorremos la lista de libros que tenemos y que hemos alamacenado previamente y vamos printeando todos los atributos del libro, para imprimirlos por pantalla lo harmos de la siguiente manera. Ej: "Clase.lista.get(i).getNombre()", en el anterior ejemplo podemos contemplar que para imprimirlo dentro del bucle for tenemos que indicar la clase, el nombre de la lista luego utilizar "get(i)" para obtener el indice y "getNombre" para obtener el valor del atributo Nombre en ese indice. <br>
 <br>
 
MostrarLibrosDisponibles(): El bucle for recorre cada elemento en una lista de libros (representados por objetos de la clase Libro) usando el índice i. Si una determinada copia de un libro tiene al menos una copia disponible (lo que se verifica a través de la función getCopiasDisponibles() del objeto Libro), la información del libro se imprime en la consola utilizando el método System.out.println().La información que se muestra para cada libro incluye el ISBN, el título, el autor, la editorial, el número total de copias, el número de copias disponibles y un contador para el número de veces que se ha prestado el libro. <br>
</p>

<p>
<h2>Libro</h2>
AñadirLibro():permite al usuario agregar un nuevo libro a una lista de libros (representados por objetos de la clase Libro). Primero, se crea un objeto Scanner para permitir al usuario ingresar información a través de la consola. A continuación, se solicita al usuario que proporcione información sobre el libro, como el ISBN, el título, el autor, la editorial y el número total de copias. Luego, se usa el método nextInt() del objeto Scanner para obtener el número de copias disponibles. Para garantizar que el número de copias disponibles no sea mayor que el número total de copias, se utiliza un bucle while que solicita al usuario que ingrese un nuevo número de copias disponibles si el número actual es mayor que el número total de copias. Finalmente, se crea un nuevo objeto Libro utilizando los datos ingresados por el usuario y se agrega a la lista de libros existente utilizando el método add() de la clase ArrayList. <br>
<br>

EliminarLibro():permite al usuario eliminar un libro de una lista de libros existente (representados por objetos de la clase Libro). Primero, se crea un objeto Scanner para permitir al usuario ingresar información a través de la consola. A continuación, se solicita al usuario que ingrese el ISBN del libro que desea eliminar. Luego, se usa un bucle for para recorrer cada elemento en la lista de libros y se compara el ISBN de cada libro con el ISBN ingresado por el usuario utilizando el método equals() de la clase String. Si se encuentra un libro con un ISBN que coincide con el ingresado por el usuario, se elimina ese libro de la lista utilizando el método remove() de la clase ArrayList. <br>
<br>

BuscarISBN(): permite al usuario buscar un libro específico en una lista de libros existente utilizando el ISBN del libro. Primero, se crea un objeto Scanner para permitir al usuario ingresar información a través de la consola. A continuación, se solicita al usuario que ingrese el ISBN del libro que desea buscar. Luego, se usa un bucle for para recorrer cada elemento en la lista de libros y se compara el ISBN de cada libro con el ISBN ingresado por el usuario utilizando el método equals() de la clase String. Si se encuentra un libro con un ISBN que coincide con el ingresado por el usuario, se muestra la información del libro por pantalla utilizando el método println() de la clase System.out. <br>
<br>

BuscarTitulo(): este metodo es exactamnete igual al alnterior el unico cambio notorio que se realiza es el cambio de ISBN a titulo. <br>
</p>

<p>
<h2>Usuario</h2>
Reserva():la función de reserva de un libro para un usuario. Primero se solicita al usuario que ingrese su nombre y su contraseña, luego se verifica si el usuario existe en la lista de usuarios y si su contraseña es correcta. Si es así, se le permite reservar un libro. Se le solicita al usuario que ingrese el título del libro que desea reservar y se busca en la lista de libros si hay algún libro con ese título. Si se encuentra un libro con ese título, se reduce en uno el número de copias disponibles del libro y se actualiza la información de la reserva del usuario. En particular, se actualiza el título y el ISBN del libro que el usuario ha reservado, y se incrementa en uno el número total de reservas realizadas por el usuario. Si el usuario ya ha reservado el máximo de 5 libros permitidos, no se permite realizar más reservas. Si el usuario no existe en la lista de usuarios o la contraseña es incorrecta, se muestra un mensaje de error. <br>
<br>

Devolver(): se encarga de permitir a un usuario devolver un libro que había reservado previamente. Primero, se pide al usuario que ingrese su nombre y contraseña para verificar su identidad. Luego, se busca en la lista de usuarios el usuario correspondiente a esos datos y se verifica si tiene reservas disponibles. Si es así, se le solicita que ingrese el título del libro que desea devolver y se busca en la lista de libros para encontrarlo. Si se encuentra el libro, se incrementa el número de copias disponibles del libro en uno y se actualiza la información del usuario para reflejar que ha devuelto un libro. Si el usuario no tiene reservas disponibles, se le notifica que no puede devolver más libros. Si no se encuentra al usuario en la lista de usuarios, se le notifica que su usuario o contraseña son incorrectos.<br>
<br>
</p>
