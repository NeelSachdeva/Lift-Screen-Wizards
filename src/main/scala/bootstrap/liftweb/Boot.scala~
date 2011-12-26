package bootstrap.liftweb

import net.liftweb._
import common.{Loggable, Full}
import http._
import auth.{userRoles, HttpBasicAuthentication, AuthRole}
import sitemap.Loc.{LocGroup, If}

import sitemap.LocPath._
import sitemap.{SiteMap, Menu}
import util.NamedPF


//import util.AnyVarTrait._
import net.liftweb.common

//import sitemap.MenuSingleton._

import widgets.autocomplete.AutoComplete
//import XYZ.db.NeelDB

//import sitemap.MenuSingleton._
//
//import sitemap.{SiteMap, Menu, Loc}
//import util.{NamedPF}
import net.liftweb.widgets.flot._


class Boot extends Loggable {
  def boot {


    


    //  def displaySometimes_? : Boolean =
    //    (millis / 1000L / 60L) % 2 == 0

    //  AutoComplete.init()

    // where to search snippet
    LiftRules.addToPackages("XYZ")

    // build sitemap
    val entries = List(Menu("Home") / "index",
      Menu("Hello World") / "helloworld",
      Menu("View First") / "ViewFirst" >> LocGroup("bottom"),
      Menu("MenuTest") / "menutest" submenus(
        Menu("  +++Submenu 1") / "blahpage",
        Menu("  +++Submenu 2") / "blahpage1"
        ),
      
      Menu("***Register Employee (Screen)***") / "register",
      Menu("***Employee Details (Wizard)***") / "detail"
      
    ) :::
      Nil

    // val entries1 = List(Menu("Home1") / "register" ):::Nil

    LiftRules.uriNotFound.prepend(NamedPF("404handler") {
      case (req, failure) => NotFoundAsTemplate(
        ParsePath(List("exceptions", "404"), "html", false, false))
    })

    LiftRules.setSiteMap(SiteMap(entries: _*))


    // set character encoding
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))


  }
}
