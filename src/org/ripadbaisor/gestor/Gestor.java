package org.ripadbaisor.gestor;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.ripadbaisor.elementos.Restaurante;

public class Gestor {

  private static ArrayList<Restaurante> restaurantes= new ArrayList<>();

  public static void aniadirRestaurante(){
    String aniadirNombre = JOptionPane.showInputDialog("Introduce el Nombre del restaurante");
    Restaurante restaurante = new Restaurante(aniadirNombre, null, null, 0);
    Gestor.restaurantes.add(restaurante);
  }
  public static void editarRestaurante(){

  }

  public static void mostrarRestaurante(){

  }
  public static void eliminarRestaurante(){

  }
}
