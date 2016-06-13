package dng.unionfind

case class QuickUnion(size: Int) extends UnionFind {
  val items = Array.ofDim[Int](size)
  initArray()

  def connected(p: Int, q: Int): Boolean = {
    root(p) == root(q)
  }

  def union(p: Int, q: Int): Unit = {

    val pRoot = root(items(p))
    val qRoot = root(items(q))

    if (pRoot != qRoot)
      items(pRoot) = qRoot
  }

  def root(p: Int): Int = {
    val item = items(p)
    if (item == p) item
    else
      root(item)
  }

}