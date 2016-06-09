package dng.unionfind

trait UnionFind {
  val items: Array[Int]

  def initArray(): Unit = {
    items.indices.foreach { x => items(x) = x }
  }

  def connected(p: Int, q: Int): Boolean

  def union(p: Int, q: Int): Unit

  def print() = println(items.mkString("|"))

  def executeUnionFind(): Unit = {
    union(4, 3);
    union(3, 8);
    union(6, 5);
    union(9, 4);
    union(2, 1);
    union(5, 0);
    union(7, 2);
    union(6, 1);
    union(7, 3);
    print()
    println(connected(1, 2))
  }
}