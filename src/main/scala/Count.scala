package hello

import spark.SparkContext
import spark.RDD
import SparkContext._

object Count {
  def countA(sc: SparkContext , logFile: String) : Long = {
    val logRDD = sc.textFile(logFile, 2).cache()
    val numAs = logRDD.filter(line => line.contains("a")).count()
    //val numBs = logData.filter(line => line.contains("b")).count()
    //println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
    return numAs 
  }
}
