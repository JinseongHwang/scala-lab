package me.study.scala

/**
 * object는 싱글턴 객체를 선언과 동시에 생성하는 것이다.
 */
object HelloWorld {

  /**
   * Java와 달리 main 메서드가 static이 아니다.
   * Scala에서는 static 이 존재하지 않는다.
   * static이길 기대하는 멤버들은 싱글턴 객체 안에 선언한다.
   */
  def main(args: Array[String]): Unit = {
    println("Hello, World")
  }
}
