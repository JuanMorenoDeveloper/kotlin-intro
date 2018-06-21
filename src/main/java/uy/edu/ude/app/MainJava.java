package uy.edu.ude.app;

import static java.util.Comparator.comparingInt;

import java.util.List;

class MainJava {

  public static void main(String[] args) {
    final var estudiantes = List
        .of(new EstudianteJava("Julio"), new EstudianteJava("María", 12));
    final var mayorPuntaje = estudiantes.stream().max(comparingInt(p -> {
      if (p.getPuntaje() == null) {
        return 0;
      } else {
        return p.getPuntaje();
      }
    }));
    System.out
        .println(String.format("El mayor puntaje en Java es de: %s", mayorPuntaje.orElse(null)));
  }
}
