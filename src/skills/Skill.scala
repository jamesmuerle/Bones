package skills

import skills.properties.{Effect, Target}
import gamestate.GameState

/**
 * Created by James on 1/11/14.
 */
trait Skill {
  val name: String
  def processSkill(state: GameState): Unit
}

class SimpleSkill(
  override val name: String,
  val target: Target,
  val effects: List[Effect]) extends Skill {
  override def processSkill(state: GameState): Unit = {
    // TODO
    // prompt for a target
    // apply the effects
  }
}