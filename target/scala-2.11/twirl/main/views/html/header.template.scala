
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
  <head lang="en">
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <div id="front">
      <div class="site-header">
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-sm-6 col-xs-6">
              <div id="logo">
                <a href=""""),_display_(/*14.27*/routes/*14.33*/.Application.index),format.raw/*14.51*/("""#front">
                <img src="assets/images/services/logo.png" width = "55px", height = "55px" ></a>
              </div> <!-- /.logo -->
            </div> <!-- /.col-md-4 -->
            <div class="col-md-8 col-sm-6 col-xs-6">
              <a href="#" class="toggle-menu"><i class="fa fa-bars"></i></a>
              <div class="main-menu">
                <ul>
                  <li><a href=""""),_display_(/*22.33*/routes/*22.39*/.Application.index),format.raw/*22.57*/("""#front">Home</a></li>
                  <li><a href=""""),_display_(/*23.33*/routes/*23.39*/.Application.index),format.raw/*23.57*/("""#services">Services</a></li>
                  <li><a href=""""),_display_(/*24.33*/routes/*24.39*/.Application.index),format.raw/*24.57*/("""#career">Careers</a></li>
                  <!--<li><a href=""""),_display_(/*25.37*/routes/*25.43*/.Application.blog),format.raw/*25.60*/("""">Blog</a></li>-->
                  <li><a href=""""),_display_(/*26.33*/routes/*26.39*/.Application.index),format.raw/*26.57*/("""#about">About</a></li>
                  <li><a href=""""),_display_(/*27.33*/routes/*27.39*/.Application.index),format.raw/*27.57*/("""#contact">Contact</a></li>
                </ul>
              </div><!-- /.main-menu -->
            </div> <!-- /.col-md-8 -->
          </div> <!-- /.row -->
          <div class="row">
            <div class="col-md-12">
              <div class="responsive">
                <div class="main-menu">
                  <ul>
                    <li><a href=""""),_display_(/*37.35*/routes/*37.41*/.Application.index),format.raw/*37.59*/("""#front">Home</a></li>
                    <li><a href=""""),_display_(/*38.35*/routes/*38.41*/.Application.index),format.raw/*38.59*/("""#services">Services</a></li>
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.Application.index),format.raw/*39.59*/("""#career">Careers</a></li>
                    <!--<li><a href=""""),_display_(/*40.39*/routes/*40.45*/.Application.blog),format.raw/*40.62*/("""">Blog</a></li>-->
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.Application.index),format.raw/*41.59*/("""#about">About</a></li>
                    <li><a href=""""),_display_(/*42.35*/routes/*42.41*/.Application.index),format.raw/*42.59*/("""#contact">Contact</a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div> <!-- /.container -->
      </div> <!-- /.site-header -->
    </div>
      
  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/header.scala.html
                  HASH: add05cbf71c3a58b64f888140b9b13f0247cc18d
                  MATRIX: 611->0|968->330|983->336|1022->354|1452->757|1467->763|1506->781|1587->835|1602->841|1641->859|1729->920|1744->926|1783->944|1872->1006|1887->1012|1925->1029|2003->1080|2018->1086|2057->1104|2139->1159|2154->1165|2193->1183|2581->1544|2596->1550|2635->1568|2718->1624|2733->1630|2772->1648|2862->1711|2877->1717|2916->1735|3007->1799|3022->1805|3060->1822|3140->1875|3155->1881|3194->1899|3278->1956|3293->1962|3332->1980
                  LINES: 25->1|38->14|38->14|38->14|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42
                  -- GENERATED --
              */
          