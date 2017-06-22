package eg.mallik.config

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    val config = ConfigObject.config.toString
    println(s"config: $config")
  }

}
