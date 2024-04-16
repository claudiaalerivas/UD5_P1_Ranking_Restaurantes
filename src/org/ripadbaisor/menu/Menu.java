package org.ripadbaisor.menu;
import javax.swing.*;
public class Menu {

public void mostrarMenu(){
  JOptionPane.showInputDialog("""
      1. Añadir Restaurante    
      2. Editar Restaurante    
      3. Mostrar Restaurantes    
      4. Eliminar Restaurantes    
      Q. Salir del programa     
    """);
  }
}