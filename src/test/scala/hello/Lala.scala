import org.scalatest.FunSuite
import scala.collection.mutable.Stack
import spark.SparkContext
import SparkContext._
import hello.Count
import org.scalatest.BeforeAndAfter

class Lala extends FunSuite  with BeforeAndAfter {
	
	var sc: SparkContext = _

    before {
//println( "############start###############" ) 
    sc = new SparkContext( "local[4]" , "Simple Job" ) 
  }


  test("count ") {
    val logFile = "src/test/resources/syslog"
    val i = Count.countA(sc , logFile)
    assert( i == 1039 )
  }

  test("count 2 ") {
    val logFile = "src/test/resources/syslog"
    val i = Count.countA(sc , logFile)
    assert( i == 1039 )
  }

  after{
//println( "############end###############" ) 
        sc.stop
        sc = null
        System.clearProperty("spark.driver.port")
}
}

