package algorithmic.toolbox.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class GreatestCommonDivisorKtTest {

  @Test
  fun gcd() {
    assertEquals(1, gcd(18, 35))
    assertEquals(17657, gcd(28851538, 1183019))
  }
}
