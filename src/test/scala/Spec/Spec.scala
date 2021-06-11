package Spec

import Main.scala

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class Spec extends AnyFlatSpec with should.Matchers {

  "Compress" should "compress properly" in {
    scala.compress("aaaabbbccdbb") shouldEqual "a4b3c2db2"
  }

  "Compress" should "compress properly and handle the last n characters" in {
    scala.compress("aaaabbbccdd") shouldEqual "a4b3c2d2"
  }
  "Compress" should "handle single characters" in {
    scala.compress("aaaabccdd") shouldEqual "a4bc2d2"
  }
}