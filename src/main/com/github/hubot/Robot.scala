package com.github.hubot

import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
trait Robot extends js.Object {
  def hear(pattern: js.RegExp, callback: js.Function1[Message, Unit]): Unit;
  def respond(pattern: js.RegExp, callback: js.Function1[Message, Unit]): Unit;
}
