package net.kinzal.controllers

import scala.scalajs.js

import com.github.hubot._
import scala.language.implicitConversions

trait Controller {
  implicit def convert(s: String): js.RegExp = js.RegExp(s)

  def _robot: Robot

  def hear(pattern: js.RegExp)(callback: Message => Unit) = _robot.hear(pattern, callback)
  def respond(pattern: js.RegExp)(callback: Message => Unit) = _robot.respond(pattern, callback)
}
