# main

En el ejecutable tenemos creado un nuevo menú y ejecutamos el método mostrar menú para que se pueda mostrar

# Restaurante 

Se creo la clase restaurante con los atributos y métodos de acceso correspondientes, posteriormente sobrescribimos el método toString para que podamos mostrar la información del restaurante

# Menú

Se creo un método mostrar menú en el que se muestran las distintas opciones que el usuario puede seleccionar, posteriormente le pasamos la opción que introdujo el usuario al método caso usuario para que de acuerdo a dicha opción ejecute el método correspondiente


# Gestor 

Se creo el arrayList de objetos de tipo Restaurante para almacenar la información correspondiente de cada restaurante en las posiciones de este.

Se crearon unos restaurantes por defecto

## Método aniadirRestaurante(): 
Solicitamos al usuario la información al usuario mediante paneles y la registramos si esta introducida de manera adecuada, respetando el formato de alguno de los ítems, por ejemplo horario, puntuación

## Método editarRestaurante():
Solicitamos el nombre del restaurante para editar dicha información 
Si el nombre esta puesto de manera adecuada nos mostrara más paneles que nos indicaran la información a modificar con su respectivo placeholder para que el usuario no se confunda y pueda almacenar nueva información de la que estaba antes registrada. 

Validamos si la el horario y la puntuación están puestos de manera adecuada y guardamos la información de lo contrario saltara error

## Método mostrarRestaurante():

Si la lista de restaurantes no está vacía creamos dos arrayList secundarios y dependiendo de si el índice es distinto a "-1" ( es decir que existe ) para que nos pueda mostrar la información de manera descendente realizamos un .remove en la última posición y luego lo añadimos de primera posición con el .add y almacenamos esa información en el arrayList auxiliar restaurantesOrdenados luego realizamos un foreEach para recorrer este nuevo array y mostrar la información

## método eliminarRestaurante()

Al introducir el nombre del restaurante de manera adecuada se busca el índice de acuerdo al nombre introducido si lo encuentra actualizamos la variable auxiliar índice, si coincide lo eliminamos con un .remove 
si no nos da el error de que no se consiguió el restaurante 

## método verificacionHorario():

Con este método podemos valiar si el horario introducido es válido de acuerdo con una expresión regular que nos retorna true/false si coincide o no con esa regla 


[ <- Volver](/README.md)
