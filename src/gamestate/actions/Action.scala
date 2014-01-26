package gamestate.actions

import gamestate.GameState

trait Action {
  def process(gs: GameState): Unit;
}