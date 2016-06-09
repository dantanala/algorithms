package dng.unionfind

object Main extends App {
  def calculateQuickFind(size: Int) {
    val uf: UnionFind = QuickFind(size)
    uf.executeUnionFind()
  }
  
  calculateQuickFind(10)
}