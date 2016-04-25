package net.kinzal.controllers

trait TestController extends Controller {

  hear("test1") { msg =>
    msg.send("aaa")
  }

  hear("test2") { msg =>
    msg.send("bbb")
  }

  respond("test3") { msg =>
    msg.send("ccc")
  }
}
