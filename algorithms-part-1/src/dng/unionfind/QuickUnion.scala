package dng.unionfind

case class QuickUnion(size: Int) extends UnionFind {
  val items = Array.ofDim[Int](size)

  def connected(p: Int, q: Int): Boolean = {
    true
  }

  def union(p: Int, q: Int): Unit = {

  }
}