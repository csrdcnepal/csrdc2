
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
<div class="bx">
    <img src="assets/images/services/slider.gif" style="margin-top:81px">
</div>
  <div id="services" class="content-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h1 class="section-title">Our Services</h1>
          <div class="col-md-3 col-sm-6">
            <div class="service-item">
              <span><img src="assets/images/services/data.png" width="200px", height="200px"></span>
              <h3>Data Science </h3>
              <p>We maintain the data repositories and databases required to improve business
                and research by applying data mining and visualization techniques.</p>
            </div> <!-- /.service-item -->
          </div><!-- /.col-md-6 -->
          <div class="col-md-3 col-sm-6">
            <div class="service-item">
              <span><img src="assets/images/services/bigdata.png" width="200px", height="200px"></span>
              <h3>Big Data Analytics</h3>
              <p>We provide the solutions and ideas, how the voluminous big data can be useful to improve your business
                and research using the big data technologies and tools like Hadoop and Apache Spark.</p>
            </div> <!-- /.service-item -->
          </div> <!-- /.col-md-3 -->
          <div class="col-md-3 col-sm-6">
            <div class="service-item">
              <span><img src="assets/images/services/ml.png" width="200px", height="200px"></span>
              <h3>Machine Learning</h3>
              <p>We implement machine learning algorithms to develop data processing pipeline.
                We process voluminous data in parallel distributed neural networks.</p>
            </div> <!-- /.service-item -->
          </div> <!-- /.col-md-3 -->
          <div class="col-md-3 col-sm-6">
            <div class="service-item">
              <span><img src="assets/images/services/software.jpg" width="200px", height="200px"></span>
              <h3>Software Development</h3>
              <p>We build reactive web applications, responsive mobile applications and cloud based software.</p>
            </div> <!-- /.service-item -->
          </div> <!-- /.col-md-3 -->
        </div>
      </div> <!-- /.row -->
    </div> <!-- /.container -->
  </div> <!-- /#services -->
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
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/services.scala.html
                  HASH: a39f9da9d209898a213bb226d61695fb657bd143
                  MATRIX: 615->0
                  LINES: 25->1
                  -- GENERATED --
              */
          