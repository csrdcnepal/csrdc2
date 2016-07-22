
package views.html.bootstrap3

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object text_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <input type="text" 
             class="form-control" 
             id=""""),_display_(/*8.19*/field/*8.24*/.id),format.raw/*8.27*/("""" 
             name=""""),_display_(/*9.21*/field/*9.26*/.name),format.raw/*9.31*/("""" 
             value=""""),_display_(/*10.22*/field/*10.27*/.value.getOrElse("")),format.raw/*10.47*/(""""
             placeholder=""""),_display_(/*11.28*/placeholder),format.raw/*11.39*/("""" />
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/("""</span>
      <span class="help-block">"""),_display_(/*13.33*/{field.error.map { error => error.message }}),format.raw/*13.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object text extends text_Scope0.text
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/bootstrap3/text.scala.html
                  HASH: 5a0552da92d1be06c550a1c9db0642476b3d4127
                  MATRIX: 556->1|738->88|768->92|818->116|845->135|884->137|924->147|996->193|1021->198|1163->314|1176->319|1199->322|1248->345|1261->350|1286->355|1337->379|1351->384|1392->404|1448->433|1480->444|1544->481|1569->485|1636->525|1701->569
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|27->3|28->4|28->4|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13
                  -- GENERATED --
              */
          