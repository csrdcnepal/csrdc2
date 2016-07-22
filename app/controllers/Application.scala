package controllers

import javax.inject._

import play.api.Play.current
import play.api.data.Forms._
import play.api.data._
import play.api.db._
import play.api.i18n.Messages.Implicits._
import play.api.mvc._
import models.Contact
import org.h2.message.DbException



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class Application @Inject()(db: Database) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index(loginForm))
  }


  def blog = Action {
    Ok(views.html.blog())
  }

  def add(contact: Contact) {
      try{
    
      val conn = db.getConnection()

     

      val query = "INSERT INTO contactTable(name, email, subject, message) " +
        "VALUES(?,?,?,?)"
      
      
      val query1 = "CREATE DATABASE IF NOT EXISTS csrdcdb"
      val query2 = "CREATE TABLE IF NOT EXISTS contactTable(name varchar(255), email varchar(255), subject varchar(255), message text)"
        
    try {
        val stmt1 = conn.createStatement()
        val stmt2 = conn.createStatement()
        stmt1.execute(query1)
        stmt2.execute(query2)
        val stmt = conn.prepareStatement(query)
        stmt.setString(1, contact.name)
        stmt.setString(2, contact.email)
        stmt.setString(3, contact.subject)
        stmt.setString(4, contact.message)
        stmt.execute()
        
      } finally {
        conn.close()
      }
      }catch{
          case e: Exception =>
          Ok(e.getMessage())
      }
    } 



  val loginForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> email,
      "subject" -> nonEmptyText,
      "message" ->nonEmptyText
    )(Contact.apply)(Contact.unapply)
  )

  def handleForm = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest("Error in submitting form. Check the input values"),
      contact => {
        Application.this.add(contact)
        Ok(views.html.index(loginForm))
      })

  }



}
