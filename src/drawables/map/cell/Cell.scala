package drawables.map.cell

import drawables.Drawable
import java.awt.{Shape, Graphics2D, Color}
import java.awt.geom.Point2D

trait Cell extends Drawable {
  val height: Int
  val length: Int = 40
  var center: Point2D.Double = new Point2D.Double(150, 150)
  val viewAngle: Double = Math.PI / 6
  var rotAngle: Double = 0
  implicit def double2Int(d: Double): Int = Math.round(d).asInstanceOf[Int]
  def draw(g: Graphics2D): Unit = {
    g.setColor(Color.red)
    val vertexList = vertices
    for (i <- 0 until vertexList.length) {
      if (i == 0) {
        g.drawLine(vertexList.last.x, vertexList.last.y, vertexList(i).x, vertexList(i).y)
      }
      else {
        g.drawLine(vertexList(i - 1).x, vertexList(i - 1).y, vertexList(i).x, vertexList(i).y)
      }
    }
  }
  def vertices: List[Point2D.Double] = {
    val minorAxis = Math.sin(viewAngle) * diagonal
    val majorAxis = diagonal
    val multiplier = majorAxis / minorAxis
    val angles: List[Double] = List(
      rotAngle % (2 * Math.PI),
      (rotAngle + Math.PI/2) % (2 * Math.PI),
      (rotAngle + Math.PI) % (2 * Math.PI),
      (rotAngle + 3*Math.PI/2) % (2 * Math.PI)
    )
    var i = -1
    val angleList = angles.map(a => {
      i += 1
      val ans = Math.atan(Math.tan(a) * multiplier)
      if (i >= 2) ans + Math.PI
      else ans
    })
    for (angle <- angleList)
    yield {
      val cos = Math.cos(angle)
      val sin = Math.sin(angle)
      val numer = diagonal * diagonal * Math.sin(viewAngle)
      val denom = Math.sqrt(Math.pow(Math.sin(viewAngle) * diagonal * cos, 2) +
                            Math.pow(Math.sin(viewAngle) * diagonal, 2))
      val r = numer / denom
      new Point2D.Double(center.x + sin*r, center.y + cos*r)
    }
  }
  def diagonal: Double = length * Math.sqrt(2)
}

case class NonCell extends Cell {
  val height: Int = 0
  override def draw(g: Graphics2D): Unit = {
    // noop
  }
}