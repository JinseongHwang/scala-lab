package me.study.scala

/**
 * Scala의 특징으로, Java의 클래스를 import 해서 간단히 사용할 수 있다.
 * import 할 때, * 또는 _ 로 해당 패키지에 속하는 모든 클래스를 한 번에 가져올 수 있다.
 */
import java.text.DateFormat._
import java.util.{Date, Locale}

object FrenchDate {

  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)

    /**
     * 오직 함수의 인자 하나만을 가지는 함수는 아래와 같이 표현 가능하다.
     * df.format(now) -> df format now
     */
    println(df format now)
  }
}
