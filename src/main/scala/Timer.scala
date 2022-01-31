package me.study.scala

object Timer {

  /**
   * Unit 타입은 C/C++ 에서의 void 타입과 비슷하다.
   * () => Unit 은 인자를 받지 않고, 반환도 하지 않는 것을 의미한다.
   */
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep 1_000
    }
  }

  def timeFiles(): Unit = {
    // Scala에서의 println은 Java의 System.out 에 정의된 메서드와는 다르다.
    println("time files like an arrow")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFiles)
  }
}
