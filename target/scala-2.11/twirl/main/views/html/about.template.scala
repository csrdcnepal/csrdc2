
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  <div id="about" class="content-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h1 class="section-title">About Us</h1>
        </div> <!-- /.col-md-12 -->
      </div> <!-- /.row -->
      <div class="row">
        <div class="col-md-offset-2 col-md-8 text-center bigger-text">
          <p>Computer Science Research and Development Center Nepal is an US based company.
            It works to research in the field of Computer Science.
            Company's motto is abbreviated as ICC (Innovate, Contribute and Collaborate).
            Besides, CSRDC Nepal works in the domain of Data Science, Big Data Analytics and Artificial Intelligence. </p>
        </div>
      </div> <!-- /.row -->
    </div> <!-- /.container -->
  </div> <!-- /#about -->
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
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/about.scala.html
                  HASH: b0dab359f9b5630d81a2e160ea98cbfa5164971f
                  MATRIX: 609->0
                  LINES: 25->1
                  -- GENERATED --
              */
          