package me.study.scala

object TimerAnonymous {

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep 1_000
    }
  }

  /**
   * oncePerSecond 메서드에서만 호출될 함수를 따로 정의하는 것은 코드 낭비일 수도 있다.
   * 그냥 전달되는 그 순간 함수가 생성되도록 해보자
   */
  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}
