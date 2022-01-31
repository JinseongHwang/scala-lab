package me.study.scala

object ComplexNumbers {

  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("imaginary part : " + c.im) // 클래스 멤버 선언 시 ()를 생략했다면, 사용할 때도 빼자.
    println(c) // toString 을 재정의했기 때문
  }
}
