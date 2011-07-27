package zappey83

import scala.actors.Actor
import scala.actors.Actor._
case class Signal(ratio: Double)
class FlickerActor(val name: String, val flicker: Unit => Unit) extends Actor {
  def act() = {
    loop {
      react {
        case Signal(ratio) =>
          println("Actor(" + name + ") received a signal.")
          if (Math.random < ratio) {
            println("Actor(" + name + ") flikered.")
            actor {
              flicker()
            }
          }
      }
    }
  }
}