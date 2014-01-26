package skills.properties

import drawables.actors.Actor

/**
 * Created by James on 1/11/14.
 */
sealed trait Effect {
  def apply(actor: Actor): Unit
}

sealed trait Status extends Effect {
  val p: Double
  def apply(actor: Actor): Unit = {
    // TODO
  }
}
case class Poison(override val p: Double) extends Status
case class Disable(override val p: Double) extends Status
case class Silence(override val p: Double) extends Status
case class Immobilize(override val p: Double) extends Status
case class Regen(override val p: Double) extends Status

trait Damage extends Effect {
  val amt: Double
  def apply(actor: Actor): Unit = {
    // TODO
  }
}
case class HPDamage(override val amt: Double) extends Damage
case class MPDamage(override val amt: Double) extends Damage
