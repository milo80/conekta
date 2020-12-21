package calcula_numero

import operaciones.CalculaNumeroFaltante

object Main extends App{
  val CNF = new CalculaNumeroFaltante()
  CNF.extract(100)
  val NumberExtradite = CNF.calc_extracted()
  println(s"Numero extraido = $NumberExtradite")
}
