import org.scalatest.FunSuite
import scala.collection.mutable.Stack
import spark.SparkContext
import SparkContext._
import hello.Count

class Lala extends FunSuite {
  test("count ") {
    val logFile = "src/test/resources/syslog"
    val sc = new SparkContext( "local" , "Simple Job" ) 
    val i = Count.countA(sc , logFile)
    assert( i == 1039 )
  }
}

