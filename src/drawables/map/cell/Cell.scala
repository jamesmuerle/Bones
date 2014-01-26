package drawables.map.cell

import drawables.Drawable

trait Cell extends Drawable {
  val height: Int;
}

case class NonCell extends Cell {
  val height: Int = 0;
  def draw(): Unit = {
    // noop
  }
}