
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/erunandesu26/Documents/PRTravelServer/conf/routes
// @DATE:Thu Nov 17 01:10:28 AST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
