package random.algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class DependencyGraphTest {

  @Test
  fun addAll() {
    var inserts = listOf(InsertRequest("A", listOf("B", "C")), InsertRequest("B", listOf("C")), InsertRequest("C", listOf()))
    DependencyGraph(inserts).toString().expect(
        'C' before listOf('B', 'A'),
        'B' before 'A'
    )

    inserts = listOf(
        InsertRequest("A", listOf("C", "D", "I")),
        InsertRequest("B", listOf("F", "G")),
        InsertRequest("C", listOf("E", "I")),
        InsertRequest("D", listOf("E")),
        InsertRequest("E", listOf("I")),
        InsertRequest("F", listOf("G", "H")),
        InsertRequest("G", listOf("I")),
        InsertRequest("H", listOf()),
        InsertRequest("I", listOf())
    )
    DependencyGraph(inserts).toString().expect(
        'I' before listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'),
        'H' before listOf('F', 'B'),
        'G' before listOf('F', 'B'),
        'F' before 'B',
        'E' before listOf('C', 'D', 'A'),
        'C' before 'A',
        'D' before 'A'
    )
  }

  data class BeforeAfter(val before: Char, val after: List<Char>)
  private infix fun Char.before(after: List<Char>): BeforeAfter {
    return BeforeAfter(this, after)
  }
  private infix fun Char.before(after: Char): BeforeAfter {
    return BeforeAfter(this, listOf(after))
  }

  private fun String.expect(vararg pairs: BeforeAfter) {
    pairs.forEach { beforeAfter ->
      val beforeIndex = this.indexOf(beforeAfter.before)
      val afterIndexes = beforeAfter.after.map { Pair(it, this.indexOf(it)) }
      afterIndexes.forEach { after ->
        assertTrue(beforeIndex < after.second,
        "Expected ${beforeAfter.before} (index $beforeIndex) before ${after.first} (index ${after.second})" +
            "\nGraph: $this")
      }
    }
  }
}
