package gamestate.actions

import gamestate.GameState

trait AttackEffectAction extends Action

class DamageAction extends AttackEffectAction {
  def process(gs: GameState): Unit = {
    //TODO
  }
}

class StatusAction extends AttackEffectAction {
  def process(gs: GameState): Unit = {
    //TODO
  }
}