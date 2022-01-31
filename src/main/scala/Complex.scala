package me.study.scala

/**
 * Scala 에는 클래스에 인자를 가질 수 있다.
 * 생성자 같은 느낌으로 봐도 좋겠다.
 */
class Complex(real: Double, imaginary: Double) {
  // 아래 메서드에는 반환 타입을 생략했는데, 추측 가능하기 때문이다.
  // 메서드이지만, () 까지 생략할 수 있다. getter 같은 느낌인가?
  def re = real
  def im = imaginary

  // Scala의 모든 클래스는 scala.AnyRef 를 상속받는다. (마치 Java에서 Object를 상속받듯)
  // 따라서 toString 을 오버라이딩 할 수 있는데, 반드시 override 키워드를 붙여줘야 한다.
  override def toString: String = "" + re + (if (im >= 0) "+" else "") + im + "i"
}
