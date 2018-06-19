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

    times = listOf(
        TimeSpan(41, 42),
        TimeSpan(52, 52),
        TimeSpan(63, 63),
        TimeSpan(80, 82),
        TimeSpan(78, 79),
        TimeSpan(35, 35),
        TimeSpan(22, 23),
        TimeSpan(31, 32),
        TimeSpan(44, 45),
        TimeSpan(81, 82),
        TimeSpan(36, 38),
        TimeSpan(10, 12),
        TimeSpan(1, 1),
        TimeSpan(23, 23),
        TimeSpan(32, 33),
        TimeSpan(87, 88),
        TimeSpan(55, 56),
        TimeSpan(69, 71),
        TimeSpan(89, 91),
        TimeSpan(93, 93),
        TimeSpan(38, 40),
        TimeSpan(33, 34),
        TimeSpan(14, 16),
        TimeSpan(57, 59),
        TimeSpan(70, 72),
        TimeSpan(36, 36),
        TimeSpan(29, 29),
        TimeSpan(73, 74),
        TimeSpan(66, 68),
        TimeSpan(36, 38),
        TimeSpan(1, 3),
        TimeSpan(49, 50),
        TimeSpan(68, 70),
        TimeSpan(26, 28),
        TimeSpan(30, 30),
        TimeSpan(1, 2),
        TimeSpan(64, 65),
        TimeSpan(57, 58),
        TimeSpan(58, 58),
        TimeSpan(51, 53),
        TimeSpan(41, 41),
        TimeSpan(17, 18),
        TimeSpan(45, 46),
        TimeSpan(4, 4),
        TimeSpan(0, 1),
        TimeSpan(65, 67),
        TimeSpan(92, 93),
        TimeSpan(84, 85),
        TimeSpan(75, 77),
        TimeSpan(39, 41),
        TimeSpan(15, 15),
        TimeSpan(29, 31),
        TimeSpan(83, 84),
        TimeSpan(12, 14),
        TimeSpan(91, 93),
        TimeSpan(83, 84),
        TimeSpan(81, 81),
        TimeSpan(3, 4),
        TimeSpan(66, 67),
        TimeSpan(8, 8),
        TimeSpan(17, 19),
        TimeSpan(86, 87),
        TimeSpan(44, 44),
        TimeSpan(34, 34),
        TimeSpan(74, 74),
        TimeSpan(94, 95),
        TimeSpan(79, 81),
        TimeSpan(29, 29),
        TimeSpan(60, 61),
        TimeSpan(58, 59),
        TimeSpan(62, 62),
        TimeSpan(54, 56),
        TimeSpan(58, 58),
        TimeSpan(79, 79),
        TimeSpan(89, 91),
        TimeSpan(40, 42),
        TimeSpan(2, 4),
        TimeSpan(12, 14),
        TimeSpan(5, 5),
        TimeSpan(28, 28),
        TimeSpan(35, 36),
        TimeSpan(7, 8),
        TimeSpan(82, 84),
        TimeSpan(49, 51),
        TimeSpan(2, 4),
        TimeSpan(57, 59),
        TimeSpan(25, 27),
        TimeSpan(52, 53),
        TimeSpan(48, 49),
        TimeSpan(9, 9),
        TimeSpan(10, 10),
        TimeSpan(78, 78),
        TimeSpan(26, 26),
        TimeSpan(83, 84),
        TimeSpan(22, 24),
        TimeSpan(86, 87),
        TimeSpan(52, 54),
        TimeSpan(49, 51),
        TimeSpan(63, 64),
        TimeSpan(54, 54)
    )
    assertEquals(43, signatures(times).size)
    val answers = listOf(1, 4, 5, 8, 9, 10, 14, 15, 18, 23, 26, 28, 29, 30, 32, 34, 35, 36, 40, 41, 44, 46, 49, 52, 54,
        56, 58, 61, 62, 63, 65, 67, 70, 74, 77, 78, 79, 81, 84, 87, 91, 93, 95)
    assertEquals(answers, signatures(times))



  }
}