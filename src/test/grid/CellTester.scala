package test.grid

import java.awt.{Transparency, Graphics2D, Color}
import javax.swing.{JPanel, JFrame}
import drawables.map.cell.PlainCell
import java.awt.image.BufferedImage

/**
 * A tester program testing how a Cell draws based on angles and height.
 */
object CellTester extends App {
  val mf = new JFrame("Cell Test")
  mf.setLayout(null)
  mf.setVisible(true)
  mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  mf.setBounds(0, 0, 500, 500)

  val pan = new JPanel()
  val width = mf.getWidth - mf.getInsets.left - mf.getInsets.right
  val height = mf.getHeight - mf.getInsets.top - mf.getInsets.bottom
  pan.setLayout(null)
  pan.setBounds(0, 0, width, height)
  pan.setVisible(true)
//  pan.setBackground(Color.blue)
  mf.add(pan)

  val cell = new PlainCell(5)

  val buff = new BufferedImage(pan.getWidth, pan.getHeight, Transparency.TRANSLUCENT)
  val g = buff.createGraphics
  while (mf.isActive) {
    g.clearRect(0, 0, buff.getWidth, buff.getHeight)
    g.setColor(Color.red)
    g.drawRect(5, 5, 400, 400)
    cell.draw(g)
    cell.rotAngle += 0.0003
    pan.getGraphics.drawImage(buff, 0, 0, null)
  }

}
