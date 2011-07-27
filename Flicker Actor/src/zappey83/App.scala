package zappey83

import scala.swing.SimpleSwingApplication
import scala.swing.Panel
import scala.swing.Swing
import scala.swing.MainFrame
import scala.swing.GridPanel
import java.awt.Color
import java.awt.Rectangle
import java.awt.Dimension
import java.awt.LayoutManager
import scala.swing.Component

object App extends SimpleSwingApplication {
  val X = 100
  val Y = 100
  val W = 300
  val H = 300
  def top = new MainFrame {
    title = "Flicker Actor"
    contents = new GridPanel(X, Y) {
      for {
        y <- 0 to (Y - 1)
        x <- 0 to (X - 1)
      } contents += new Panel {
        val c = (x + y * X) * 255 / (X * Y)
        background = new Color(255-c, c, 255-c)
        peer.setPreferredSize(new Dimension(W/X,H/Y))
      }
    }

    val actorArray = Array.ofDim[FlickerActor](X, Y)
    val flicker = (x: Int, y: Int) => {
      //      val x = ax 
    }
  }
}