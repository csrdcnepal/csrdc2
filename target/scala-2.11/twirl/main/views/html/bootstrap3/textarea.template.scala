
package views.html.bootstrap3

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textarea_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.109*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <textarea class="form-control"
                rows=""""),_display_(/*7.24*/rows),format.raw/*7.28*/("""" 
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/("""" 
                name=""""),_display_(/*9.24*/field/*9.29*/.name),format.raw/*9.34*/("""" 
                placeholder=""""),_display_(/*10.31*/placeholder),format.raw/*10.42*/("""" 
                >"""),_display_(/*11.19*/field/*11.24*/.value.getOrElse("")),format.raw/*11.44*/("""</textarea>
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/("""</span>
      <span class="help-block">"""),_display_(/*13.33*/{field.error.map { error => error.message }}),format.raw/*13.77*/("""</span>
    </div>
  </div>
"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help) => apply(field,rows,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object textarea extends textarea_Scope0.textarea
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 09:49:17 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/bootstrap3/textarea.scala.html
                  HASH: d29eb6272a4c2b4580ec7e35dadc6f89b709939c
                  MATRIX: 571->1|774->108|804->112|854->136|881->155|920->157|960->167|1032->213|1057->218|1180->315|1204->319|1254->343|1267->348|1290->351|1342->377|1355->382|1380->387|1440->420|1472->431|1520->452|1534->457|1575->477|1646->521|1671->525|1738->565|1803->609
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|27->3|28->4|28->4|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|35->11|35->11|35->11|36->12|36->12|37->13|37->13
                  -- GENERATED --
              */
          