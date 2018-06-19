package algorithmic.toolbox.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MoneyChangeKtTest {

  @Test
  fun moneyChange() {
    assertEquals(1, moneyChange(1))
    assertEquals(2, moneyChange(2))
    assertEquals(1, moneyChange(5))
    assertEquals(2, moneyChange(6))
    assertEquals(6, moneyChange(28))
  }
}