package random.algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ParserTest {

  @Test
  fun one() {
    val parser = Parser("[{}]")
    assertTrue { parser.test() }
  }

  @Test fun two() {
    val parser = Parser("[}]")
    assertFalse { parser.test() }
  }

  @Test fun three() {
    val parser = Parser("[{]")
    assertFalse { parser.test() }
  }

  @Test fun four() {
    val parser = Parser("[{]}")
    assertFalse { parser.test() }
  }


}