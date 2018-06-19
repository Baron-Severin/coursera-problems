package algorithmic.toolbox.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CollectingSignaturesKtTest {

  @Test
  fun signatures() {
    var times = listOf(
        TimeSpan(1, 3),
        TimeSpan(2, 5),
        TimeSpan(3, 6)
    )
    assertEquals(listOf(3), signatures(times))

    times = listOf(
        TimeSpan(4, 7),
        TimeSpan(1, 3),
        TimeSpan(2, 5),
        TimeSpan(5, 6)
    )
    assertEquals(listOf(3, 6), signatures(times))
  }
}