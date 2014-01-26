package skills.properties

import gamestate.GameState
import drawables.map.cell.Cell

/**
 * Created by James on 1/14/14.
 */
trait Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell]
}

case class LineArea(val length: Int) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}
case class ConeArea(val length: Int) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}
case class SquareArea(val dim: Int, val diag: Boolean) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}