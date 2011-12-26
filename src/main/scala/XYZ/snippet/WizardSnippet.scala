package XYZ.snippet

import net.liftweb.wizard.Wizard
import net.liftweb.http.S

/**
 * Created by IntelliJ IDEA.
 * User: nsachdeva
 * Date: 29/11/11
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */

object WizardSnippet extends Wizard {

  val screen1 = new Screen {
    val name = field("Name", "")
    val precom = field("Previous Company", "")
    val exp = field("Experiance", "")
  }

  val screen2 = new Screen {
    val id = field("Employee ID", "")
    val position = field("Position", "")
    val Shift = field("Shift", "")
    val sex = radio("Sex", "Male", List("Male", "Female"))
    val detail = text("Details", "")
  }

  val screen3 = new Screen {
    val accept = radio("Accept The Terms", "I accept the terms", List("I accept the terms", "I do not accept the terms"))
    // val notaccept = radio("Do Not Accept","I do not accept the terms",List("I accept the terms","I do not accept the terms"))
  }

  def finish() {
    S.notice("Name:" + screen1.name)
    S.notice("ID:" + screen2.id)
    S.notice("Sex:" + screen2.sex)
    S.redirectTo("/detail")
  }


}