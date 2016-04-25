package com.github.hubot

import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
trait Message extends js.Object {
  def send(message: String): Unit;
  def reply(message: String): Unit;
  def emote(message: String): Unit;
}