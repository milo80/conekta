import operaciones.CalculaNumeroFaltante
import org.scalatest.FunSuite

class CalculaNumeroFaltanteTest extends FunSuite{
  val CNF = new CalculaNumeroFaltante()
  test("ExtractNumber 50"){
    assert(CNF.extract(50) === true)
    assert(CNF.calc_extracted() > 0)
  }
  test("ExtractNumber 0"){
    assert(CNF.extract(0) === false)
    assert(CNF.calc_extracted() > 0)
  }
  test("ExtractNumber 101"){
    assert(CNF.extract(101) === false)
    assert(CNF.calc_extracted() > 0)
  }

}
