package dng.unionfind

case class QuickFind(size: Int) extends UnionFind {
  val items = Array.ofDim[Int](size)
  initArray()

  def connected(p: Int, q: Int): Boolean = { items(p) == items(q) }

  def union(p: Int, q: Int): Unit = {
    val pValue = items(p)
    val qValue = items(q)
    if (pValue != qValue) {
      items.indices.foreach { x => if (items(x) == pValue) items(x) = qValue }
    }
  }
}
