package skills.properties

import gamestate.GameState
import drawables.map.cell.Cell

/**
 * An Area is an area of effect of a skill.
 * The required method is one that given a gamestate, an origin cell, and a target cell, returns a list of cells
 * that are in the area of effect.
 * Created by James on 1/14/14.
 */
trait Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell]
}

case class LineArea(length: Int) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}
case class ConeArea(length: Int) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}
case class SquareArea(dim: Int, diag: Boolean) extends Area {
  def getCells(gamestate: GameState, origin: Cell, target: Cell): List[Cell] = {
    null // TODO
  }
}