package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {
    //index według template'u => https://www.playframework.com/documentation/1.2/controllers
	//what is 'Ok' => https://www.playframework.com/documentation/2.0/ScalaResults
	//to co zwróci funkcja DBAction to nasza strona
	//Wszystkie nasze "controlery" musza być zdefiniowane w conf/routes
	//"Todos"=> message, Lista, Form
	//https://www.playframework.com/documentation/2.4.0-M2/api/scala/index.html#play.api.db.slick.DBAction$ <= świetnie wytłumaczone
	//https://github.com/playframework/play-slick/wiki/Usage <= tu też
	//Use the DBAction when you want to use the default settings in your controller.
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  //client uses the uniform API provided by the HTTP protocol to manipulate these resources, and by implication the underlying business logic
  //This is precisely the role played by the Controller layer: providing a glue between the domain model objects and transport layer events.

}
