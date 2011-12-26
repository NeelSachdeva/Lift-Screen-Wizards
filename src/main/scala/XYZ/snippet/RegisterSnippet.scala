package XYZ.snippet

import net.liftweb.http.{S, LiftScreen}


/**
 * Created by IntelliJ IDEA.
 * User: nsachdeva
 * Date: 29/11/11
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */

object RegisterSnippet extends LiftScreen {

  val name = field( S ? "Name", "",valMaxLen(20,S ?? "Name too large"),valMinLen(2 ,S ?? "Name too small"))
  val age = field("Age", 0, minVal(18, "Too young to work"),maxVal(40,"Too old to register"))
  val phone = field("Phone", "")
  val DOJ = field("DOJ", "")
  val address = field("Address", "")
  val post = select("Select", "Engineer", List("Engineer", "Developer", "Managing Director", "Founder"))

  def finish() {

    S.notice("Name:" + name)
    S.notice("Age:" + age)
    S.notice("Phone:" + phone)
    S.notice("Doj:" + DOJ)
    S.notice("Address:" + address)
    S.notice("Post:" + post)
    S.redirectTo("/register")
  }

}