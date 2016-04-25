package net.kinzal

import scala.scalajs.js
import js.annotation._
import js.Dynamic.global

import net.kinzal.controllers._
import com.github.hubot._

@JSExport
object Router {

  @JSExport("apply")
  def apply(robot: Robot) = {
    new TestController {
      def _robot = robot
    }
  }

}