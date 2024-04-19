package org.ripadbaisor.gestor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.ripadbaisor.elementos.Restaurante;

public class Gestor {
  private static ArrayList<Restaurante> restaurantes = new ArrayList<>();

  // Bloque estático para inicializar con elementos
  static {
    Restaurante r1 = new Restaurante("n1", "l1", "09:00-12:30", 1);
    Restaurante r2 = new Restaurante("n2", "l2", "12:00-14:30", 2);
    Gestor.restaurantes.add(r1);
    Gestor.restaurantes.add(r2);
  }
  
  public static void aniadirRestaurante(){
    try {
      String aniadirNombre = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
      String aniadirLocalizacion = JOptionPane.showInputDialog("Introduce Localizacion");
      String aniadirHorario = JOptionPane.showInputDialog("Introduce el Horario ", "08:00-12:30" );
      String aniadirPuntuacion = JOptionPane.showInputDialog("Introduce la Puntuacion");
      Float puntuacion = Float.parseFloat(aniadirPuntuacion);

      if (puntuacion >=1.0 && puntuacion <= 5.0 && verificacionHorario(aniadirHorario) ) {
        Restaurante restaurante = new Restaurante(aniadirNombre, aniadirLocalizacion, aniadirHorario, puntuacion);
        Gestor.restaurantes.add(restaurante);
        JOptionPane.showMessageDialog(null, "Informacion Introducida \n" + restaurante.toString());
      } else {
        JOptionPane.showMessageDialog(null,"Hubo un problema al introducir los datos, Restaurante no Registrado", "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null,"Introduce una puntuacion valida, en un intervalo del 1.0 - 5.0", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NullPointerException e) {
      JOptionPane.showMessageDialog(null,"UPS! FATAL ERROR \nIntentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
  }
  public static void editarRestaurante(){
    try {
      String nombreEditarRestaurante = JOptionPane.showInputDialog("Introduce el Nombre del Restaurante a Editar");
      int index = -1;
        // Obtenemos el indice del restaurante, si no lo encuentra se queda en -1
      for(int i = 0; i < restaurantes.size(); i++){
        if (restaurantes.get(i).getNombre().contains(nombreEditarRestaurante)) {
            index = i;
            break;
        }
      }
      if (index == -1) {
        JOptionPane.showMessageDialog(null,"Restaurante no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
      } else {
        String editarNombre = JOptionPane.showInputDialog("Introduce el nuevo Nombre del restaurante", restaurantes.get(index).getNombre());
        restaurantes.get(index).setNombre(editarNombre);
        String editarLocalizacion = JOptionPane.showInputDialog("Introduce Localizacion", restaurantes.get(index).getLocalizacion());
        restaurantes.get(index).setLocalizacion(editarLocalizacion);
        String editarHorario = JOptionPane.showInputDialog("Introduce el Horario", restaurantes.get(index).getHorario());
        String editarPuntuacion = JOptionPane.showInputDialog("Introduce la Puntuacion", restaurantes.get(index).getPuntuacion());
        Float puntuacionEditada = Float.parseFloat(editarPuntuacion);

        if (verificacionHorario(editarHorario) && puntuacionEditada >= 1.0 && puntuacionEditada <= 5.0) {
          restaurantes.get(index).setHorario(editarHorario);
          restaurantes.get(index).setPuntuacion(puntuacionEditada);
          JOptionPane.showMessageDialog(null, "Restaurante actualizado correctamente.");
        } else {
          JOptionPane.showMessageDialog(null,"Ups! FATAL ERROR \nRestaurante no Actualizado Correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
      catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"UPS! FATAL ERROR \nPuntuacion valida: 1.0 - 5.0", "Error", JOptionPane.ERROR_MESSAGE);
      }catch(NullPointerException e){
        JOptionPane.showMessageDialog(null,"UPS! FATAL ERROR \nIntentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
      }
}
  public static void mostrarRestaurante(){
    if(restaurantes.isEmpty()){
      JOptionPane.showMessageDialog(null, "No hay restaurantes introducidos");
    } else {
      ArrayList<Restaurante> restaurantesOrdenados = new ArrayList<>();
      // Copia temporal para no modificar la lista original
      ArrayList<Restaurante> tempRestaurantes = new ArrayList<>(restaurantes);
      // Ordenar restaurantes por puntuación de mayor a menor
      while (!tempRestaurantes.isEmpty()) {
        int maxIndex = 0;
        for (int i = 1; i < tempRestaurantes.size(); i++) {
          if (tempRestaurantes.get(i).getPuntuacion() > tempRestaurantes.get(maxIndex).getPuntuacion()) {
            maxIndex = i;
          }
        }
        restaurantesOrdenados.add(tempRestaurantes.remove(maxIndex)); // Añade y elimina de la lista temporal
      }
      int contador = 1;
      for (Restaurante restauranteElementos : restaurantesOrdenados) {
        JOptionPane.showMessageDialog(null, "Lista Restaurantes\n" + "Restaurante número: "+ (contador++) + " \n" + restauranteElementos.toString());
      }
    }
  }
  public static void eliminarRestaurante(){
    String nombreEliminarRestaurante = JOptionPane.showInputDialog("Introduce el Nombre del Restaurante a Eliminar");
    int indice = -1;
    // Obtenemos el indice del restaurante, si no lo encuentra se queda en -1
    for(int i = 0; i < restaurantes.size(); i++){
      if (restaurantes.get(i).getNombre().contains(nombreEliminarRestaurante)) {
        indice = i;
        break;
      }
    }
    if (indice == -1 && nombreEliminarRestaurante == null){
      JOptionPane.showMessageDialog(null, "Restaurante no encontrado.");
    } else {
      restaurantes.remove(indice);
      JOptionPane.showMessageDialog(null, "Restaurante eliminado.");
    }
  }
  public static boolean verificacionHorario(String horario){
    boolean verificacionHorario;
    Pattern moldeHorario = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]-([01]?[0-9]|2[0-3]):[0-5][0-9]");   
    Matcher horarioValido = moldeHorario.matcher(horario);
    if(horarioValido.matches()){
      verificacionHorario = true;
      return verificacionHorario;
    }else{
      JOptionPane.showMessageDialog(null,"Horario no Valido", "Error", JOptionPane.ERROR_MESSAGE);
      verificacionHorario = false;
      return verificacionHorario;
    }
  }
}
