# main

En el ejecutable tenemos creado un nuevo menu y ejecutamos el metodo mostrar menu para que se pueda mostrar

# Restaurante 

Se creo la clase restaurante con los atributos y metodos de acceso correspondientes, posteriormente sobreescribimos el metodo toString para que podamos mostrar la informacion del restaurante

# Menu

Se creo un metodo mostrar menu en el que se muestran las distintas opciones que el usuario puede seleccionar, posteriormente le pasamos la opcion que introdujo el usuario al metodo caso usuario para que de acuerdo a dicha opcion ejecute el metodo correspondiente


# Gestor 

Se creo el arrayList de objetos de tipo Restaurante para almacenar la infromacion correspondiente de cada restaurante en las posiciones de este.

Se crearon unos restaurantes por defecto

## Metodo aniadirRestaurante(): 
Solicitamos al usuario la informacion al usuario mediante paneles y la registramos si esta introducida de manera adecuada, respetando el formato de alguno de los items, por ejemplo horario, puntuacion

## Metodo editarRestaurante():
Solicitamos el nombre del restaurante para editar dicha informacion 
Si el nombre esta puesto de manera adecuada nos mostrara mas paneles que nos indicaran la informacion a modificar con su respectivo placeholder para que el usuario no se confunda y pueda almacenar nueva informacion de la que estaba antes registrada. 

Validamos si la el horario y la puntuacion estan puestos de manera adecuada y guardamos la infromacion de lo contrario saltara error

## Metodo mostrarRestaurante():

Si la lista de restaurantes no esta vacia creamos dos arrayList secundarios y dependiendo de si el indice es distinto a "-1" ( es decir que existe ) para que nos pueda mostrar la infromacion de manera desendente realizamos un .remove en la ultima posicion y luego lo añadimos de primera posicion con el .add y almacenamos esa informacion en el arrayList auxiliar restaurantesOrdenados luego realizamos un foreEach para recorrer este nuevo array y mostrar la informacion

## metodo eliminarRestaurante()

Al introducir el nombre del restaurante de manera adecuada se busca el indice de acuerdo al nombre introducido si lo encuentra actualizamos la variable auxiliar indice, si coincide lo eliminamos con un .remove 
si no nos da el error de que no se consiguio el restaurante 

## metodo verificacionHorario():

Con este metodo podemos valiar si el horario introducido es valido de acuerdo con una expresion regular que nos retorna true/false si coincide o no con esa regla 
