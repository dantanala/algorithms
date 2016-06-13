package dng.unionfind

object Main extends App {
  val size = 10
  val qFind: UnionFind = QuickFind(size)
  qFind.execute()

  val qUnion: UnionFind = QuickUnion(size)
  qUnion.execute()
}