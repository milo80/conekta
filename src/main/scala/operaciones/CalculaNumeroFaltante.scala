package operaciones

class CalculaNumeroFaltante (var NumMax: Int = 100) {
  var NumLRem: List[Int] = List()

  def extract(Numero: Int): Boolean = {
    if (Numero < 1){
      println(s"Número ingresado fuera de rango [1, $NumMax]")
      false
    } else if (Numero > NumMax){
      println(s"Número ingresado fuera de rango [1, $NumMax]")
      false
    } else {
      println(s" El rango de números naturales es [ 1, $NumMax ]")
      val NumLista = List.range(1, NumMax+2)
      NumLRem = NumLista.filter(_ != Numero)
      println(NumLRem)
      true
    }
  }

  def calc_extracted(): Int = {
    var count = 1
    for (i <- NumLRem){
      if (i != count) {
        println(s" Se extrajo el número $count")
        return count
      }
      count += 1
    }
    println("No se encontró número faltante ..")
    count = -1
    count
  }

}
