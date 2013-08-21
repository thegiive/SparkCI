import org.scalatest.FunSuite
import scala.collection.mutable.Stack
import spark.SparkContext
import SparkContext._

class Lala extends FunSuite {

  test("pop is invoked on a non-empty stack") {
    val logFile = "/var/log/syslog" // Should be some file on your system
//    val sc = new SparkContext("local", "Simple Job", "$YOUR_SPARK_HOME",
 //     List("target/scala-2.9.3/simple-project_2.9.3-1.0.jar"))
    val sc = new SparkContext( "local" , "Simple Job" ) 
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
//    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
	assert( numAs == 1025 )
  }

}

