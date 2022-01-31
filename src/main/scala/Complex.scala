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
}
