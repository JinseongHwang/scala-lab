package me.study.scala

/**
 * >>> case class 특징
 * - 인스턴스 생성 시 new 키워드 생략 가능. new Const(5) -> Const(5)
 * - 생성자 파라미터에 대한 getter가 자동 생성됨. Const의 인스턴스 c의 파라미터 v에 접근하고 싶다면 c.v
 * - equals와 hashCode도 자동 생성됨. 레퍼런스의 동등함을 검증하기 보단 구조의 동등함을 검증하는 데 중점. 레퍼런스가 다르더라도 생성 시 파라미터가 동일하다면 같은 것으로 여김.
 * - toString도 자동 생성됨. 단, "값이 생성될 때"의 형태를 출력함. x+1을 출력한다면, Sum(Var(x) + Const(1))
 */
abstract class Tree {

  case class Sum(l: Tree, r: Tree) extends Tree

  case class Var(n: String) extends Tree

  case class Const(v: Int) extends Tree

  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }
}
