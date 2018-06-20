package uy.edu.ude.app

data class EstudianteKotlin(val nombre: String,
                            val puntaje: Int? = null)

fun main(args: Array<String>) {
  val estudiantes: List<EstudianteKotlin> = listOf(EstudianteKotlin("Julia"),
      EstudianteKotlin("Marco", puntaje = 12))
  val mayorPuntaje = estudiantes.maxBy { it.puntaje ?: 0 }
  println("El mayor puntaje en Kotlin es de: $mayorPuntaje")
}