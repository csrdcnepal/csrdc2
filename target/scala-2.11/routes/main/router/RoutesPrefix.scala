
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ujjwal/Downloads/csrdc2-master/conf/routes
// @DATE:Fri Jul 22 09:49:16 NPT 2016


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
