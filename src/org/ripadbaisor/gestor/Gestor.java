package org.ripadbaisor.gestor;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.ripadbaisor.elementos.Restaurante;

public class Gestor {

  private static ArrayList<Restaurante> restaurantes= new ArrayList<>();

  public static void aniadirRestaurante(){
    String aniadirNombre = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
    String aniadirLocalizacion = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
    String aniadirHorario = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
    String aniadirPuntuacion = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
    Float puntuacion = Float.parseFloat(aniadirPuntuacion);
    
    Restaurante restaurante = new Restaurante(aniadirNombre, aniadirLocalizacion, aniadirHorario, puntuacion);
    Gestor.restaurantes.add(restaurante);
  }
  public static void editarRestaurante(){

  }

  public static void mostrarRestaurante(){

  }
  public static void eliminarRestaurante(){

  }
}
