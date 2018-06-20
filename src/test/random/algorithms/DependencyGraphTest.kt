package random.algorithms

import org.junit.jupiter.api.Test

internal class DependencyGraphTest {

  @Test
  fun find() {
  }

  @Test
  fun addAll() {
    val inserts = listOf(InsertRequest("A", listOf("B", "C")), InsertRequest("B", listOf("C")), InsertRequest("C", listOf()))
    val graph = DependencyGraph()
    graph.addAll(inserts)
    println(graph)

  }
}