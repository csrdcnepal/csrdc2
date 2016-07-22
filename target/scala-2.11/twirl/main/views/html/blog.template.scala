
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blog_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class blog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta name="viewport" content="width=device-width initial-scale=1.0" charset="UTF-8">
  <title>Computer Science Research and Development Center Nepal.</title>
</head>
<body>
  """),_display_(/*8.4*/imports()),format.raw/*8.13*/("""
  """),_display_(/*9.4*/header()),format.raw/*9.12*/("""

    """),format.raw/*11.5*/("""<div id="content">
      <div id="colOne">
        <h2>What is Machine Learning ?</h2>
        <p><small>June 24th, 2016  by XYZ</small></p>
        <p><em><strong>Machine Learning</strong></em> is a method of data analysis that automates analytical model building. Using algorithms that iteratively learn from data, machine learning allows computers to find hidden insights without being explicitly programmed where to look. </p>
        <p>The iterative aspect of machine learning is important because as models are exposed to new data, they are able to independently adapt. They learn from previous computations to produce reliable, repeatable decisions and results. It’s a science that’s not new – but one that’s gaining fresh momentum.</p>
        <p>Because of new computing technologies, machine learning today is not like machine learning of the past. While many machine learning algorithms have been around for a long time, the ability to automatically apply complex mathematical calculations to big data – over and over, faster and faster – is a recent development.</p>

        <p>Posted in <a href="#">CSRDC Nepal</a> | <a href="#">1 Comment &raquo;</a></p>
        <p>&nbsp;</p>
        <h2>What is Data Science ?</h2>
        <p><small>June 24th, 2016  by XYZ </small></p>
        <p>There is significant and growing demand for data-savvy professionals in businesses, public agencies, and nonprofits. The supply of professionals who can work effectively with data at scale is limited, and is reflected by rapidly rising salaries for data engineers, data scientists, statisticians, and data analysts. </p>
        <p>A recent study by the McKinsey Global Institute concludes, "a shortage of the analytical and managerial talent necessary to make the most of Big Data is a significant and pressing challenge (for the U.S.)." The report estimates that there will be four to five million jobs in the U.S. requiring data analysis skills by 2018, and that large numbers of positions will only be filled through training or retraining. The authors also project a need for 1.5 million more managers and analysts with deep analytical and technical skills "who can ask the right questions and consume the results of analysis of big data effectively."</p>
        <p>Posted in <a href="#">CSRDC Nepal</a> | <a href="#">23 Comment &raquo;</a></p>
      </div>
      <div id="colTwo">
        <ul>
          <li>
            <form method="get" action="#">
              <div>
                <fieldset>
                  <input id="search" type="text" name="search" placeholder="Search"  style = "background-color : #FAFAFA"/>
                </fieldset>
              </div>
            </form>
          </li>
          <li>
            <h2>Recent Posts</h2>
            <ul style="list-style-type:disc">
              <li><a href="#">What is Machine Learning?</a></li>
              <li><a href="#">What is Data Science ?</a></li>
            </ul>
          </li>
          <li>
            <h2>Archives</h2>
            <ul style="list-style-type:disc">
              <li><a href="#">June 2016</a></li>
              <li><a href="#">May 2016</a></li>
              <li><a href="#">April 2016</a></li>
              <li><a href="#">March 2016</a></li>
              <li><a href="#">February 2016</a></li>
              <li><a href="#">January 2016</a></li>
            </ul>
          </li>
          <li>
            <h2>Categories</h2>
            <ul style="list-style-type:disc">
              <li><a href="#">Machine Learning</a></li>
              <li><a href="#">Data Science</a></li>
              <li><a href="#">Big Data Analystics</a></li>
              <li><a href="#">Functional Programming</a></li>
            </ul>
          </li>
        </ul>
      </div>
      <div style="clear: both;">&nbsp;</div>
    </div>

  """),_display_(/*70.4*/footer()),format.raw/*70.12*/("""
"""),format.raw/*71.1*/("""</body>
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
object blog extends blog_Scope0.blog
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/blog.scala.html
                  HASH: 3d9cb7eefd4f6717e56be060f01b43623ce8dc9f
                  MATRIX: 607->0|851->219|880->228|909->232|937->240|970->246|4835->4085|4864->4093|4892->4094
                  LINES: 25->1|32->8|32->8|33->9|33->9|35->11|94->70|94->70|95->71
                  -- GENERATED --
              */
          