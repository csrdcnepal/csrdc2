
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  <div class="site-footer">
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-sm-6">
          <span id="copyright">
            <br>
              &copy;2016 www.csrdcnepal.us | All rights reserved.
          </span>

        </div> <!-- /.col-md-6 -->
        <div class="col-md-4 col-sm-6">
          <span id="csrdc" style = "text-align : center">
                             CSRDC Nepal <br>
                  Shankhamul - 34, Kathmandu, Nepal<br>
                    Contact: +9779851217037, +9779841581398
          </span>

        </div>
        <div class="col-md-4 col-sm-6">
          <ul class="social">
            <br>
            <li>Follow us:</li>
            <li></li>
            <li><a href="https://www.facebook.com/csrdcnepal.us/" class="fa fa-facebook"></a></li>
            <li><a href="https://twitter.com/csrdcnepal" class="fa fa-twitter"></a></li>
            <li><a href="https://np.linkedin.com/in/csrdc-nepal-a76795123" class="fa fa-linkedin"></a></li>
            <li><a href="https://www.github.com/csrdcnepal" class="fa fa-github"></a></li>
          </ul>
        </div> <!-- /.col-md-6 -->
      </div> <!-- /.row -->
    </div> <!-- /.container -->
  </div> <!-- /.site-footer -->
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
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/footer.scala.html
                  HASH: 411cc048029a16976c42a7ccf3b9d2e4f935537b
                  MATRIX: 611->0
                  LINES: 25->1
                  -- GENERATED --
              */
          