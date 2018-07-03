package leetcode.day12

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _72_EditDistanceKtTest {

  @Test fun one() {
    assertEquals(2, minDistance("cat", "ata"))
  }

  @Test fun two() {
    assertEquals(3, minDistance("ros", "horse"))
  }

  @Test fun three() {
    assertEquals(5, minDistance("intention", "execution"))
  }

  @Test fun four() {
    assertEquals(0, minDistance("", ""))
  }

  @Test fun five() {
    assertEquals(3, minDistance("", "abc"))
  }

  @Test fun six() {
    assertEquals(2, minDistance("a", "abc"))
  }

}