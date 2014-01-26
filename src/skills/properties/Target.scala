package skills.properties

import drawables.map.grid.GridDirection.Direction
import drawables.map.cell.Cell
import gamestate.GameState
import skills.SkillRange

/**
 * Created by James on 1/11/14.
 */
class Target(val range: SkillRange) {
  def getLegalTargets(gamestate: GameState, source: Cell): List[Cell] = {
    null // TODO
  }
}