
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Contact],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm : Form[Contact])(implicit messages : Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.bootstrap3._

Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
        <!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
        <!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"> <![endif]-->
        <!--[if IE 8]><html class="no-js lt-ie9"> <![endif]-->
        <!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">

        <title>Computer Science Research and Development Center Nepal.</title>
        <meta name="description" content="CSRDC Nepal">
        <meta name="viewport" content="width=device-width">

    </head>
    <body>


        """),_display_(/*21.10*/imports()),format.raw/*21.19*/("""
        """),_display_(/*22.10*/header()),format.raw/*22.18*/("""
        

        """),_display_(/*25.10*/services()),format.raw/*25.20*/("""

        """),_display_(/*27.10*/career()),format.raw/*27.18*/("""

        """),_display_(/*29.10*/about()),format.raw/*29.17*/("""

        """),format.raw/*31.9*/("""<script>
        function initMap() """),format.raw/*32.28*/("""{"""),format.raw/*32.29*/("""
        """),format.raw/*33.9*/("""var myLatLng = """),format.raw/*33.24*/("""{"""),format.raw/*33.25*/("""lat: 27.6844899, lng: 85.3353435"""),format.raw/*33.57*/("""}"""),format.raw/*33.58*/(""";

        var map = new google.maps.Map(document.getElementById('map'), """),format.raw/*35.71*/("""{"""),format.raw/*35.72*/("""
          """),format.raw/*36.11*/("""zoom: 18,
          center: myLatLng
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""");

        var marker = new google.maps.Marker("""),format.raw/*40.45*/("""{"""),format.raw/*40.46*/("""
          """),format.raw/*41.11*/("""position: myLatLng,
          map: map,
          title: 'CSRDC Nepal'
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""");
      """),format.raw/*45.7*/("""}"""),format.raw/*45.8*/("""
    """),format.raw/*46.5*/("""</script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA5Z4OESfIjhx4NOlKmK4L8ScANrnBi8YU&callback=initMap">
    </script>

        <div id="contact" class="content-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h1 class="section-title">Contact Us</h1>
                    </div> <!-- /.col-md-12 -->
                </div> <!-- /.row -->
                <div class="row">
                    <div class="col-md-offset-2 col-md-8 text-center bigger-text">
                        <p>Computer Science Research and Development Center is located at Shankhamul - 34, Kathmandu, Nepal. </p>
                        <br>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <div id="map">
                            <span class="glyphicon glyphicon-map-marker"></span> Shankhamul, Kathmandu &nbsp;&nbsp;
                        </div>
                    </div> <!-- /.col-md-6 -->
                    <div class="col-md-6 col-sm-6">

                    """),_display_(/*70.22*/helper/*70.28*/.form(action=routes.Application.handleForm())/*70.73*/{_display_(Seq[Any](format.raw/*70.74*/("""

                        """),format.raw/*72.25*/("""<fieldset>
                                <!-- Name -->
                            """),_display_(/*74.30*/text(loginForm("name"),
                                label = "Name",
                                placeholder = "Name",
                                help = "Please enter your name. (required)")),format.raw/*77.77*/("""

                                """),format.raw/*79.33*/("""<!-- Email -->
                            """),_display_(/*80.30*/text(loginForm("email"),
                                label = "Email",
                                placeholder = "Email",
                                help = "Enter a valid email address. (required)")),format.raw/*83.82*/("""

                                """),format.raw/*85.33*/("""<!-- Subject -->
                            """),_display_(/*86.30*/text(loginForm("subject"),
                                label = "Subject",
                                placeholder = "Subject",
                                help = "Enter the subject. (required)")),format.raw/*89.72*/("""

                                """),format.raw/*91.33*/("""<!-- Message -->
                            """),_display_(/*92.30*/textarea(loginForm("message"),
                                rows = "4",
                                label = "Message",
                                placeholder = "Message",
                                help = "Enter the message. (required)")),format.raw/*96.72*/("""


                            """),format.raw/*99.29*/("""<div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
                                </div>
                            </div>
                        </fieldset>
                    """)))}),format.raw/*105.22*/("""



                    """),format.raw/*109.21*/("""</div> <!-- /.col-md-6 -->
                </div> <!-- /.row -->
            </div> <!-- /.container -->
        </div> <!-- /#contact us -->

        """),_display_(/*114.10*/footer()),format.raw/*114.18*/("""

    """),format.raw/*116.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(loginForm:Form[Contact],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(messages)

  def f:((Form[Contact]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (messages) => apply(loginForm)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Jul 22 10:39:11 NPT 2016
                  SOURCE: /home/ujjwal/Downloads/csrdc2-master/app/views/index.scala.html
                  HASH: fd60c98fb43371a93330e3fde6d03c5bf8284600
                  MATRIX: 543->1|725->58|752->91|779->92|1384->670|1414->679|1451->689|1480->697|1527->717|1558->727|1596->738|1625->746|1663->757|1691->764|1728->774|1792->810|1821->811|1857->820|1900->835|1929->836|1989->868|2018->869|2119->942|2148->943|2187->954|2259->999|2288->1000|2364->1048|2393->1049|2432->1060|2538->1139|2567->1140|2603->1149|2631->1150|2663->1155|3842->2307|3857->2313|3911->2358|3950->2359|4004->2385|4117->2471|4340->2673|4402->2707|4473->2751|4704->2961|4766->2995|4839->3041|5066->3247|5128->3281|5201->3327|5476->3581|5535->3612|5920->3965|5973->3989|6153->4141|6183->4149|6217->4155
                  LINES: 20->1|25->1|26->3|27->4|44->21|44->21|45->22|45->22|48->25|48->25|50->27|50->27|52->29|52->29|54->31|55->32|55->32|56->33|56->33|56->33|56->33|56->33|58->35|58->35|59->36|61->38|61->38|63->40|63->40|64->41|67->44|67->44|68->45|68->45|69->46|93->70|93->70|93->70|93->70|95->72|97->74|100->77|102->79|103->80|106->83|108->85|109->86|112->89|114->91|115->92|119->96|122->99|128->105|132->109|137->114|137->114|139->116
                  -- GENERATED --
              */
          